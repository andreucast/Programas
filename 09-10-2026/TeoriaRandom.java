/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomteoria;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Randomteoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatorio = new Random ();
        //generar enter aleatori
        int numAleatorio = aleatorio.nextInt();
        System.out.println("ha salido el " + numAleatorio);
        
        //enter aleatorio entre 2 números
        numAleatorio = aleatorio.nextInt(0, 5);
        System.out.println("(0-5) ha salido el " + numAleatorio);
        
        //decimals
        double numDecimal = aleatorio.nextDouble(0, 5);
        System.out.println("(0-5 decimales) ha salido el " + numDecimal);
        
        //aleatorio entre dos opciones (boolean)
        boolean cierto = aleatorio.nextBoolean(); //dos opciones
        
        String color;
        if (cierto==true)
        {
            color = "Rojo";
        }
        else
        {
            color = "Negro";
        }
        System.out.println("Ha salido el " + color);
        
        int numero = aleatorio.nextInt(1, 4);
        if (numero==1)
        {
            color = "Rojo";
        }
        else if (numero==2)
        {
            color = "Negro";
        }
        else if (numero==3)
        {
            color = "Verde";
        }
        System.out.println("En la ruleta ha salido el " + color);
      
    }
    
}
