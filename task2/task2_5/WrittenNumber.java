package task2.task2_5;

public class WrittenNumber {

    public static final String ONE = "One";
    public static final String TWO = "Two";
    public static final String THREE = "Three";
    public static final String FOUR = "Four";
    public static final String FIVE = "Five";
    public static final String SIX = "Six";
    public static final String SEVEN = "Seven";
    public static final String EIGHT = "Eight";
    public static final String NINE = "Nine";

    public static final String TEN = "Ten";
    public static final String ELEVEN = "Eleven";
    public static final String TWELVE = "Twelve";
    public static final String THIRTEEN = "Thirteen";
    public static final String FOURTEEN = "Fourteen";
    public static final String FIFTEEN = "Fifteen";
    public static final String SIXTEEN = "Sixteen";
    public static final String SEVENTEEN = "Seventeen";
    public static final String EIGHTEEN = "Eighteen";
    public static final String NINETEEN = "Nineteen";

    public static final String TWENTY = "Twenty";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String FIFTY = "Fifty";
    public static final String SIXTY = "Sixty";
    public static final String SEVENTY = "Seventy";
    public static final String EIGHTY = "Eighty";
    public static final String NINETY = "Ninety";

    public static final String HUNDRED = "Hundred";

    public static String writtenNumber;


    public static String getWrittenNumber(int number) {

        if(number < 1) {

            try {
                throw new Exception("Please check the number");
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if(number < 10) {

           writtenNumber  = group1(number);

        } else if (number < 20) {

            writtenNumber = group2(number);

        } else if(number < 100) {

            int secondPart = number % 10;
            int thirstPart = number/10 * 10;

            writtenNumber = group3(thirstPart) + " " + group1(secondPart);

        } else if(number < 110) {

            int secondPart = number % 10;
            int thirstPart = number / 100;

            writtenNumber = group1(thirstPart) + " " + HUNDRED +
                    " " + group1(secondPart);

        } else if(number < 120) {

            int secondPart = number % 100;
            int thirstPart = number/100;

            writtenNumber = group1(thirstPart) + " " + HUNDRED +
                    " " + group2(secondPart);
        } else if(number < 1000) {

            int thirdPart = number % 10;
            int secondPart = ((number/=10) % 10) * 10;
            int thirstPart = (number /= 10) % 10;

            writtenNumber = group1(thirstPart) + " " + HUNDRED + " " +
                    group3(secondPart) + " " + group1(thirdPart);
        }

        return writtenNumber;
    }


    public static String group1 (int part) {
        String wNumber = "";
        switch (part) {
            case 1: wNumber = ONE;
                break;
            case 2: wNumber = TWO;
                break;
            case 3: wNumber = THREE;
                break;
            case 4: wNumber = FOUR;
                break;
            case 5: wNumber = FIVE;
                break;
            case 6: wNumber = SIX;
                break;
            case 7: wNumber = SEVEN;
                break;
            case 8: wNumber = EIGHT;
                break;
            case 9: wNumber = NINE;
                break;
        }
        return wNumber;
    }

    public static String group2 (int part) {
        String wNumber = "";
        switch (part) {
            case 10: wNumber = TEN;
                break;
            case 11: wNumber = ELEVEN;
                break;
            case 12: wNumber = TWELVE;
                break;
            case 13: wNumber = THIRTEEN;
                break;
            case 14: wNumber = FOURTEEN;
                break;
            case 15: wNumber = FIFTEEN;
                break;
            case 16: wNumber = SIXTEEN;
                break;
            case 17: wNumber = SEVENTEEN;
                break;
            case 18: wNumber = EIGHTEEN;
                break;
            case 19: wNumber = NINETEEN;
                break;
        }
        return wNumber;
    }

    public static String group3 (int part) {
        String wNumber = "";
        switch (part) {
            case 20: wNumber = TWENTY;
                break;
            case 30: wNumber = THIRTY;
                break;
            case 40: wNumber = FORTY;
                break;
            case 50: wNumber = FIFTY;
                break;
            case 60: wNumber = SIXTY;
                break;
            case 70: wNumber = SEVENTY;
                break;
            case 80: wNumber = EIGHTY;
                break;
            case 90: wNumber = NINETY;
                break;
        }
        return wNumber;
    }
}
