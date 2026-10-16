/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9iteratiusv2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex9Iteratiusv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1, producto = 1;
        
        while (contador <= 10)
        {
            producto = producto * contador;
            System.out.println("el producto es: " + producto);
            sc.nextLine();
            contador++;
           
        }
        System.out.println("El producto de los diez primeros numeros naturales es = " + producto);
    }
    
}
