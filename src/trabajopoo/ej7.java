package TrabajoPOO;
import java.util.Scanner;
public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[8];
        System.out.println("Ingresa 8 numeros enteros:");
        for (int i = 0; i < 8; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("Numeros no repetidos (unicos):");
        for (int i = 0; i < 8; i++) {
            boolean repetido = false;
            for (int j = 0; j < 8; j++) {
                if (i != j && num[i] == num[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                System.out.print(num[i] + " ");
            }
        }
        sc.close();
    }
}