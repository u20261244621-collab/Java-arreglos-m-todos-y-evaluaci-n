package TrabajoPOO;
import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("Ingresa 5 numeros enteros:");
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }

        int ultimo = num[4];

        for (int i = 3; i >= 0; i--) {
            num[i + 1] = num[i];
        }

        num[0] = ultimo;

        System.out.println("Array rotado a la derecha:");
        for (int i = 0; i < 5; i++) {
            System.out.print(num[i] + " ");
        }

        sc.close();
    }
}