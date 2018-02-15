package task3.task3_1;

import java.util.Random;

public class HeadsTails {

    public static String calcHeadsTails(int sumSpin) {

        sumSpin = Math.abs(sumSpin);   // check and convert to positive number

        int sumHeads = 0;
        int sumTails = 0;

        Random random = new Random();

        for (int i = 0; i < sumSpin; i++) {

            if (random.nextBoolean()) {
                sumHeads++;
            } else {
                sumTails++;
            }

        }

        return String.format("Heads: %d, Tails: %d", sumHeads, sumTails);

    }
}
