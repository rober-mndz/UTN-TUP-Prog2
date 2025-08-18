/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp01.introduccion_a_java;

/**
 *
 * @author robermendez
 */
// División con decimales (double)
import java.util.Scanner;
public class DivisionDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el dividendo (puede tener decimales): ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el divisor (puede tener decimales): ");
        double num2 = scanner.nextDouble();
        double resultado = num1 / num2;
        // Ejemplo: 7.0 / 2.0 = 3.5
        System.out.println("El resultado de la división decimal es: " + resultado);
        scanner.close();
    }
}