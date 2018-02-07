package task3.task3_2_4;

import task3.task3_2_1.CheckNumber;
import task3.task3_2_3.PrimeNumber;

import java.util.ArrayList;


public class PrimeNumbers {

    public static ArrayList<Integer> getPrimeNumbers(int number) {

        CheckNumber.checkNaturalNumber(number);
        ArrayList<Integer> primeArray = new ArrayList<>();

        if (number > 1) {  //for number equal 1 no result

            int i = 2;

            while (number != 1) {

                if (number % i == 0 && PrimeNumber.isPrimeNumber(i)) {
                    primeArray.add(i);
                    number /= i;
                } else {
                    i++;
                }
            }

        }

        return primeArray;
    }

}
