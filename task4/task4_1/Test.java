package task4.task4_1;

public class Test {

    public static void main(String[] args) {

        int a = 28;
        int a1 = -165453;
        int a2 = 165987453;
        int a3 = 0;

        View.print("Sum of digits: " + Logic.computeDigitsSum(a));
        View.print("Sum of digits: " + Logic.computeDigitsSum(a1));
        View.print("Sum of digits: " + Logic.computeDigitsSum(a2));
        View.print("Sum of digits: " + Logic.computeDigitsSum(a3) + "\n");

        View.print("Sum of digits (recursive): " + Logic.computeRecursiveDigitsSum(a));
        View.print("Sum of digits (recursive): " + Logic.computeRecursiveDigitsSum(a1));
        View.print("Sum of digits (recursive): " + Logic.computeRecursiveDigitsSum(a2));
        View.print("Sum of digits (recursive): " + Logic.computeRecursiveDigitsSum(a3));

    }
}
