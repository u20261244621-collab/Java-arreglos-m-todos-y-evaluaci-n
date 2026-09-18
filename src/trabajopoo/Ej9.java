package TrabajoPOO;
import java.util.Scanner;
public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos numeros deseas ingresar?: ");
        int cantidad = sc.nextInt();
        int[] numeros = new int[cantidad];
        System.out.println("Ingresa los " + cantidad + " numeros enteros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        int[] resultado = soloPrimos(numeros);
        System.out.println("\nLos numeros primos encontrados son:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
        System.out.println();

        sc.close();
    }
    public static boolean esPrimo(int unnumero) {
        if (unnumero < 2) {
            return false;
        }
        for (int i = 2; i < unnumero; i++) {
            if (unnumero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int[] soloPrimos(int[] unalistadenumeros) {
        int cont = 0;
        for (int i = 0; i < unalistadenumeros.length; i++) {
            if (esPrimo(unalistadenumeros[i])) {
                cont++;
            }
        }
        int[] primos = new int[cont];
        int pos = 0;
        for (int i = 0; i < unalistadenumeros.length; i++) {
            if (esPrimo(unalistadenumeros[i])) {
                primos[pos] = unalistadenumeros[i];
                pos++;
            }
        }
        return primos;
    }
}