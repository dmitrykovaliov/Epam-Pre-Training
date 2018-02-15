package task3.task3_2_6;

import task3.task3_2_1.CheckNumber;

public class DifferentDigits {

    public static int findDifferentDigits(int num) {

        CheckNumber.checkNaturalNumber(num);

        int number = num;

        int count = 0;
        int diffDigits = 0;

        for (int i = 0; i < 10; i++) {  //counts possible digits from 0 to 9

            while (number > 0) {
                if (number % 10 == i) count++;
                number /= 10;
            }
            if (count == 1) diffDigits++; //if digit counts one time, it's unique
            count = 0;
            number = num;
        }

        return diffDigits;
    }
}
