/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9funcions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author aca4354
 */
public class Ex9Funcions {

    /**
     * @param args the command line arguments
     */
    
    /*9. Realiza un programa que pida introducir CUATRO valores enteros y nos diga cuál de ellos es el más
         elevado. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no
         tres) y nos devuelva el máximo de los dos valores.*/

    public static void main(String[] args) {
        int num1, num2, num3, num4, valorMayor1, valorMayor2;
        
        num1 = pedirCuatroNumerosUsuario("Escribe un numero: ");
        
        num2 = pedirCuatroNumerosUsuario("Escribe un numero: ");
        
        valorMayor1 = compararValores(num1, num2);
        
        num3 = pedirCuatroNumerosUsuario("Escribe un numero: ");
        
        num4 = pedirCuatroNumerosUsuario("Escribe un numero: ");
        
        valorMayor2 = compararValores(num3, num4);
        
        mostrarResultado(valorMayor1, valorMayor2);
    }
    
    public static int compararValores(int a, int b)
    {
        if (a >= b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    
    public static void mostrarResultado(int mostrarResultado1, int mostrarResultado2)
    {
        int resultado;
        if (mostrarResultado1 > mostrarResultado2)
        {
            System.out.println("El valor mas grande introducido es: " + mostrarResultado1);
        }
        else
        {
            System.out.println("El valor mas grande introducido es: " + mostrarResultado2);
        }
    }
    
    public static int pedirCuatroNumerosUsuario(String frase)
    {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean numIncorrecto = false;
        do{
        try
            {
            System.out.print(frase);
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
