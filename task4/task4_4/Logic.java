package task4.task4_4;

public class Logic {

    public static long computeFibonacci(int num) {

        if(num > 2) {
            int thirst = 0;
            int second = 1;
            int third = 1;

            for (int i = 3; i <= num; i++) {

                third = thirst + second;
                thirst = second;
                second = third;
            }

            return third;
        }

        if(num == 2) {
            return  1;
        }

        if(num == 1) {
            return 0;
        }

        return -1;

    }

    public static long computeRecursiveFibonacci(int num) {

        if(num > 2) {
            return computeRecursiveFibonacci(num - 1) + computeRecursiveFibonacci(num -2);
        }

        if(num == 2) {
            return  1;
        }

        if(num == 1) {
            return 0;
        }

        return -1;
    }
}
