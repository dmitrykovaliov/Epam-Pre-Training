package task4.task4_2;


public class Test {

    public static void main(String[] args) {

        double x = -3; int n = 1;
        double x1 = 3; int n1 = 1;
        double x2 = -3; int n2 = 0;
        double x3 = 3; int n3 = 0;
        double x4 = -3; int n4 = 5;
        double x5 = 3; int n5 = 4;
        double x6 = -3; int n6 = 7;
        double x7 = 3; int n7 = -3;
        double x8 = 5; int n8 = -5;

        try {
            View.print(String.format("Result: %.5f", Logic.computePOW(x, n)));
            View.print(String.format("Result: %.5f", Logic.computePOW(x1, n1)));
            View.print(String.format("Result: %.5f", Logic.computePOW(x2, n2)));
            View.print(String.format("Result: %.5f", Logic.computePOW(x3, n3)));
            View.print(String.format("Result: %.5f", Logic.computePOW(x4, n4)));
            View.print(String.format("Result: %.5f", Logic.computePOW(x5, n5)));
            View.print(String.format("Result: %.5f", Logic.computePOW(x6, n6)));
            View.print(String.format("Result: %.5f", Logic.computePOW(x7, n7)));
            View.print(String.format("Result: %.5f\n", Logic.computePOW(x8, n8)));


            View.print(String.format("Result: %.5f", Logic.computeRecursivePOW(x, n)));
            View.print(String.format("Result: %.5f", Logic.computeRecursivePOW(x1, n1)));
            View.print(String.format("Result: %.5f", Logic.computeRecursivePOW(x2, n2)));
            View.print(String.format("Result: %.5f", Logic.computeRecursivePOW(x3, n3)));
            View.print(String.format("Result: %.5f", Logic.computeRecursivePOW(x4, n4)));
            View.print(String.format("Result: %.5f", Logic.computeRecursivePOW(x5, n5)));
            View.print(String.format("Result: %.5f", Logic.computeRecursivePOW(x6, n6)));
            View.print(String.format("Result: %.5f", Logic.computeRecursivePOW(x7, n7)));
            View.print(String.format("Result: %.5f", Logic.computeRecursivePOW(x8, n8)));
        } catch (NullNumberException e) {
            e.printStackTrace();
        }

    }
}
