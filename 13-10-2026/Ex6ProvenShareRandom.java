/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6provensharerandom;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex6ProvenShareRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char eleccioUsuari, maquina = ' ';
        String eleccio, resultat = " ", ordinador;
        int num;
        
        Scanner sc = new Scanner(System.in);
        Random aleatori = new Random();
        
        System.out.println("Tria entre pedra(S), paper(A) o tisora(T)");
        eleccioUsuari = sc.next().charAt(0);
        
        num = aleatori.nextInt(1,4);
        
        switch(num) {
            case 1:
                maquina='S';
                break;
            case 2:
                maquina='A';
                break;
            case 3:
                maquina='T';
                break;
        }        
        
        if (eleccioUsuari == 'S' || eleccioUsuari == 's'){
            eleccio = "Pedra";
        } else if (eleccioUsuari == 'A' || eleccioUsuari == 'a') {
            eleccio = "Paper";
        } else if (eleccioUsuari == 'T' || eleccioUsuari == 't') {
            eleccio = "Tisora";
        } else{
            eleccio = "No ha escollit correctament";
        }
        
        System.out.println("Tu has triat: " + eleccio);
        
        if (maquina == 'S'){
            ordinador = "Pedra";
        } else if (maquina == 'A') {
            ordinador = "Paper";
        } else if (maquina == 'T') {
            ordinador = "Tisora";
        } else{
            ordinador = "Error";
        }
        
        System.out.println("L'ordinador ha triat: " + ordinador);
        
        if (eleccioUsuari == 'S' || eleccioUsuari == 's' && maquina == 'S' || eleccioUsuari == 'A' || eleccioUsuari == 'a' && maquina == 'A' || eleccioUsuari == 'T' || eleccioUsuari == 't' && maquina == 'T'){
            resultat = "Empat!";
        }
        else if (eleccioUsuari == 'S' || eleccioUsuari == 's' && maquina == 'A' || eleccioUsuari == 'A' || eleccioUsuari == 'a' && maquina == 'T' || eleccioUsuari == 'T' || eleccioUsuari == 't' && maquina == 'S'){
            resultat = "Ha guanyat l'ordinador!";
        }
        else if (eleccioUsuari == 'S' || eleccioUsuari == 's' && maquina == 'T' || eleccioUsuari == 'A' || eleccioUsuari == 'a' && maquina == 'S' || eleccioUsuari == 'T' || eleccioUsuari == 't' && maquina == 'A'){
            resultat = "Has guanyat tu!";
        }
        
        System.out.println("Resultat: " + resultat);
    }
    
}
