package Interpolación_Lineal;

public class Ejercicio4 {

    public static void main(String[] args) {
        // Datos de flujo de tráfico en una carretera cada hora durante un día
        double[] horas = {1, 2, 3, 4, 5, 6, 7}; // Horas del día
        double[] flujo = {200, 250, 300, 280, 260, 240, 220}; // Flujo de tráfico en vehículos por hora

        // Hora para la que se desea estimar el flujo de tráfico
        double horaInterpolacion = 3.5;

        // Realizar interpolación lineal para estimar el flujo de tráfico
        double flujoInterpolado = linearInterpolation(horas, flujo, horaInterpolacion);

        // Imprimir el resultado
        System.out.println("El flujo de tráfico estimado a las " + horaInterpolacion + " horas es: " + flujoInterpolado + " vehículos por hora");
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
