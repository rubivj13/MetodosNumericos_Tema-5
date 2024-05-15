package Interpolación_Lineal;

public class Ejercicio5 {

    public static void main(String[] args) {
        // Datos de velocidad y tiempo del objeto en movimiento
        double[] tiempo = {0, 2, 4, 6, 8}; // Tiempo en segundos
        double[] velocidad = {0, 10, 20, 30, 40}; // Velocidad en metros por segundo

        // Tiempo para el que queremos estimar la posición
        double tiempoInterpolacion = 5;

        // Realizar interpolación lineal para estimar la posición
        double posicionInterpolada = linearInterpolation(tiempo, velocidad, tiempoInterpolacion);

        // Imprimir el resultado
        System.out.println("La posición estimada en t=" + tiempoInterpolacion + " segundos es: " + posicionInterpolada + " metros");
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
