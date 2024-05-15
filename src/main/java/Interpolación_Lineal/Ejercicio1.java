package Interpolación_Lineal;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Datos de entrada
        double[] x = {6, 7, 8, 9, 10}; // Valores de x
        double[] y = {2.5, 3.7, 1.5, 2.6, 7.8}; // Valores de y

        // Punto de interpolación
        double xInterpolation = 2.5;

        // Realizar la interpolación lineal
        double yInterpolated = linearInterpolation(x, y, xInterpolation);

        // Imprimir el resultado
        System.out.println("El valor interpolado en x=" + xInterpolation + " es: " + yInterpolated);
    }

    public static double linearInterpolation(double[] x, double[] y, double xInterpolation) {
        int n = x.length;

        // Encontrar el índice i tal que x[i] <= xInterpolation < x[i+1]
        int i = 0;
        while (i < n - 1 && x[i] < xInterpolation) {
            i++;
        }

        // Calcular la pendiente (m) y el intercepto (b) de la recta entre (x[i], y[i]) y (x[i+1], y[i+1])
        double m = (y[i + 1] - y[i]) / (x[i + 1] - x[i]);
        double b = y[i] - m * x[i];

        // Calcular el valor interpolado
        return m * xInterpolation + b;
    }
}
