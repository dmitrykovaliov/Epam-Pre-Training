package task4.task4_2;

import com.sun.istack.internal.NotNull;

public class Logic {

    public static double computePOW(double num, int power) throws NullNumberException {
        if (num != 0) {
            double result = 1;
            int n = Math.abs(power);

            for (int i = 0; i < n; i++) {
                result *= num;
            }

            if (power < 0) {
                result = 1 / result;
            }

            if (num < 0 && power % 2 == 0) {
                result = -result;  //supporting sign of number
            }

            return result;
        } else {
            throw new NullNumberException("Please enter real number except zero");
        }

    }

    public static double computeRecursivePOW(double num, int power) throws NullNumberException {
        if (num != 0) {

            if (power == 0) {
                return Math.abs(num) / num;
            }

            int n = Math.abs(power);

            if (power < 0) {
                return 1 / revertPOW(num, n);
            }

            return revertPOW(num, n);

        } else {
            throw new NullNumberException("Please enter real number except zero");
        }
    }

    private static double revertPOW(double num, int n) {
        return n > 0 ? num * revertPOW(num, n - 1) : 1;
    }

}