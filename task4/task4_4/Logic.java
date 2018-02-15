package task4.task4_4;

public class Logic {

public static long result = 0;

    public static long computeFibonacci(int num) {

        if(num > 2) {
            result = computeFibonacci(num - 1) + computeFibonacci(num -2);
        } else if(num == 2) {
            result = 1;
        } else if(num == 1) {
            result = 0;
        } else {
            result = -1;
        }

        return result;
    }
}
