package TrabajoPOO;
public class Ej8 {//no se llama prueba x orden
    public static void main(String[] args) {
        int[] miArreglo = {10, 20, 10, 30, 40, 20, 50};
        System.out.println(mostrarVector(miArreglo));
    }
    public static String mostrarVector(int[] elementos) {
        String texto = "[";
        boolean primero = true;

        for (int i = 0; i < elementos.length; i++) {
            boolean repetido = false;
            for (int j = 0; j < elementos.length; j++) {
                if (i != j && elementos[i] == elementos[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                if (!primero) {
                    texto += ", ";
                }
                texto += elementos[i];
                primero = false;
            }
        }
        texto += "]";
        return texto;
    }
}