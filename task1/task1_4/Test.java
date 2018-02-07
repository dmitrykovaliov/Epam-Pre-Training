package task1.task1_4;

public class Test {

    public static void main(String[] args) {
        int number = 6432;

        boolean isUpNumber = NumberChecker1.checkUpwardDigits(number);
        boolean isDownNumber = NumberChecker1.checkDownwardDigits(number);

        if(isUpNumber) {
            System.out.println("Ascending");
        } else if(isDownNumber) {
            System.out.println("Descending");
        } else {
            System.out.println("not ascending/descending");
        }
    }
}
