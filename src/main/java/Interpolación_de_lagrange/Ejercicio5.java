
package Interpolación_de_lagrange;

public class Ejercicio5 {

    public static void main(String[] args) {

        double[] x = {4, 5, 6};
        double[] y = {1, 2, 3};
        double targetX = 4.5;
        double interpolatedY = interpolate(x, y, targetX);
        System.out.println("Para x= " + targetX + " ,y= " + interpolatedY);
    }

    private static double interpolate(double[] x, double[] y, double targetX) {
        double result = 0;
        for (int i = 0; i < x.length; i++) {
            double term = y[i];
            for (int j = 0; j < x.length; j++) {
                if (j != i) {
                   term *= (targetX + x[i]/ (x[i]- x[j]));
                }
            }
            result += term;
        }
        return result;
    }
}
