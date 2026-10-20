/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1practica;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex1Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner (System.in);
        int minimo = 1;
        int maximo = 101;
        int numRandom;
        char resultado = ' ';
        
        System.out.println("Piensa un numero para que lo intente adivinar");
        numRandom = ran.nextInt(1, 101);
        
        System.out.println("El numero es: " + numRandom + " ?");
        resultado = sc.next().charAt(0);
        
        while (resultado != 'A' && resultado != 'a')
        {
            System.out.println("Dime si tu numero es mayor o menor a: " + numRandom);
            resultado = sc.next().charAt(0);
            
            if (resultado == 'g' || resultado == 'G')
            {
                System.out.println("Me he quedado corto, veulvo a intentarlo");
                minimo = numRandom;
                numRandom = ran.nextInt(minimo, maximo);
                System.out.println("Ahora el minimo es: " + minimo);
            }
            else if (resultado == 'p' || resultado =='P')
            {
                System.out.println("Me he pasado, vuelvo a intentarlo");
                maximo = numRandom;
                numRandom = ran.nextInt(minimo, maximo);
                System.out.println("Ahora el maximo es: " + maximo);
            }
            else if (resultado == 'A' || resultado == 'a')
            {
                System.out.println("He acertado!");
            }
            else
            {
                System.out.println("No has dado una respuesta valida");
            }
        }
    }
    
}
