package task4.task4_5;

public class HanoiTower {


    public static String makeTower(int discNumber, char A,
                                 char B, char C) throws NotNaturalNumber {

        if (discNumber > 0) {
            return revertTower(discNumber, A, B, C);
        } else {
            throw new NotNaturalNumber("Please enter natural number");
        }
    }

    private static String revertTower (int discNumber, char A,
                                   char B, char C)  {

        if (discNumber > 0) {
            return revertTower(discNumber - 1, A, C, B) +
                    A + "-->" + B + "\n" +
                    revertTower(discNumber - 1, C, B, A)
            ;
        } else {
            return "";
        }
    }
}
