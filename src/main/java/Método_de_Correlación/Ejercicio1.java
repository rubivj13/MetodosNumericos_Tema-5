
package Método_de_Correlación;

import java.util.Arrays;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        // Datos de entrada
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2.5, 3.7, 5.1, 6.2, 7.8};

        // Realizar la regresión lineal
        double[] coefficients = linearRegression(x, y);

        // Imprimir los coeficientes de la regresión lineal
        System.out.println("Coeficiente 'a': " + coefficients[0]);
        System.out.println("Coeficiente 'b': " + coefficients[1]);
    }

    public static double[] linearRegression(double[] x, double[] y) {
        // Calcular la media de x e y
        double meanX = Arrays.stream(x).average().orElse(Double.NaN);
        double meanY = Arrays.stream(y).average().orElse(Double.NaN);

        // Calcular las sumas de x*y y x^2
        double sumXY = 0;
        double sumXX = 0;
        for (int i = 0; i < x.length; i++) {
            sumXY += x[i] * y[i];
            sumXX += x[i] * x[i];
        }

        // Calcular los coeficientes de la regresión lineal
        double b = (sumXY - x.length * meanX * meanY) / (sumXX - x.length * meanX * meanX);
        double a = meanY - b * meanX;

        return new double[]{a, b};
    }
}
