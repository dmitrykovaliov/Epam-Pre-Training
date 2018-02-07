package task3.task3_3;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {


        int i = 2;
        int sum = 1;

        if (number > 1) {

            while (number / 2 >= i) {
                if (number % i == 0) {
                    sum += i;
                }

                i++;
            }

        }

        return sum == number;

    }
}
