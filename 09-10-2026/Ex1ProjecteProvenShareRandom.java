/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1projecteprovensharerandom;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex1ProjecteProvenShareRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner (System.in);
        int numElegido, numRandom;
        
        System.out.println("Que numero crees que sacare?");
        numElegido = sc.nextInt();
     
        numRandom = ran.nextInt(1, 11);
        
        if (numElegido == numRandom)
        {
            System.out.println("Has acertado!");
        }
        else if (numElegido > numRandom)
        {
            System.out.println("Te has pasado!");
            System.out.println("He elegido el " + numRandom);
        }
        else
        {
            System.out.println("El numero es mas grande");
            System.out.println("He elegido el " + numRandom);
        }
        
    }
    
}
