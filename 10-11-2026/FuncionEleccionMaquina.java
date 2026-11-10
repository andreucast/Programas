/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expedrapapertisores;

import java.util.Random;

/**
 *
 * @author aca4354
 */
public class ExPedraPaperTisores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int eleccionMaquina, valorAleatorio = 0, resultadoMaquina;
    
    eleccionMaquina = eleccionMaquina(valorAleatorio);
    
    mostrarResultado(eleccionMaquina);
    }
    
    public static int eleccionMaquina(int numMaquina)
    {
        Random ran = new Random();
        numMaquina = ran.nextInt (0, 3);
        
        return numMaquina;
    }
    
    public static void mostrarResultado (int numMaquina)
    {
        System.out.println("La maquina ha elegido: " + numMaquina);
    }
    
}
