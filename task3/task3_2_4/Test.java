package task3.task3_2_4;

import task3.task3_2_3.PrimeNumber;

public class Test {

    public static void main(String[] args) {

        int n = 15;
        int n1 = 19;
        int n2 = 4;
        int n3 = 34;
        int n4 = 2;

        View.print(PrimeNumbers.getPrimeNumbers(n));
        View.print(PrimeNumbers.getPrimeNumbers(n1));
        View.print(PrimeNumbers.getPrimeNumbers(n2));
        View.print(PrimeNumbers.getPrimeNumbers(n3));
        View.print(PrimeNumbers.getPrimeNumbers(n4));

    }
}
