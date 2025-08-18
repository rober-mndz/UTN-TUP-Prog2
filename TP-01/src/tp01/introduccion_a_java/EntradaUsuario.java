package tp01.introduccion_a_java;

import java.util.Scanner; // Se importa la clase Scanner

// Clase para leer datos del usuario
public class EntradaUsuario {
    public static void main(String[] args) {
        // Se crea un objeto Scanner para leer la entrada del sistema
        Scanner scanner = new Scanner(System.in);

        // Se solicita y lee el nombre del usuario
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // Se solicita y lee la edad del usuario
        System.out.print("Ahora, ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Se muestran los datos ingresados
        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
        
        scanner.close(); // Se cierra el scanner para liberar recursos
    }
}
