
package Método_de_Correlación;

import java.util.Arrays;

public class Ejercicio4 {
    
        public static void main(String[] args) {
        // Datos de horas de estudio semanales
        double[] studyHours = {5, 7, 10, 12, 15};
        // Calificaciones finales
        double[] grades = {70, 75, 80, 85, 90};

        // Calcular la correlación entre las horas de estudio y las calificaciones
        double correlation = calculateCorrelation(studyHours, grades);

        // Imprimir la correlación
        System.out.println("Correlación entre horas de estudio y calificaciones: " + correlation);
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
