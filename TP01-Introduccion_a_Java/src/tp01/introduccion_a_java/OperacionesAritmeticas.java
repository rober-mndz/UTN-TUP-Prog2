/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp01.introduccion_a_java;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
// Clase para realizar operaciones aritméticas
public class OperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se solicitan los dos números
        System.out.print("Ingresa el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int num2 = scanner.nextInt();

        // Se realizan las operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        // Se realiza un "casting" a double para obtener un resultado con decimales
        double division = (double) num1 / num2; 

        // Se muestran los resultados
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Multiplicacion: " + num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + division);
        
        scanner.close();
    }
}
