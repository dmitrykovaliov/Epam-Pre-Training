package task1.task1_6;

public class Test {
    public static void main(String[] args) {
        int a = 234567;

        double aMean = DigitsCalc1.getArifMean(a);
        double gMean = DigitsCalc1.getGeometMean(a);

        System.out.printf("Arithmetic mean: %.3f\n", aMean);
        System.out.printf("Geometric mean: %.3f", gMean);
    }
}
