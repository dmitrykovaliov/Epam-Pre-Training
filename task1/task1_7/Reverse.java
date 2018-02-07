package task1.task1_7;

public class Reverse {

    public static int reverseDigits(int a) {

        int  revSum = a % 10;

        revSum = revSum*10 + (a /= 10) % 10;
        revSum = revSum*10 + (a /= 10) % 10;
        revSum = revSum*10 + (a /= 10) % 10;
        revSum = revSum*10 + (a /= 10) % 10;
        revSum = revSum*10 + (a /= 10) % 10;
        revSum = revSum*10 + a /10;

        return revSum;

    }
}
