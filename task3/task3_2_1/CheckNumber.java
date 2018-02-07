package task3.task3_2_1;

public class CheckNumber {

    public static void checkNaturalNumber(int number) {

        if(number < 1) {
            try {
                throw new Exception("Please enter natural number");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
