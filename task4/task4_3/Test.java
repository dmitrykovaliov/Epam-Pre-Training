package task4.task4_3;


public class Test {

    public static void main(String[] args) {

        int a = 1234567;
        int b = 28;

        int a1 = 1151;
        int b1 = 515;

        int a2 = 20000;
        int b2 = 2;

        View.print("Equal: " + Logic.equalDigitsSum(a,b));
        View.print("Equal: " + Logic.equalDigitsSum(a1,b1));
        View.print("Equal: " + Logic.equalDigitsSum(a2,b2));

    }
}
