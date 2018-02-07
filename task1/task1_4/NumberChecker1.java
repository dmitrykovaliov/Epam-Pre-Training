package task1.task1_4;

public class NumberChecker1 {

    public static boolean checkUpwardDigits(int a) {

        int forthDigit = a % 10;
        int thirdDigit = (a /= 10) % 10;
        int secondDigit = (a /= 10) % 10;
        int firstDigit = a / 10;

        return firstDigit < secondDigit && secondDigit < thirdDigit && thirdDigit < forthDigit;

    }

    public static boolean checkDownwardDigits(int a) {
        int forthDigit = a % 10;
        int thirdDigit = (a /= 10) % 10;
        int secondDigit = (a /= 10) % 10;
        int firstDigit = a / 10;

        return firstDigit > secondDigit && secondDigit > thirdDigit && thirdDigit > forthDigit;

    }
}
