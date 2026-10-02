/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8provenshare;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex8ProvenShare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double creditosIniciales, precioLibro;
        String frase, estadoLibro;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantos creditos tienes?");
        creditosIniciales = sc.nextDouble();
        System.out.println("Cual es el precio del libro?");
        precioLibro = sc.nextDouble();
        System.out.println("Cual es el estado del libro?");
        sc.nextLine(); //Limpia el buffer y el enter
        estadoLibro = sc.nextLine();
        
        if (estadoLibro.equalsIgnoreCase("Disponible"))
        {
            if (creditosIniciales >= precioLibro)
            {
                frase = "Compra realizada con exito! El producto es tuyo.";
            }
            else
            {
                frase = "Saldo insuficiente en el monedero";
            }
        }
        else if (estadoLibro.equalsIgnoreCase("Reservado"))
        {
            frase = "Lo sentimos, el producto ya esta reservado";
        }
        
        System.out.println(frase);
    }
    
}
