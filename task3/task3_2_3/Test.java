package task3.task3_2_3;

public class Test {

    public static void main(String[] args) {

        int n = 15;
        int n1 = 19;
        int n2 = 4;
        int n3 = 3;
        int n4 = 2;

        View.print(PrimeNumber.checkPrimeNumber(n) ? "prime" : "not prime");
        View.print(PrimeNumber.checkPrimeNumber(n1) ? "prime" : "not prime");
        View.print(PrimeNumber.checkPrimeNumber(n2) ? "prime" : "not prime");
        View.print(PrimeNumber.checkPrimeNumber(n3) ? "prime" : "not prime");
        View.print(PrimeNumber.checkPrimeNumber(n4) ? "prime" : "not prime");

    }
}
