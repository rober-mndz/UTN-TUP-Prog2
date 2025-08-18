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

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = scanner.nextDouble();
        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        char categoria = scanner.next().charAt(0);
        double descuento = 0.0;
        String porcentajeDescuento = "";
        switch (Character.toUpperCase(categoria)) {
            case 'A':
                descuento = 0.10;
                porcentajeDescuento = "10%";
                break;
            case 'B':
                descuento = 0.15;
                porcentajeDescuento = "15%";
                break;
            case 'C':
                descuento = 0.20;
                porcentajeDescuento = "20%";
                break;
            default:
                System.out.println("Categoría no válida.");
                scanner.close();
                return;
        }
        double montoDescuento = precioOriginal * descuento;
        double precioFinal = precioOriginal - montoDescuento;
        System.out.println("Precio original: " + precioOriginal);
        System.out.println("Descuento aplicado: " + porcentajeDescuento);
        System.out.println("Precio final: " + precioFinal);
        scanner.close();
    }
}
