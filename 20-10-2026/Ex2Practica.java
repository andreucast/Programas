/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2practica;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex2Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String contra = "cristianoRonaldo";
        String intento;
        int numIntentos = 0;
        
        do
        {
        System.out.println("Introduce la contraseña: ");
        
        intento = sc.nextLine();
        numIntentos++;
        
            if (intento.equals(contra))
            {
                System.out.println("Inicio de sesion correcto");
            }
            else if (numIntentos >= 3)
            {
                System.out.println("Te has pasado de intentos");
            }
            else
            {
                System.out.println("Error al iniciar sesion, vuelve a intentarlo");
                numIntentos++;
                System.out.println("Introduce la contraseña: ");
                intento = sc.nextLine();
            }
        }
        while (!intento.equals(contra) && numIntentos < 3);
                
        if (!intento.equals(contra))
        {
            System.out.println("Cuenta bloqueada");
        }
        else
        {
            System.out.println("Contraseña correcta");
        }
        
    }
    
}
