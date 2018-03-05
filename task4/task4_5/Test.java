package task4.task4_5;


import task6.view.View;

public class Test {

    public static void main(String[] args) {

        int a = 3;

        try {
            View.print(HanoiTower.makeTower(a, 'A', 'B', 'C'));
        } catch (NotNaturalNumber e) {
            e.printStackTrace();
        }

    }
}
