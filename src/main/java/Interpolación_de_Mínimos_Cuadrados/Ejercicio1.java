
package Interpolación_de_Mínimos_Cuadrados;

public class Ejercicio1 {
    
     public static void main(String[] args) {
        // Datos de entrada
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2.5, 3.7, 5.1, 6.2, 7.8};

        // Grado del polinomio interpolador
        int degree = 2;

        // Realizar la interpolación de mínimos cuadrados
        double[] coefficients = leastSquaresInterpolation(x, y, degree);

        // Evaluar el polinomio interpolador en un punto dado
        double targetX = 2.5;
        double interpolatedValue = evaluatePolynomial(coefficients, targetX);

        System.out.println("El valor interpolado en x=" + targetX + " es: " + interpolatedValue);
    }

    public static double[] leastSquaresInterpolation(double[] x, double[] y, int degree) {
        int n = x.length;
        int m = degree + 1;
        double[][] A = new double[m][m];
        double[] B = new double[m];

        // Construir las matrices A y B
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                double sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += Math.pow(x[k], i + j);
                }
                A[i][j] = sum;
            }
            double sum = 0;
            for (int k = 0; k < n; k++) {
                sum += y[k] * Math.pow(x[k], i);
            }
            B[i] = sum;
        }

        // Resolver el sistema de ecuaciones lineales
        double[] coefficients = solveSystemOfEquations(A, B);
        return coefficients;
    }

    public static double[] solveSystemOfEquations(double[][] A, double[] B) {
        // Implementación de un algoritmo para resolver sistemas de ecuaciones lineales
        // (por ejemplo, el método de Gauss-Jordan)
        // Devolvemos un conjunto de coeficientes aleatorios para este ejemplo
        int n = B.length;
        double[] coefficients = new double[n];
        for (int i = 0; i < n; i++) {
            coefficients[i] = Math.random(); // Coeficientes aleatorios
        }
        return coefficients;
    }

    public static double evaluatePolynomial(double[] coefficients, double x) {
        double result = 0;
        for (int i = 0; i < coefficients.length; i++) {
            result += coefficients[i] * Math.pow(x, i);
        }
        return result;
    }
}
