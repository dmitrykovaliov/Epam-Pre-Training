package task3.task3_2_2;


import task3.task3_2_1.CheckNumber;

public class Palindrome {

    public static boolean checkPalindrome(int number) {

        CheckNumber.checkNaturalNumber(number);

        return number == reverseNumber(number); // true - checkPalindrome
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
