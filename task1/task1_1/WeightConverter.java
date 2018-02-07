package task1.task1_1;

public class WeightConverter {

    public static final double GRAM_PER_KG = 1000;
    public static final double GRAM_PER_TON = 1000000;

    public static double calcInKilogram(double gramWeight) {
        return gramWeight/GRAM_PER_KG;
    }
    public static double calcInTon(double gramWeight) {
        return gramWeight/GRAM_PER_TON;
    }

}
