package Interpolación_de_lagrange;


public class Ejercicio3 {

 public static void main(String[] args) {
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2, 3, 5, 7, 11};
        double targetX = 2.5;
        double interpolatedY = interpolate(x, y, targetX);
        System.out.println("Para x=" + targetX + ", y=" + interpolatedY);
    }

    public static double interpolate(double[] x, double[] y, double targetX) {
        double result = 0;
        for (int i = 0; i < x.length; i++) {
            double term = y[i];
            for (int j = 0; j < x.length; j++) {
                if (j != i) {
                    term *= (targetX - x[j]) / (x[i] - x[j]);
                }
            }
            result += term;
        }
        return result;
    }
}

