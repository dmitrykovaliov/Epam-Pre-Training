package task3.task3_2_3;

import task3.task3_2_1.CheckNumber;

public class PrimeNumber {

    public static boolean isPrimeNumber(int number) {

       CheckNumber.checkNaturalNumber(number);

        boolean isPrime = true;

        if (number == 1) {  // 1 not prime number

            isPrime = false;

        } else if(number >= 4) {  // 2, 3 passed as these are prime

            for (int i = 2; i <= number / 2; i++) {   // (number / 2)  -  to double reduce of cycles

                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;

    }

}
