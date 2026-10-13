/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exmenubucles;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExMenuBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int opcionMenu;
        String eleccion;
        
        System.out.println("1. Macarrones con queso");
        System.out.println("2. Espaguetis con tomate");
        System.out.println("3. Hamburgesa con queso");
        
        System.out.println("Que quieres pedir?");
        
        opcionMenu = sc.nextInt();
        
        do
        {
        switch (opcionMenu)
        {
            case 1:
                eleccion = "Has escogido macarrones";
                break;
            case 2:
                eleccion = "Has escogido espaguetis";
                break;
            case 3:
                eleccion = "Has escogido hamburguesa";
                break;
            default:
                eleccion = "No has escogido correctamente";
                break;
        }
        }while(opcionMenu < 1 || opcionMenu > 4);   
        //opcionMenu >= 1 && ocpionMenu <= 4 <-- opciones correctas
        //opcionMenu == 1 || opcionMenu == 2 || opcionMenu == 3
        
        System.out.println(eleccion);
           
    }
    
}
