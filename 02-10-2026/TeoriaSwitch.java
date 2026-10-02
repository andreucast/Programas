/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriaswitch;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class TeoriaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes;
        String mesTexto;
        int dias;
        Scanner teclado = new Scanner (System.in);
        System.out.println("En quin mes estas?");
        mes = teclado.nextInt();
        
        switch (mes)
        {
            case 1:
                mesTexto = "Enero";
                dias = 31;
                break;
            case 2:
                mesTexto = "Febrero";
                dias = 28;
                break;
            case 3:
                mesTexto = "Marzo";
                dias = 31;
                break;
            case 4:
                mesTexto = "Abril";
                dias = 30;
                break;
            case 5:
                mesTexto = "Mayo";
                dias = 31;
                break;
            case 6:
                mesTexto = "Junio";
                dias = 30;
                break;
            case 7:
                mesTexto = "Julio";
                dias = 31;
                break;
            case 8:
                mesTexto = "Agosto";
                dias = 31;
                break;
            case 9:
                mesTexto = "Setiembre";
                dias = 30;
                break;
            case 10:
                mesTexto = "Octubre";
                dias = 31;
                break;
            case 11:
                mesTexto = "Noviembre";
                dias = 30;
                break;
            case 12:
                mesTexto = "Diciembre";
                dias = 31;
                break;
            default:
                mesTexto = "Mes inexistente";
                dias = 0;
                break;
        }
        System.out.println("Estas en el mes de " + mesTexto + ", que tiene " + dias + " dias");
    }
    
}
