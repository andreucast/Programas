/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriastring;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class TeoriaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        String nombre, ciclo;
        
        System.out.println("Como te llamas?");
        nombre = sc.nextLine();
        System.out.println("En quin cicle t'has matriculat");
        ciclo = sc.nextLine();
        
        if (ciclo.equalsIgnoreCase("DAW"))//ignora mayúsculas i si fiques daw es correcte/true
        {
            System.out.println("Benvingut al Proven a Desenvolupament d'Aplicacions Web");
        }
        else if (ciclo.equalsIgnoreCase ("DAM"))
        {
            System.out.println("Benvingut al Proven a Desenvolupament d'Aplicacions Multiplataforma");
        }
        else if (ciclo.equalsIgnoreCase ("asix"))
        {
            System.out.println("Benvingut al Proven a Administració de Sistemes Informàtics i Xarxa");
        }
        else if (ciclo.equalsIgnoreCase ("DawBio"))
        {
            System.out.println("Benvingut al Proven a BioInformàtica");
        }
        else
        {
            System.out.println("No estas al proven");
        }
    }
    
}
