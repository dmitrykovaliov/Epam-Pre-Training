package task3.task3_2_5;

import task3.task3_2_1.CheckNumber;


public class CommonCalculator {

    public static int calcGreatestCommonDiviser(int a, int b) {

        CheckNumber.checkNaturalNumber(a);
        CheckNumber.checkNaturalNumber(b);

        while(a != b) {

            if(a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

       return a;
    }

    public static int calcLeastCommonMultiple(int a, int b) {

        CheckNumber.checkNaturalNumber(a);
        CheckNumber.checkNaturalNumber(b);

        int lcm = a > b ? a : b;

        while(!(lcm % a == 0 && lcm % b == 0)) {

            lcm++;
        }

        return lcm;
    }

}
