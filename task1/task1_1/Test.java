package task1.task1_1;

public class Test {
    public static void main(String[] args) {

        double gramWeight = 3000;
        double kgWeight ;
        double tonWeight;

        kgWeight = task1.task1_1.WeightConverter.calcInKilogram(gramWeight);
        tonWeight = WeightConverter.calcInTon(gramWeight);

        System.out.printf("Weight in kg: %.3f, weight in tons: %.3f", kgWeight, tonWeight);

    }
}
