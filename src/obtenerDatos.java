import java.util.InputMismatchException;
import java.util.Scanner;

public class obtenerDatos {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String nombre = obtenerNombre();
        int edad = obtenerEdad();
        imprimirNombreYEdad ( nombre, edad);
        scanner.close();
    }
    public static void imprimirNombre(String nombre) {
        System.out.println("Mi nombre es: " +nombre);
    }
    public static void imprimirNombreYEdad(String nombre, int edad) {
        imprimirNombre(nombre);
        System.out.print(" y tengo " + edad + " años. ");
        System.out.println();
    }
    public static String obtenerNombre() {
        String nombre;
        do {
            System.out.println("Ingrese su nombre: ");
            nombre = scanner.nextLine();
            if (nombre.isEmpty()) {
                System.out.println("El nombre no puede estar vacio.");
            }
            if (!verificarCadenaString(nombre)) {
                System.out.println("El nombre no puede contener numeros");
            }
        } while (nombre.isEmpty() || !verificarCadenaString(nombre));
        return nombre;
    }
    public static int obtenerEdad() {
        boolean error = false;
        int edad = 0;

        do {
            error = false;
            try {
                do {
                    System.out.print("Ingrese su edad: ");
                    edad = scanner.nextInt();
                    if (edad < 0) {
                        System.out.println("La edad no puede ser negativa.");
                    }
                } while (edad < 0);
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero");
                error = true;
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                error = true;
                scanner.nextLine();
            }
        } while (error);
        return edad;
    }
    public static boolean verificarCadenaString(String cadena){
        return cadena.matches("[a-zA-Z]+");

    }
}
