/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2funcions;

import java.util.Scanner;

/**
 *
 * @author aca4354
 */
public class Ex2Funcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        boolean mayor;
        
        System.out.println("Que edad tienes?");
        edad = sc.nextInt();
        
//        mayor = esMayorEdad (edad);
//        if (mayor == true)

        if(esMayorEdad(edad)==true)
        {
            System.out.println("Eres mayor de edad, puedes pasar");
        }
        else
        {
            System.out.println("Eres menor de edad, no entras");
        }
    }
    
    public static boolean esMayorEdad(int a)
    {
        boolean mayorEdad;
        if (a>=18)
            //return true;
            mayorEdad = true;
        else
            //return false;
            mayorEdad = false;
        
        return mayorEdad;
    }
    
}
