package TrabajoPOO;
import java.util.Scanner;
public class Ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero entero entre 0 y 255: ");
        int numero = sc.nextInt();

        if (numero < 0 || numero > 255) {
            System.out.println("Error: El numero debe estar en el rango de 0 a 255.");
        } else {
            System.out.print("El numero " + numero + " en binario es: ");
            mostrarBinario(numero);
        }

        sc.close();
    }
    public static void mostrarBinario(int numero) {
        int[] binario = new int[8];
        int i = 7;
        while (numero > 0 && i >= 0) {
            binario[i] = numero % 2;
            numero = numero / 2;
            i--;
        }
        for (int j = 0; j < binario.length; j++) {
            System.out.print(binario[j]);
        }
        System.out.println();
    }
}