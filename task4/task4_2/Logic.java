package task4.task4_2;

import task3.task3_2_1.MaxDigit;

public class Logic {

    public static double computePOW(double num, int n) {

        double result = 0;

        if (num != 0) {

            int sign = num > 0 ? 1 : -1;
            double absNumber = sign * num;

            if (n > 0) {
                result = sign * revertPOW(absNumber, n);
            } else if (n < 0) {
                result = sign * revertPOW(1 / absNumber, -n);
            } else {
                result = sign;
            }

        } else {
            try {
                throw new Exception("Please enter real number except zero");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return result;
    }

    public static double revertPOW(double num, int n) {
        return n > 0 ? num * revertPOW(num, n - 1) : 1;
    }
}
