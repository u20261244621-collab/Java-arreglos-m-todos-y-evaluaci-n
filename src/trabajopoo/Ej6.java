package TrabajoPOO;
import java.util.Scanner;
public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        System.out.print("Ingrese el numero de DNI (8 digitos): ");
        int dni = sc.nextInt();

        int resto = dni % 23;
        char letra = letras[resto];

        System.out.printf("El NIF completo es: %08d-%c\n", dni, letra);

        sc.close();
    }
}