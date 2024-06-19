package gui.componentes;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    private Image imagen;

    public Panel(final int ancho,final int alto){
        setSize(new Dimension(ancho,alto));
        setLayout(new GridBagLayout());
        setBackground(Color.white);

    }

    public Panel(final int ancho,final int alto,final Color color){
        setLayout(new GridBagLayout());
        setSize(new Dimension(ancho,alto));
        setBackground(color);
    }

    public Panel(final int ancho,final int alto,final String ruta){
        setLayout(new GridBagLayout());
        setSize(new Dimension(ancho,alto));
        this.imagen = new ImageIcon(ruta).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(imagen != null){
            int width = getWidth();
            int height = getHeight();

            // Escalar la imagen al tamaño del panel
            Image imagenEscalada = imagen.getScaledInstance(width, height, Image.SCALE_SMOOTH);

            // Dibujar la imagen de fondo
            g.drawImage(imagenEscalada, 0, 0, this);
        }
    }

    public void insertar(final Component c, final GridBagConstraints r){
        this.add(c,r);
    }

    public void establecerColor(final Color color){
        if(imagen == null){
            setBackground(color);
        }
    }
}
