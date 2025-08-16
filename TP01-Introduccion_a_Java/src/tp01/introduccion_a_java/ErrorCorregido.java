/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp01.introduccion_a_java;

/**
 *
 * @author robermendez
 */
import java.util.Scanner;

public class ErrorCorregido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        // SOLUCIÓN: Usar nextLine() para leer texto.
        String nombre = scanner.nextLine(); 

        System.out.println("Hola, " + nombre);
        
        scanner.close();
    }
}