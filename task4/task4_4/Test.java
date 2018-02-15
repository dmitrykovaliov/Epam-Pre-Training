package task4.task4_4;


import task4.task4_5.View;

public class Test {

    public static void main(String[] args) {

        int b = -5;
        int b1 = 0;
        int b2 = 1; //first 0
        int a = 2;  //second 1
        int a1 = 3;
        int a2 = 4;
        int a3 = 5;
        int a4 = 6;
        int a5 = 7;
        int a6 = 8;
        int a7 = 9;
        int a8 = 10;

        View.print(String.format("Number: %d, result: %d", b, Logic.computeFibonacci(b)));
        View.print(String.format("Number: %d, result: %d", b1, Logic.computeFibonacci(b1)));
        View.print(String.format("Number: %d, result: %d", b2, Logic.computeFibonacci(b2)));
        View.print(String.format("Number: %d, result: %d", a, Logic.computeFibonacci(a)));
        View.print(String.format("Number: %d, result: %d", a1, Logic.computeFibonacci(a1)));
        View.print(String.format("Number: %d, result: %d", a2, Logic.computeFibonacci(a2)));
        View.print(String.format("Number: %d, result: %d", a3, Logic.computeFibonacci(a3)));
        View.print(String.format("Number: %d, result: %d", a4, Logic.computeFibonacci(a4)));
        View.print(String.format("Number: %d, result: %d", a5, Logic.computeFibonacci(a5)));
        View.print(String.format("Number: %d, result: %d", a6, Logic.computeFibonacci(a6)));
        View.print(String.format("Number: %d, result: %d", a7, Logic.computeFibonacci(a7)));
        View.print(String.format("Number: %d, result: %d \n", a8, Logic.computeFibonacci(a8)));

    }
}
