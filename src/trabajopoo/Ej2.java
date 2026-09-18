package TrabajoPOO;
import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int sumaPares = 0;
        int sumaImpares = 0;
        System.out.println("Ingresa 10 numeros enteros:");        
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (num[i] % 2 == 0) {
                sumaPares += num[i];
            } else {
                sumaImpares += num[i];
            }
        }
        if (sumaPares > sumaImpares) {
            System.out.println("La suma de los pares es mayor (" + sumaPares + " frente a " + sumaImpares + ").");
        } else if (sumaImpares > sumaPares) {
            System.out.println("La suma de los impares es mayor (" + sumaImpares + " frente a " + sumaPares + ").");
        } else {
            System.out.println("Ambas sumas son iguales.");
        }      
        sc.close();
    }
}