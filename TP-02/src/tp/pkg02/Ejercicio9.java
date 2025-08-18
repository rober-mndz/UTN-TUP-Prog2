/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg02;

/**
 *
 * @author Rober
 */
import java.util.Scanner;

public class Ejercicio9 {
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10.0;
        }
        return 0.0;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = scanner.nextLine();
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalPagar = calcularTotalCompra(precioProducto, costoEnvio);
        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalPagar);
        scanner.close();
    }
}
