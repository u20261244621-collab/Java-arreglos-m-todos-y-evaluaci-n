package TrabajoPOO;
public class Ej5 {
    public static void main(String[] args) {
        int[] num = new int[10];

        System.out.println("Array original generado:");
        for (int i = 0; i < 10; i++) {
            num[i] = (int) (Math.random() * 100);
            System.out.print(num[i] + " ");
        }

        System.out.println("\n\nArray mostrado en orden (primero, ultimo, segundo, penultimo...):");
        for (int i = 0; i < 5; i++) {
            System.out.print(num[i] + " ");
            System.out.print(num[9 - i] + " ");
        }
        System.out.println();
    }
}