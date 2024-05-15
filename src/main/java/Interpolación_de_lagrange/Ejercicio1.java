package Interpolación_de_lagrange;

public class Ejercicio1 {

    // Método para calcular el polinomio de Lagrange
    public static double interpolate(double[] x, double[] y, double target) {
        double result = 0;
        for (int i = 0; i < x.length; i++) {
            double term = y[i];
            for (int j = 0; j < x.length; j++) {
                if (j != i) {
                    term *= (target - x[j]) / (x[i] - x[j]);
                }
            }
            result += term;
        }
        return result;
    }

    public static void main(String[] args) {
        // Ejemplo de puntos de datos
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2, 3, 5, 7, 11};

        // Valor a interpolar
        double target = 2.5;

        // Calcular el valor interpolado
        double interpolatedValue = interpolate(x, y, target);

        System.out.println("El valor interpolado en x=" + target + " es: " + interpolatedValue);
    }
}
