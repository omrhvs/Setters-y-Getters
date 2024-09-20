package figurasgetset;

import javax.swing.*;

public class Triangulo
{
    private double base = 0.0;
    private double altura = 0.0;
    private double area = 0.0;

    public Triangulo()
    {
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto es la base de su triangulo."));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto es la altura de su triangulo."));
        calcularArea();
    }

    public void calcularArea()
    {
        area = (base * altura) / 2;
    }

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    public double getArea()
    {
        return area;
    }
}
