
package figurasgetset;

import javax.swing.*;

public class Circulo
{
    private double radio = 0.0;
    private double area = 0.0;

    public Circulo ()
    {
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese cuanto es el radio de su circulo."));
        calcularArea();
    }

    public void calcularArea()
    {
        area = 3.14 * (radio * radio);
    }

    public double getRadio()
    {
        return radio;
    }

    public void setRadio(double radio)
    {
        this.radio = radio;
    }

    public double getArea()
    {
        return area;
    }
}
