/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp01.introduccion_a_java;

/**
 *
 * @author robermendez
 */
// División con enteros (int)
import java.util.Scanner;
public class DivisionEntera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el dividendo (entero): ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el divisor (entero): ");
        int num2 = scanner.nextInt();
        int resultado = num1 / num2;
        // Ejemplo: 7 / 2 = 3
        System.out.println("El resultado de la división entera es: " + resultado);
        scanner.close();
    }
}
