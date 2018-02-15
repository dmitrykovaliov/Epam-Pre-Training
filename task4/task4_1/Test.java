package task4.task4_1;


import sun.rmi.runtime.Log;

public class Test {

    public static void main(String[] args) {

        int a = 28;
        int a1 = -165453;
        int a2 = 165987453;

        View.print("Sum of digits: " + Logic.computeDigitsSum(a));
        View.print("Sum of digits: " + Logic.computeDigitsSum(a1));
        View.print("Sum of digits: " + Logic.computeDigitsSum(a2));

    }
}
