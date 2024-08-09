import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = 0 ;
        boolean errorEnCadena = false;
        String nombre;

        do {
            errorEnCadena = false;
            System.out.print("Ingresa tu nombre: ");
            nombre = scanner.nextLine();
            if (nombre.isEmpty()) {
                System.out.println("El nombre no puede estar vacio. ");
                errorEnCadena = true;
            }
            if (!verificarString(nombre)) {
                System.out.println("El nombre no puede contener Numeros.");
                errorEnCadena= true;
            }

        } while (errorEnCadena);

        boolean error = false;
        do {
            error = false;
            try {
                do {
            System.out.println("Ingrese tu edad: ");
            edad = scanner.nextInt();
            if (edad < 0 ) {
                System.out.println("La edad no puede ser negativa. ");
            }
        } while (edad < 0);
    }  catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero");
                error = true;
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                error = true;
                scanner. nextLine();
            }
} while (error);
        imprimirNombreYEdad(nombre, edad);
        scanner.close();
        }

    public static void imprimirNombre(String nombre) {
        System.out.println("Mi nombre es : " +nombre);
    }

    public static void imprimirNombreYEdad(String nombre, int edad) {
        imprimirNombre(nombre);
        System.out.println(" y tengo " +edad+ " años. ");
        System.out.println();
    }
    public static boolean verificarString(String cadena) {
        return cadena.matches("[a-zA-Z]+");
    }

    }