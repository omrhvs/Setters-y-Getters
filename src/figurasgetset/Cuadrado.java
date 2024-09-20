package figurasgetset;

import javax.swing.*;

public class Cuadrado
{
    private double lado = 0.0;
    private double area = 0.0;

    public Cuadrado()
    {
        lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto es el lado de su cuadrado."));
        calcularArea();
    }

    public void calcularArea()
    {
        area = lado * lado;
    }

    public double getLado()
    {
        return lado;
    }

    public void setLado(double lado)
    {
        this.lado = lado;
    }

    public double getArea()
    {
        return area;
    }
}
