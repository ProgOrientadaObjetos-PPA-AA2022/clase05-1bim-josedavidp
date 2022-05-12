/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author josed
 */
public class EjecutorDos {
    public static void main(String[] args) {
        // Crear un objeto de tipo Barrio
        // Ingresar por teclado el valor del nombre del Barrio
        
        // Crear un objeto de tipo Persona
        // Crear por teclado el nombre, cedula
        // Asociar el barrio ingresado anteriormente
        
        // Presentar la representación del objeto Barrio
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del barrio: ");
        String nombre = sc.nextLine();
        Barrio barrio = new Barrio(nombre);
        
        System.out.println("Ingrese el nombre de la persona: ");
        String nombrePersona = sc.nextLine();

        System.out.println("Ingrese el número de cédula de la persona: ");
        String cedula = sc.nextLine();

        Persona persona = new Persona(nombrePersona, cedula, barrio);

        System.out.printf("%s", 
                persona);
    }
}
