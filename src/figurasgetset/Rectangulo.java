package figurasgetset;

import javax.swing.*;

public class Rectangulo
{
    private double alto = 0.0;
    private double ancho = 0.0;
    private double area = 0.0;

    public Rectangulo()
    {
        alto  = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto es el alto de su triangulo."));
        ancho = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto es el ancho de su triagulo."));
        calcularArea();
    }

    public void calcularArea()
    {
        area = alto * ancho;
    }

    public double getAlto()
    {
        return alto;
    }

    public void setAlto(double alto)
    {
        this.alto = alto;
    }

    public double getAncho()
    {
        return ancho;
    }

    public void setAncho(double ancho) {

        this.ancho = ancho;
    }

    public double getArea()
    {
        return area;
    }
}
