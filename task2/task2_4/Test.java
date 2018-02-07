package task2.task2_4;

public class Test {

    public static void main(String[] args) {


        View.print(NextDate.calNextDate(1, 1, 2018));
        View.print(NextDate.calNextDate(31, 1, 2018));
        View.print(NextDate.calNextDate(28, 2, 2018));
        View.print(NextDate.calNextDate(28, 2, 2020));
        View.print(NextDate.calNextDate(29, 2, 2020));
        View.print(NextDate.calNextDate(30, 4, 2018));
        View.print(NextDate.calNextDate(31, 7, 2018));
        View.print(NextDate.calNextDate(31, 12, 2018));

    }
}
