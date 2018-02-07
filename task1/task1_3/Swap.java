package task1.task1_3;

public  class Swap {

    public static void getSwap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.printf("a = %d, b = %d", a, b);
    }
}
