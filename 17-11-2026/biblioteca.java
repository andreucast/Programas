/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jocpreguntes;

import java.util.Scanner;

/**
 *
 * @author aca4354
 */
public class PreguntasAndreu {
    
    public static String preguntaPrimera (String respuesta1)
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Quien marcó en la final del Mundial 2010?");
        System.out.println("A: Puyol");
        System.out.println("B: Villa");
        System.out.println("C: Iniesta");
        System.out.println("D: Xavi");
        
        respuesta1 = sc.nextLine();
        return respuesta1;
        
        /*if(respuesta1.equals("INIESTA"))
        {
            System.out.println("Acertaste! (Menos mal)");
        }
        else
        {
            System.out.println("");
        }*/
    }
    
    public static String respostaPrimera (String resposta1)
    {
        if(respuesta1.equals("INIESTA"))
        {
            System.out.println("Acertaste! (Menos mal)");
        }
        else if (respuesta1 == "PUYOL" ||)
        {
            System.out.println("");
        }
    }
}
