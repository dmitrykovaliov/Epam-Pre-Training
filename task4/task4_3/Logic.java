package task4.task4_3;


public class Logic {

    public static boolean equalDigitsSum(int a, int b) throws NotNaturalNumber {
        if (b > 0) {
            return task4.task4_1.Logic.computeDigitsSum(a) == b;
        } else {
            throw new NotNaturalNumber("Please enter natural number");
        }
    }

    public static boolean equalRecursiveDigitsSum(int a, int b) throws NotNaturalNumber {

        if (b > 0) {
            a = Math.abs(a);
            return revertRecursive(a, b);

        } else {
            throw new NotNaturalNumber("Please enter natural number");
        }
    }

    private static boolean revertRecursive(int a, int b) {

        return a > 0 ? revertRecursive(a / 10, b - a % 10) : a == b;
    }

}

