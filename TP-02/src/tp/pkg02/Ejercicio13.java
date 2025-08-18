/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg02;

/**
 *
 * @author Rober
 */
public class Ejercicio13 {
    public static void imprimirArrayRecursivo(double[] array, int indice) {
        if (indice == array.length) {
            return;
        }
        System.out.println("Precio: $" + array[indice]);
        imprimirArrayRecursivo(array, indice + 1);
    }

    public static void main(String[] args) {
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0);
        precios[2] = 129.99;
        System.out.println("\nPrecios modificados:");
        imprimirArrayRecursivo(precios, 0);
    }
}