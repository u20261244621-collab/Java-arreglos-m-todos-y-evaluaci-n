package TrabajoPOO;
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperaturas = new double[7];
        boolean existe = false;
        System.out.println("Ingrese las temperaturas de los 7 dias de la semana:");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();
        }
        System.out.println("\nIngrese una nueva temperatura para buscar:");
        double nuevaTemp = sc.nextDouble();
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] == nuevaTemp) {
                existe = true;
                break;
            }
        }
        if (existe) {
            System.out.println("La temperatura " + nuevaTemp + " si se dio durante la semana.");
        } else {
            System.out.println("La temperatura " + nuevaTemp + " no se dio durante la semana.");
        }
        sc.close();
    }
}