package task3.task3_3;

import task3.task3_2_1.CheckNumber;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        CheckNumber.checkNaturalNumber(number);

        //int i = 2;
        int sum = 1;
        int halfNumber = number / 2;

        if (number > 1) {

            /*while (halfNumber >= i) {
                if (number % i == 0) {
                    sum += i;
                }
                i++;
            }*/

            for (int i = 2; i <= halfNumber; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

        }

        return sum == number;

    }
}
