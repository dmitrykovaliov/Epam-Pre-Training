package task3.task3_3;

public class Test {

    public static void main(String[] args) {

        int n = 28;
        int n1 = 2;
        int n2 = 6;
        int n3 = 8128;
        int n4 = 8127;

        View.print(PerfectNumber.isPerfectNumber(n) ? "perfect" : "not perfect");
        View.print(PerfectNumber.isPerfectNumber(n1) ? "perfect" : "not perfect");
        View.print(PerfectNumber.isPerfectNumber(n2) ? "perfect" : "not perfect");
        View.print(PerfectNumber.isPerfectNumber(n3) ? "perfect" : "not perfect");
        View.print(PerfectNumber.isPerfectNumber(n4) ? "perfect" : "not perfect");


    }
}
