package Método_de_Correlación;

import java.util.Arrays;

public class Ejercicio5 {

    public static void main(String[] args) {
        // Datos de edad
        double[] age = {25, 30, 35, 40, 45};
        // Nivel de ingresos (en miles de dólares)
        double[] income = {50, 60, 70, 80, 90};

        // Calcular la correlación entre la edad y el nivel de ingresos
        double correlation = calculateCorrelation(age, income);

        // Imprimir la correlación
        System.out.println("Correlación entre edad y nivel de ingresos: " + correlation);
    }

    public static double calculateCorrelation(double[] x, double[] y) {
        // Calcular la media de x e y
        double meanX = Arrays.stream(x).average().orElse(Double.NaN);
        double meanY = Arrays.stream(y).average().orElse(Double.NaN);

        // Calcular el numerador y el denominador de la fórmula de correlación
        double numerator = 0;
        double sumXX = 0;
        double sumYY = 0;
        for (int i = 0; i < x.length; i++) {
            numerator += (x[i] - meanX) * (y[i] - meanY);
            sumXX += Math.pow(x[i] - meanX, 2);
            sumYY += Math.pow(y[i] - meanY, 2);
        }
        double denominator = Math.sqrt(sumXX * sumYY);

        // Calcular la correlación
        double correlation = numerator / denominator;

        return correlation;
}
}
