
package Interpolación_de_newton;

public class Ejercicio1 {
        // Método para calcular la tabla de diferencias divididas
    public static double[][] dividedDifferenceTable(double[] x, double[] y) {
        int n = x.length;
        double[][] table = new double[n][n];
        for (int i = 0; i < n; i++) {
            table[i][0] = y[i];
        }
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                table[i][j] = (table[i + 1][j - 1] - table[i][j - 1]) / (x[i + j] - x[i]);
            }
        }
        return table;
    }

    // Método para evaluar el polinomio de Newton en un punto dado
    public static double evaluateNewtonPolynomial(double[] x, double[][] table, double target) {
        int n = x.length;
        double result = table[0][0];
        double term = 1;
        for (int i = 1; i < n; i++) {
            term *= (target - x[i - 1]);
            result += table[0][i] * term;
        }
        return result;
    }

    public static void main(String[] args) {
        // Ejemplo de puntos de datos
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2, 3, 5, 7, 11};

        // Calcular la tabla de diferencias divididas
        double[][] table = dividedDifferenceTable(x, y);

        // Valor a interpolar
        double target = 2.5;

        // Evaluar el polinomio de Newton en el punto dado
        double interpolatedValue = evaluateNewtonPolynomial(x, table, target);

        System.out.println("El valor interpolado en x=" + target + " es: " + interpolatedValue);
    }
}
