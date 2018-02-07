package task3.task3_2_3;

public class PrimeNumber {

    public static boolean isPrimeNumber(int number) {

        number = Math.abs(number); //to make working with negative numbers

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
