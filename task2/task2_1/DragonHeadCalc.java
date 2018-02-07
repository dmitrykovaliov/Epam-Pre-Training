package task2.task2_1;

public class DragonHeadCalc {

    public static final int INITIAL_HEADS = 3;

    public static final int THREE_HEADS = 3;
    public static final int THREE_HEADS_AGE = 200;

    public static final int TWO_HEADS = 2;
    public static final int TWO_HEADS_AGE = 300;

       public static int getQuantityHeads(int age) {

        int heads = INITIAL_HEADS;

        if(age < 0) {
            try {
                throw new Exception("Please enter correct age");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (age <= THREE_HEADS_AGE) {
            heads += THREE_HEADS * age;
        } else if(age <= TWO_HEADS_AGE) {
            heads += THREE_HEADS_AGE + age * TWO_HEADS;
        } else {
            heads += THREE_HEADS_AGE + TWO_HEADS_AGE + age;
        }

        return heads;
    }

}
