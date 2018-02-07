package task3.task3_2_1;

public class MaxDigit {


    public static int getMaxDigit(int number) {

       CheckNumber.checkNaturalNumber(number);

        int max = number % 10;

        while (number > 0) {
            int currentDigit = (number /= 10) % 10;

            if (currentDigit > max) {
                max = currentDigit;
            }
        }

        return max;
    }



}
