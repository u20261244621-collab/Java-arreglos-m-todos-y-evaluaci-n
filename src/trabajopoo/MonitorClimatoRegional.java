package TrabajoPOO;
import java.util.Random;
import java.util.Scanner;
public class MonitorClimatoRegional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Tres arreglos de 12 posiciones para cada subestacion
        double[] rivera;
        double[] neiva;
        double[] campoalegre;
        System.out.println("=== EVALUACION 1: MONITOR CLIMATICO REGIONAL ===");
        System.out.print("¿Desea generar los datos de forma aleatoria? (true/false): ");
        boolean aleatorio = sc.nextBoolean();

        System.out.print("Ingrese la temperatura minima permitida (°C): ");
        double min = sc.nextDouble();

        System.out.print("Ingrese la temperatura maxima permitida (°C): ");
        double max = sc.nextDouble();

        // 2. Llenar arreglos
        System.out.println("\n--- Generando datos para Rivera ---");
        rivera = generarTemperaturas(aleatorio, min, max, sc, "Rivera");

        System.out.println("\n--- Generando datos para Neiva ---");
        neiva = generarTemperaturas(aleatorio, min, max, sc, "Neiva");

        System.out.println("\n--- Generando datos para Campoalegre ---");
        campoalegre = generarTemperaturas(aleatorio, min, max, sc, "Campoalegre");

        // 3. Resultados y estadísticas
        System.out.println("\n=== PROMEDIOS ANUALES DE TEMPERATURA ===");
        System.out.println("Rivera: " + Math.round(calcularPromedio(rivera) * 100.0) / 100.0 + "°C");
        System.out.println("Neiva: " + Math.round(calcularPromedio(neiva) * 100.0) / 100.0 + "°C");
        System.out.println("Campoalegre: " + Math.round(calcularPromedio(campoalegre) * 100.0) / 100.0 + "°C");

        // 4. Comparaciones
        System.out.println("\n=== COMPARACION ENTRE SUBESTACIONES ===");
        compararSubestaciones(rivera, "Rivera", neiva, "Neiva");
        compararSubestaciones(neiva, "Neiva", campoalegre, "Campoalegre");

        // 5. Anomalías térmicas
        System.out.println("\n=== DETECCION DE ANOMALIAS (Desviacion de +/- 20%) ===");
        imprimirAnomalias("Rivera", rivera);
        imprimirAnomalias("Neiva", neiva);
        imprimirAnomalias("Campoalegre", campoalegre);

        sc.close();
    }

    // Genera las temperaturas manuales o aleatorias entre min y max
    public static double[] generarTemperaturas(boolean aleatorio, double min, double max, Scanner sc, String nombre) {
        double[] temps = new double[12];
        Random rand = new Random();

        for (int i = 0; i < 12; i++) {
            if (aleatorio) {
                double val = min + (max - min) * rand.nextDouble();
                temps[i] = Math.round(val * 10.0) / 10.0;
            } else {
                System.out.print("Mes " + (i + 1) + " para " + nombre + ": ");
                temps[i] = sc.nextDouble();
            }
        }
        return temps;
    }

    // Calcula el promedio del año
    public static double calcularPromedio(double[] t) {
        double suma = 0;
        for (int i = 0; i < t.length; i++) {
            suma += t[i];
        }
        return suma / t.length;
    }

    // Compara dos subestaciones indicando cuál es más cálida segun su promedio
    public static void compararSubestaciones(double[] t1, String nombre1, double[] t2, String nombre2) {
        double p1 = calcularPromedio(t1);
        double p2 = calcularPromedio(t2);

        if (p1 > p2) {
            System.out.println(nombre1 + " fue mas calida que " + nombre2);
        } else if (p2 > p1) {
            System.out.println(nombre2 + " fue mas calida que " + nombre1);
        } else {
            System.out.println(nombre1 + " y " + nombre2 + " registraron el mismo promedio.");
        }
    }

    // Devuelve los índices de los meses con desviaciones del 20%
    public static int[] detectarAnomalias(double[] t) {
        double promedio = calcularPromedio(t);
        double limiteInf = promedio * 0.80; // -20%
        double limiteSup = promedio * 1.20; // +20%

        int contador = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] < limiteInf || t[i] > limiteSup) {
                contador++;
            }
        }

        int[] anomalias = new int[contador];
        int pos = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] < limiteInf || t[i] > limiteSup) {
                anomalias[pos] = i;
                pos++;
            }
        }

        return anomalias;
    }

    // Imprime las anomalías encontradas
    public static void imprimirAnomalias(String nombre, double[] t) {
        int[] mesesAnomalos = detectarAnomalias(t);
        String[] meses = {"Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};

        System.out.print(nombre + ": ");
        if (mesesAnomalos.length == 0) {
            System.out.println("Sin anomalias.");
        } else {
            for (int i = 0; i < mesesAnomalos.length; i++) {
                int idx = mesesAnomalos[i];
                System.out.print(meses[idx] + " (" + t[idx] + "°C) ");
            }
            System.out.println();
        }
    }
}