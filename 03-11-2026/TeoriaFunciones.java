/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriafuncioneshelloworld;

import java.util.Scanner;

/**
 *
 * @author aca4354
 */
public class TeoriaFuncionesHelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad, edadDoblada;
        double precioIVA, precio;
       
        System.out.println("Estoy en el main... ");
        System.out.println("Como te llamas? ");
        nombre = sc.nextLine();
        System.out.println("Que edad tienes? ");
        edad = sc.nextInt();
        System.out.println("Cuanto vale el producto?");
        precio = sc.nextDouble();
        
        imprimeHelloWorld();
        // imprimeHelloWorld();
        
        saludarPersona(nombre);
        saludarPersona("Roser Salietti");
        // saludarPersona(5); Error: No puede convertir 5 a String
        
        saludarPersonaEdad(nombre, edad);
        // saludarPersonaEdad("Isabel Miralves", 35);
        edadDoblada = doblarEdad(edad);
        
        System.out.println("(Main) Tu edad de aqui al doble de años sera: " + edadDoblada);
        
        precioIVA = calcularPrecioConIVA(precio);
        //resultado final podria ser un void
        System.out.println("Precio con IVA incluido: " + precioIVA);
        
        System.out.println("Fin de main");
    }
    
    //definim funcions
    public static void imprimeHelloWorld() //sin parametros de entrada
    {
        System.out.println("Hello World");
        System.out.println("Esto es una función");
    }
    
    public static void saludarPersona(String nom) //con parametros
    {
        int edadComputadora = 21;
        System.out.println("Hola " + nom + " que tal estas? ");
        System.out.println("Jo tinc " + edadComputadora + " anys");
    }
    
    /**
     * saludarPersonaEdad : Funció que saluda a la persona
     * li diu la seva edad i li comenta que la maquina te 21 anys
     * @param nom Nom de la persona a saludar
     * @param age Edat de la persona a saludar
     */
    
    public static void saludarPersonaEdad(String nom, int age)
    {
        int edadComputadora = 21, doble;
        System.out.println("Hola " + nom + " que tal estas? ");
        System.out.println("Tu tens " + age + " anys");
        doble = doblarEdad(age);
        System.out.println("El doble de tu edad es " + doble);
        System.out.println("Jo tinc " + edadComputadora + " anys");
    }
    
    /**
     * Función que dobla la edad del usuario
     * @param age del usuario
     * @return edad doblada
     */
    public static int doblarEdad(int age)
    {
        int dobleEdad = age * 2;
        return dobleEdad;
        
    }
    
    public static double calcularPrecioConIVA (double precioSinIva)
    {
        double iva = precioSinIva * 0.21;
        double precioTotal = precioSinIva + iva;
        return precioTotal;
        // return (precioSinIva + iva);
    }
    public static double pedirPrecioSinIva()
    {
        Scanner sc = new Scanner(System.in);
    }
}
