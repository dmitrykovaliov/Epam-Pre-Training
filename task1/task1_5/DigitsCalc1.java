package task1.task1_5;

public class DigitsCalc1 {

    public static int getSumOfDigits(int a) {

        int fifthDigit = a % 10;
        int forthDigit = (a/=10) % 10;
        int thirdDigit = (a/=10) % 10;
        int secondDigit = (a/=10) % 10;
        int firstDigit = a/10;

        return firstDigit + secondDigit + thirdDigit + forthDigit + fifthDigit;
    }

    public static int getMultiOfDigits(int a) {

        int fifthDigit = a % 10;
        int forthDigit = (a/=10) % 10;
        int thirdDigit = (a/=10) % 10;
        int secondDigit = (a/=10) % 10;
        int firstDigit = a/10;

        return firstDigit * secondDigit * thirdDigit * forthDigit * fifthDigit;
    }
}
