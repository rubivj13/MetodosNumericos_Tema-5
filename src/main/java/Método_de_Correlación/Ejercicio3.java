
package Método_de_Correlación;

import java.util.Arrays;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        // Datos de temperatura mensual (en grados Celsius)
        double[] temperature = {20, 22, 25, 28, 30};
        // Consumo mensual de energía (en kilovatios hora)
        double[] energyConsumption = {1000, 1100, 1200, 1300, 1400};

        // Calcular la correlación entre la temperatura y el consumo de energía
        double correlation = calculateCorrelation(temperature, energyConsumption);

        // Imprimir la correlación
        System.out.println("Correlación entre temperatura y consumo de energía: " + correlation);
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
