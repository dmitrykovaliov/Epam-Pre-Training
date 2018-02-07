package task1.task1_5;

public class Test {
    public static void main(String[] args) {
        int a = 23456;

        int sumDigits = DigitsCalc1.getSumOfDigits(a);
        int multiDigits = DigitsCalc1.getMultiOfDigits(a);

        System.out.printf("Sum of digits: %d \n", sumDigits);

        System.out.printf("Multiplication of digits: %d", multiDigits);
    }
}
