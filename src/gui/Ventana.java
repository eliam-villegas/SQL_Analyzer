package gui;

import org.antlr.runtime.*;
import org.antlr.v4.runtime.CharStreams;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import sql.*;

import java.util.List;

public class Ventana extends JFrame {


    public Ventana(final String titulo){
        setTitle(titulo);
        setSize(640,360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel_principal = new JPanel(new GridBagLayout());

        insertarComponentes(panel_principal);
        add(panel_principal);
    }

    private void insertarComponentes(final JPanel pp) {

        JPanel panelConsulta = new JPanel(new GridBagLayout());
        //panelConsulta.setBackground(Color.red);
        panelConsulta.setBorder(new EmptyBorder(10,10,10,10));

        JLabel tituloConsulta = new JLabel("Consulta:");
        panelConsulta.add(tituloConsulta,restricciones(0,0,1.0,0.05,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH));

        JTextPane campoTexto = new JTextPane();
        JScrollPane scrollConsulta = new JScrollPane(campoTexto);
        panelConsulta.add(scrollConsulta,restricciones(0,1,1,1.0,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH));

        JPanel opcionesConsulta = new JPanel(new GridBagLayout());
        opcionesConsulta.setBorder(new TitledBorder("Opciones"));

        JButton botonEvaluar = new JButton("Evaluar");
        JButton botonBorrar = new JButton("Borrar");



        opcionesConsulta.add(botonEvaluar,restricciones(0,0,1.0,0.05,1,1,GridBagConstraints.SOUTHWEST,GridBagConstraints.NONE,new Insets(5,5,20,5)));



        opcionesConsulta.add(botonBorrar,restricciones(0,0,1.0,0.05,1,1,GridBagConstraints.SOUTHWEST,GridBagConstraints.NONE,new Insets(5,100,20,5)));

        panelConsulta.add(opcionesConsulta,restricciones(0,2,1.0,0.05,1,1,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(5,5,20,5)));
        pp.add(panelConsulta,restricciones(0,0,0.5,1,1,1,GridBagConstraints.EAST,GridBagConstraints.BOTH,new Insets(10,2,2,2)));

        //panel para el resultado

        JPanel panelResultado = new JPanel(new GridBagLayout());
        panelResultado.setBorder(new EmptyBorder(5,5,5,5));

        JLabel tituloResultado = new JLabel("Resultado de analisis.");
        panelResultado.add(tituloResultado,restricciones(0,0,1.0,0.05,1,1,GridBagConstraints.WEST,GridBagConstraints.HORIZONTAL,new Insets(5,5,5,5)));

        JTextPane areaRespuesta = new JTextPane();
        areaRespuesta.setEditable(false);
        JScrollPane scrollRespuesta = new JScrollPane(areaRespuesta);
        panelResultado.add(scrollRespuesta,restricciones(0,1,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH));

        pp.add(panelResultado,restricciones(1,0,0.5,1,1,1,GridBagConstraints.WEST,GridBagConstraints.BOTH));

        botonBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFields(campoTexto, areaRespuesta);
            }
        });

        botonEvaluar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                analyzeSQL(campoTexto, areaRespuesta);
            }
        });

    }

    private void clearFields(JTextPane campoTexto, JTextPane areaRespuesta) {
        campoTexto.setText("");
        areaRespuesta.setText("");
    }

    private void analyzeSQL(JTextPane campoTexto, JTextPane areaRespuesta) {
        String query = campoTexto.getText();
        try {
            SQLgrammarLexer lexer = new SQLgrammarLexer(CharStreams.fromString(query));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SQLgrammarParser parser = new SQLgrammarParser(tokens);


            ErrorListener errorListener = new ErrorListener();
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            ParseTree tree = parser.sql();

            StyledDocument doc = areaRespuesta.getStyledDocument();

            Style colorError = areaRespuesta.addStyle("colorError", null);
            StyleConstants.setForeground(colorError, Color.RED);

            Style colorError2 = areaRespuesta.addStyle("colorError", null);
            StyleConstants.setForeground(colorError2, new Color(139,0,0));

            Style colorCorrect = areaRespuesta.addStyle("colorCorrect", null);
            StyleConstants.setForeground(colorCorrect, new Color(80,200,80));

            areaRespuesta.setText("");

            if (errorListener.hasErrors()) {
                List<String> errors = errorListener.getErrors();
                StringBuilder errorMessages = new StringBuilder();
                for (String error : errors) {
                    errorMessages.append(error).append("\n\n");
                }
                doc.insertString(doc.getLength(),"Errores Encontrados: \n",colorError2);
                doc.insertString(doc.getLength(),errorMessages.toString(),colorError);
            } else {
                doc.insertString(doc.getLength(),"No se presentan ERRORES visibles en la consulta dada.",colorCorrect);
            }
        } catch (Exception e) {
            areaRespuesta.setText("Error: " + e.getMessage());
        }
    }

    private GridBagConstraints restricciones(final int x,final int y,final double pesoX,final double pesoY,final int ancho,final int alto, final int anchor,final int fill){
        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.gridx = x;
        restricciones.gridy = y;
        restricciones.gridwidth = ancho;
        restricciones.gridheight = alto;
        restricciones.weightx = pesoX;
        restricciones.weighty = pesoY;
        restricciones.anchor = anchor;
        restricciones.fill = fill;
        restricciones.insets = new Insets(5,5,5,5);
        return restricciones;
    }

    private GridBagConstraints restricciones(final int x,final int y,final double pesoX,final double pesoY,final int ancho,final int alto, final int anchor,final int fill,final Insets insets){
        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.gridx = x;
        restricciones.gridy = y;
        restricciones.gridwidth = ancho;
        restricciones.gridheight = alto;
        restricciones.weightx = pesoX;
        restricciones.weighty = pesoY;
        restricciones.anchor = anchor;
        restricciones.fill = fill;
        restricciones.insets = insets;
        return restricciones;
    }
}
