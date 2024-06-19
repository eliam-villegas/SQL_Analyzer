package gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

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

        JTextArea campoTexto = new JTextArea();
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

        JTextArea areaRespuesta = new JTextArea();
        areaRespuesta.setEditable(false);
        JScrollPane scrollRespuesta = new JScrollPane(areaRespuesta);
        panelResultado.add(scrollRespuesta,restricciones(0,1,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH));

        pp.add(panelResultado,restricciones(1,0,0.5,1,1,1,GridBagConstraints.WEST,GridBagConstraints.BOTH));


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
