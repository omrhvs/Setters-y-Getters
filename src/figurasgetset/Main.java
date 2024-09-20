package figurasgetset;

import javax.swing.*;

public class Main
{
    public static int seleccion = 0;
    public static void llamarMenu()
    {
        seleccion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "~Areas~\n=-=-=-=-=-=-=-=\nSeleccione una figura"
                        + "\n1) Cuadrado \n2) Circulo \n3)Rectangulo \n4)Triangulo"
                        + "\n=-=-=-=-=-=-=-=\n"
        ));
        mostrarSeleccion();
    }

    public static void mostrarSeleccion()
    {
        switch (seleccion)
        {
            case 1:
                Cuadrado cuadrado = new Cuadrado();
                JOptionPane.showMessageDialog(null, "El area de tu cuadrado es: " + cuadrado.getArea());
                llamarMenu();
                break;
            case 2:
                Circulo circulo = new Circulo();
                JOptionPane.showMessageDialog(null, "El area de tu circulo es: " + circulo.getArea());
                llamarMenu();
                break;
            case 3:
                Rectangulo rectangulo = new Rectangulo();
                JOptionPane.showMessageDialog(null, "El area de tu rectangulo es: " + rectangulo.getArea());
                llamarMenu();
                break;
            case 4:
                Triangulo triangulo = new Triangulo();
                JOptionPane.showMessageDialog(null, "El area de tu triangulo es: " + triangulo.getArea());
                llamarMenu();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese una seleccion valida.");
                llamarMenu();
                break;
        }
    }

    public static void main(String[] args)
    {
        llamarMenu();
    }
}
