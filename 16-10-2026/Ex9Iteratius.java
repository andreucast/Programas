/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9iteratius;

/**
 *
 * @author alumne
 */
public class Ex9Iteratius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 1, suma = 0;
        
        while (contador <= 10)
        {
            suma = suma + contador;
            System.out.println("la suma: " + suma);
            contador++;
            
        }
        System.out.println("La suma de los diez primeros numeros naturales es = " + suma);
            
    }
    
}
