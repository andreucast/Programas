/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2projecteprovensharerandommoneda;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex2ProjecteProvenShareRandomMoneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        String prediccion;
       //int moneda = rand.nextInt(1, 3);
       boolean moneda = ran.nextBoolean();
       
        System.out.println("Que crees que va a salir?");
        prediccion = sc.nextLine();
       //if (moneda==true)
       if (moneda)
       {
           System.out.println("Ha salido cara");
       }
       else
       {
           System.out.println("Ha salido cruz");
       }
       
       //true --> Cara y false --> Cruz
       //if (moneda==true && prediccion.equalsIgnoreCase("CARA"))
       if (moneda && prediccion.equalsIgnoreCase("CARA"))
       {
           System.out.println("Acertaste");
       }
       //else if (moneda==false && prediccion.equalsIgnoreCase("CRUZ"))
       else if (!moneda && prediccion.equalsIgnoreCase("CRUZ"))
       {
           System.out.println("Acertaste");
       }
    }
    
}
