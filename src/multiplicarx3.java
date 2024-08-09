import java.util.InputMismatchException;
import java.util.Scanner;

public class multiplicarx3 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numeros = pedirNumero();
        imprimirTablasDeMultiplicar(numeros);
        scanner.close();
    }
    public static int[] pedirNumero() {
        boolean error = false;
        int[] numeros = new int[3];
        for (int i=0; i< 3; i++) {
            do {
                error = false;
                try {
                    System.out.println("Ingrese el numero " +(i+1) + " : ");
                    numeros[i] = scanner.nextInt();
                    System.out.println();
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes ingresar un npumero entero.");
                    error = true;
                    scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Error : " +e.getMessage());
                    error = true;
                    scanner.nextLine();
                }
            } while ( error);
        }
        return numeros;
    }
    public static void imprimirTablasDeMultiplicar(int[] numeros) {
        for (int i=0; i < 3; i++) {
            for (int j= 1; j <= 10; j++) {
                System.out.println(numeros[i] + " x " + j + " = " +numeros[i] *j);
            }
            System.out.println();
        }
    }
}
