package task2.task2_4;

import java.util.GregorianCalendar;

public class NextDate {

    public static String calNextDate(int day, int month, int year) {

        isCorrectInput(day, month, year);

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31) {
                    month++;
                    day = 1;
                } else {
                    day++;
                }
                break;
            case 2:
                if ( !isLeapYear(year) && day == 28 || isLeapYear(year) && day == 29 ) {
                    month++;
                    day = 1;
                } else {
                    day++;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    month++;
                    day = 1;
                } else {
                    day++;
                }
                break;
            case 12:
                if (day == 31) {
                    year++;
                    month = 1;
                    day = 1;
                } else {
                    day++;
                }
        }

        return String.format("%02d.%02d.%d", day, month, year);
    }


    public static boolean isLeapYear(int year) {

        return new GregorianCalendar().isLeapYear(year);

    }

    public static boolean isCorrectYear(int year) {


        return year >= 1;

    }

    public static boolean isCorrectMonth(int month) {

        return month >= 1 && month <= 12;

    }

    public static boolean isCorrectDay(int day, int month, int year) {

        boolean isCorrect = false;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                isCorrect = day >= 1 && day <= 31;
                break;
            case 2:
                isCorrect = isLeapYear(year) ? day >= 1 && day <= 29 :
                        day >= 1 && day <= 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                isCorrect = day >= 1 && day <= 30;
                break;
        }

        return isCorrect;
    }

    public static void isCorrectInput(int day, int month, int year) {
        if (!isCorrectYear(year)) {
            try {
                throw new Exception("Please check year");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (!isCorrectMonth(month)) {
            try {
                throw new Exception("Please check month");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }

        if (!isCorrectDay(day, month, year)) {
            try {
                throw new Exception("Please check day");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}

