import java.util.InputMismatchException;
import java.util.Scanner;

public class multiplicar {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = pedirNumero();
        imprimirTablaDeMultiplicar(numero);
        scanner.close();
    }
    public static int pedirNumero() {
        boolean error = false;
        int numero = 0;
        do {
            error = false;
            try {
                System.out.println("Ingrese un número para imprimir la tabla de multiplicar: ");
                numero = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número entero");
                error = true;
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " +e.getMessage());
                error = true;
                scanner.nextLine();
            }
        } while (error);
        return numero;
    }
    public static void imprimirTablaDeMultiplicar(int numero) {
        for (int i=1; i<= 15; i++) {
            System.out.println(numero + " x " + i + " = " +numero*i );
        }
    }
}
