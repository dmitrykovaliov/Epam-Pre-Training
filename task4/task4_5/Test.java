package task4.task4_5;


public class Test {

    public static void main(String[] args) {

        int a = 2;

        try {
            View.print(HanoiTower.makeTower(a, 'A', 'B', 'C'));
        } catch (NotNaturalNumber e) {
            e.printStackTrace();
        }

    }
}
