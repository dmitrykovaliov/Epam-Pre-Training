package task4.task4_1;

public class Logic {

    public static long computeDigitsSum(int num) {

        int number = Math.abs(num); //to make working with negative numbers

        return number > 0 ? number % 10 + computeDigitsSum(number / 10) : 0;
    }
}
