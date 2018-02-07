package task1.task1_6;

public class DigitsCalc1 {

    public static double getArifMean(int a) {

        int sixthDigit = a % 10;
        int fifthDigit = (a/=10) % 10;
        int forthDigit = (a/=10) % 10;
        int thirdDigit = (a/=10) % 10;
        int secondDigit = (a/=10) % 10;
        int firstDigit = a/10;

        return (firstDigit + secondDigit + thirdDigit +
                forthDigit + fifthDigit + sixthDigit) / 6;
    }

    public static double getGeometMean(int a) {

        int sixthDigit = a % 10;
        int fifthDigit = (a/=10) % 10;
        int forthDigit = (a/=10) % 10;
        int thirdDigit = (a/=10) % 10;
        int secondDigit = (a/=10) % 10;
        int firstDigit = a/10;

        return  Math.pow(firstDigit * secondDigit * thirdDigit * forthDigit *
                fifthDigit * sixthDigit, 1.0 / 6);
    }

}
