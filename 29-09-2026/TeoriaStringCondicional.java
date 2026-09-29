/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriastringicondicional;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class TeoriaStringiCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tipus primitius es mostren en blau
        int num, edat;
        double n1;
        char letra;
        /*aixo es un objecte de la llibreta java, tipus Scanner i
        no es mostra amb blau*/
        Scanner teclado = new Scanner(System.in);
        String frase, nom;
        frase = "Hola que tal, com et dius?";
        
        System.out.println(frase);
        nom = teclado.nextLine();
        System.out.println("Et dius " + nom);
        System.out.println("Quina edat tens?");
        edat = teclado.nextInt();
        if (edat >= 18)//true
            {
            System.out.println(nom +" puedes entrar al bingo");
            }
        else //false
            {
            System.out.println(nom +" no puedes entrar al bingo");
            }
    }
    
}
