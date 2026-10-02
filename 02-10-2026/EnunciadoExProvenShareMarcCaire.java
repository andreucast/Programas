/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enunciadoexprovenshare;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EnunciadoExProvenShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String respuesta;
        double creditosIniciales, creditosFinales;
        final int creditos = 7;
        Scanner sc = new Scanner (System.in);
        System.out.println("Cuantos creditos tienes?");
        creditosIniciales = sc.nextDouble();
        System.out.println("Quieres tener a este usuario como amigo? (Si/No)");
        respuesta = sc.next();
        if (respuesta.equalsIgnoreCase("Si"))
        {
            System.out.println("Se te han añadido " + creditos + " mas.");
            creditosFinales = creditos + creditosIniciales;
            System.out.println("Ahora tienes " + creditosFinales + " creditos");
        }
        else
        {
            System.out.println("No se te han añadido creditos");
            creditosFinales = creditosIniciales;    
            System.out.println("Sigues teniendo " + creditosFinales + " creditos");
        }
    }
    
}
