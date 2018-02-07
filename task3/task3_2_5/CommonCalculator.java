package task3.task3_2_5;

public class CommonCalculator {

    public static int getGreatestCommonDiviser(int a, int b) {

        while(a != b) {

            if(a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

       return a;
    }

    public static int getLeastCommonMultiple(int a, int b) {

        int lcm = a > b ? a : b;

        while(!(lcm % a == 0 && lcm % b == 0)) {

            lcm++;
        }

        return lcm;
    }

}
