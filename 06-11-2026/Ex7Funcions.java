/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7funcions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author aca4354
 */
public class Ex7Funcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double perimetro, area;
        
        
    }
    
    public static double perimetroRectangulo(double ancho, double alto)
    {
        double perimetro;
        perimetro = 2*ancho + 2*alto;
        return perimetro;
        
    }
    public static double areaRectangulo(double ancho, double alto)
    {
        double area;
        area = ancho * alto;
        return area;
        
    }
    public static int pedirNumeroUsuario(String frase)
    {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean numIncorrecto = false;
        do{
        try
            {
            System.out.print("Pon un numero: ");
            numero = sc.nextInt();
            numIncorrecto = true;
            }
        catch (InputMismatchException ex)
        {
            System.out.println("No has puesto un valor numerico.");
            numIncorrecto = false;
            sc.nextLine(); //Limpiar el buffer
        }
        }while (numIncorrecto == false);
        return numero;
    }
}
