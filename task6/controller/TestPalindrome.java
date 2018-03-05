package task6.controller;

import task6.exception.EmptySetException;
import task6.exception.OutIndexException;
import task6.model.Palindrome;
import task6.view.View;

public class TestPalindrome {
    public static void main(String[] args) {

        try {
            View.print(Palindrome.checkPalindrome("0"));
            View.print(Palindrome.checkPalindrome("202"));
            View.print(Palindrome.checkPalindrome("5225"));
            View.print(Palindrome.checkPalindrome("16546"));
            View.print(Palindrome.checkPalindrome("256464652"));
        } catch (OutIndexException e) {
            e.printStackTrace();
        }

    }
}
