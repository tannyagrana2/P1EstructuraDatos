package tarea1estructuradatos;

/**
 *
 * @author tannyagranados
 */
public class RecursiveFunctions {

    public double factorial(int num) {
        double result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    public double factorialR(int num) {
        if (num == 1 || num == 0) {
            return 1;
        } else {
            return num * factorialR(num - 1);
        }
    }

    public double calcExponencial(int n, int x) {
        double result = 0;
        for (int i = 0; i < n; i++) {
            result = result + (Math.pow(x, i) / factorial(i));
        }
        return result;
    }

    public double calcExponencialR(int n, int x) {
        if (n == 1) {
            return 1;
        } else if (x == 0) {
            return 0;
        } else {
            return calcExponencial(n - 1, x) + (Math.pow(x, n - 1) / factorialR(n - 1));
        }
    }
}
