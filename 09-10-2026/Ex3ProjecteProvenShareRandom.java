/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3projecteprovensharerandom;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Ex3ProjecteProvenShareRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random ();
        int numRandom;
        
        numRandom = ran.nextInt(1, 101);
        System.out.print("He elegido el numero " + numRandom);
        
        if (numRandom%2 == 0)
        {
            System.out.println("El numero es par");
        }
        else
        {
            System.out.println("El numero es impar");
        }
    }
    
}
