/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1funcions;

import java.util.Scanner;

/**
 *
 * @author aca4354
 */
public class Ex1Funcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;
        
        System.out.print("Cual es el primer numero? ");
        num1 = sc.nextDouble();
        System.out.print("Cual es el segundo numero? ");
        num2 = sc.nextDouble();
        
        resultado = multiplica(num1, num2);
                
        System.out.println("El resultado de la multiplicacion es de: " + resultado);
    }
    
    public static double multiplica(double a, double b)
    {
        double multi = a * b;
        return multi;
    }
    
}
