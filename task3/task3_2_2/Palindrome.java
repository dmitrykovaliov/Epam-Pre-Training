package task3.task3_2_2;

public class Palindrome {

    public static boolean isPalindrome(int number) {

        number = Math.abs(number); //to make working with negative numbers

        return number == reverseNumber(number); // true - isPalindrome
    }

    public static int reverseNumber(int number) {

        int revNumber = 0;

        while (number > 0) {
            revNumber = revNumber * 10 + number % 10;
            number /= 10;
        }

        return revNumber;
    }
}
