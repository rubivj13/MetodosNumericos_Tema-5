package Interpolación_de_lagrange;

public class Ejercicio4 {

    public static void main(String[] args) {
        double[] x = {8, 6, 5, 9, 12};
        double[] y = {2, 11, 4, 3, 10};
        double targetX = 3.5;
        double interpolatedY = interpolate(x, y, targetX);
        System.out.println("Para x= " + targetX + " ,y= " + interpolatedY);
    }

    private static double interpolate(double[] x, double[] y, double targetX) {
        double result = 0;
        for (int i = 0; i < x.length; i++) {
            double term = y[i];
            for (int j = 0; j < x.length; j++) {
                if (j != i) {
                    term *= (targetX - x[j] / (x[i] - x[j]));
                }
            }
            result += term;
        }
        return result;
    }
}
