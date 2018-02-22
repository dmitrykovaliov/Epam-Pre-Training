package task4.task4_5;

public class HanoiTower {

    public static String makeTower(int discNumber, char A,
                                 char B, char C) {

        if (discNumber != 1) {

            makeTower(discNumber - 1, A, C, B);
            return A + "-->" + B + "\n";
           // makeTower(discNumber - 1, C, B, A);

        } else {

            return A + "-->" + B + "\n";

        }

    }
}
