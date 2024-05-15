package Interpolación_Lineal;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Datos de ventas mensuales de una empresa
        double[] meses = {1, 2, 3, 4, 5}; // Meses del año
        double[] ventas = {1000, 1200, 1300, 1100, 1500}; // Ventas en unidades

        // Mes para el que se desea estimar las ventas
        double mesInterpolacion = 3.5;

        // Realizar interpolación lineal para estimar las ventas
        double ventasInterpoladas = linearInterpolation(meses, ventas, mesInterpolacion);

        // Imprimir el resultado
        System.out.println("Las ventas estimadas en el mes " + mesInterpolacion + " son: " + ventasInterpoladas + " unidades");
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
