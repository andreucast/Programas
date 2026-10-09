/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4projecteprovensharerandom;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Ex4ProjecteProvenShareRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random ();
        int numRandom;
        
        numRandom = ran.nextInt(1, 7);
        System.out.println("Ha salido el numero " + numRandom);
        
        if (numRandom == 6)
        {
            System.out.println("Has sacado un 6!");
        }
        else if (numRandom == 1)
        {
            System.out.println("Que mala suerte!");
        }
        else
        {
            System.out.println("Resultado normal");
        }
    }
    
}
