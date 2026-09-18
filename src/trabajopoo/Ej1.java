package TrabajoPOO;
public class Ej1 {
    public static void main(String[] args) {
        int[] miarray = {8, 2, 5, 4, 9, 1, 0, 8, 9, 3};
        int[] copiaDeDatos = new int[10];

        for (int i = 0; i < miarray.length; i++) {
            copiaDeDatos[i] = miarray[i] + 2;
            System.out.println("el elemento " + (i + 1) + " de copia de datos es " + copiaDeDatos[i]);
        }
    }
}