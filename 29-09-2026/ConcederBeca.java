/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concederbeca;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ConcederBeca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner teclado =new Scanner(System.in);
        double nota1, nota2, notaMedia;
        int numHermanos;
        
//Mostrar: Que nota has sacado en el primer curso?
System.out.println("Que nota has sacado en el primer curso?");
//Esperar: nota1
nota1 = teclado.nextDouble();
//Mostrar: Que nota has sacado en el segundo curso?
System.out.println("Que nota has sacado en el segundo curso?");
//Esperar: nota2
nota2 = teclado.nextDouble();
//Calcular: notaMedia = (nota1 + nota2) / 2
notaMedia = (nota1 + nota2) / 2;
System.out.println("Tu nota media es de " + notaMedia);
if (notaMedia >= 8)
        {
            System.out.println("Has conseguido la beca de 1500 euros");
        }
/*else if (6 <= notaMedia && notaMedia < 8)
        {
            System.out.println("Has conseguido la beca de 500 euros");
        }
else
        {
            System.out.println("Estudia mas porque no has conseguido ninguna beca ajjajajajajaa");
        }
*/
else
        {
            System.out.println("Cuantos hermanos tienes?"); 
            numHermanos = teclado.nextInt();
            if (numHermanos >= 3)
                {
                    System.out.println("Has conseguido la beca de 750 euros");
                }
            else
                {
                    System.out.println("Estudia mas porque no has conseguido ninguna beca ajjajajajajaa");
                }
        }
//te preguntaran cuantos hermanos tienes
//si no llegas a nota media de 8 pero eres familia numerosa te dan beca de 750 euros
    }
    
}
