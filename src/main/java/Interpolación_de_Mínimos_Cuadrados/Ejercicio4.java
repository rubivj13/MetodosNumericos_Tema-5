package Interpolación_de_Mínimos_Cuadrados;

public class Ejercicio4 {

    public static void main(String[] args) {
        // Datos de producción industrial: mes (x) y producción (y)
        double[] mes = {1, 2, 3, 4, 5};
        double[] produccion = {1000, 1200, 1300, 1100, 1500};

        // Grado del polinomio interpolador
        int grado = 2;

        // Realizar la interpolación de mínimos cuadrados
        double[] coeficientes = leastSquaresInterpolation(mes, produccion, grado);

        // Evaluar el polinomio interpolador en un punto dado
        double mesObjetivo = 3.5;
        double valorInterpolado = evaluatePolynomial(coeficientes, mesObjetivo);
        System.out.println("La producción interpolada en el mes " + mesObjetivo + " es: " + valorInterpolado);
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
