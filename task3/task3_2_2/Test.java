package task3.task3_2_2;

import task3.task3_2_1.MaxDigit;

public class Test {

    public static void main(String[] args) {

        int n = 156651;
        int n1 = 934898439;
        int n2 = 651548;

        View.print(n, Palindrome.isPalindrome(n) ? "palindrome" : "not palindrome");
        View.print(n1, Palindrome.isPalindrome(n1) ? "palindrome" : "not palindrome");
        View.print(n2, Palindrome.isPalindrome(n2) ? "palindrome" : "not palindrome");

    }
}
