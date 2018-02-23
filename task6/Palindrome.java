package task6;

/*O(N)*/

import task6.util.MyStack;
import task6.util.StackContainer;

public class Palindrome {

    public static boolean checkPalindrome(int num) {

        if(num > 0) {

            boolean isPalindrome = true;

            int number = num;
            StackContainer<Integer> stackContainer = new StackContainer<>();

            while (number > 0) {
                stackContainer.push(number % 10);
                number /= 10;
            }

            while (num > 0) {
                if (stackContainer.pop() != num % 10) {
                    isPalindrome = false;
                    break;
                }
                num /= 10;
            }

            return isPalindrome;

        } else {

            return false;

        }

    }
}
