
package Interpolación_de_newton;

public class Ejercicio5 {
    public static void main(String[] args) {
       
        double[] x = {1, 4, 3 };
        double[] y = {9, 2, 5 };
        double[][] table = dividedDifferenceTable(x, y);
        double targetX = 2.5;
        double interpolatedValue = evaluateNewtonPolynomial(x, table, targetX);

        System.out.println("El valor interpolado en x=" + targetX + " es: " + interpolatedValue);
    }

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

    public static double evaluateNewtonPolynomial(double[] x, double[][] table, double targetX) {
        int n = x.length;
        double result = table[0][0];
        double term = 1;
        for (int i = 1; i < n; i++) {
            term *= (targetX - x[i - 1]);
            result += table[0][i] * term;
        }
        return result;
    }    
}
