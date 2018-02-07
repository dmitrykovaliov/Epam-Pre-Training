package task3.task3_2_3;

public class Test {

    public static void main(String[] args) {

        int n = 15;
        int n1 = 19;
        int n2 = 4;
        int n3 = 3;
        int n4 = 2;

        View.print(n, PrimeNumber.isPrimeNumber(n) ? "prime" : "not prime");
        View.print(n1, PrimeNumber.isPrimeNumber(n1) ? "prime" : "not prime");
        View.print(n2, PrimeNumber.isPrimeNumber(n2) ? "prime" : "not prime");
        View.print(n3, PrimeNumber.isPrimeNumber(n3) ? "prime" : "not prime");
        View.print(n4, PrimeNumber.isPrimeNumber(n4) ? "prime" : "not prime");

    }
}
