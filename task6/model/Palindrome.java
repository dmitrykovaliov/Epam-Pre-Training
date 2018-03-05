package task6.model;

/*O(N)*/

import task6.exception.OutIndexException;
import task6.util.array.ArListStack;

import java.util.Stack;

public class Palindrome {

    public static boolean checkPalindrome(String str) throws OutIndexException {

        int firstHalf = str.length() / 2;
        int secondHalf = str.length() - firstHalf;

        ArListStack<Character> stack = new ArListStack<>();

        //pushing first half
        for (int i = 0; i < firstHalf; i++) {
            stack.push(str.charAt(i));
        }

        // popping peek items and comparing with second half
        for (int i = secondHalf; i < str.length(); i++) {
            if (stack.pop() != str.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
