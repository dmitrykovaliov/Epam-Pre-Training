package task4.task4_1;

public class Logic {

    public static long computeDigitsSum(int num) {

        int number = Math.abs(num); //to make working with negative numbers
        int sum = 0;

        while (number > 0) {
            sum += number% 10;
            number /= 10;
        }

        return sum;
    }

    public static long computeRecursiveDigitsSum(int num) {

        int number = Math.abs(num); //to make working with negative numbers
        return computeRecDigitsSum(number);

    }

    public static long computeRecDigitsSum(int num) {
        return num > 0 ? num % 10 + computeRecursiveDigitsSum(num / 10) : 0;
    }

}
