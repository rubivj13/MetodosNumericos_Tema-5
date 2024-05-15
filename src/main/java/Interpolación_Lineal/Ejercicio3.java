package Interpolación_Lineal;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Datos de temperatura registrados cada hora durante un día
        double[] horas = {1, 2, 3, 4, 5, 6, 7}; // Horas del día
        double[] temperatura = {20, 22, 24, 26, 28, 30, 32}; // Temperatura en grados Celsius

        // Hora a la que se desea estimar la temperatura
        double horaInterpolacion = 3.5;

        // Realizar interpolación lineal para estimar la temperatura
        double temperaturaInterpolada = linearInterpolation(horas, temperatura, horaInterpolacion);

        // Imprimir el resultado
        System.out.println("La temperatura estimada a las " + horaInterpolacion + " horas es: " + temperaturaInterpolada + " grados Celsius");
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
