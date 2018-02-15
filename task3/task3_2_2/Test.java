package task3.task3_2_2;

public class Test {

    public static void main(String[] args) {

        int n = 156651;
        int n1 = 934898439;
        int n2 = 651548;

        View.print(Palindrome.checkPalindrome(n) ? "palindrome" : "not palindrome");
        View.print(Palindrome.checkPalindrome(n1) ? "palindrome" : "not palindrome");
        View.print(Palindrome.checkPalindrome(n2) ? "palindrome" : "not palindrome");

    }
}
