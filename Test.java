import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {

    public static void selectionSort(int[] a) {



        // O(n2)
    }

    public static void main(String[] args) {
            int[] a = {1, 3, 2};

        int length = a.length;

        for (int i = 0; i < length - 2; i++) {
            int min = i;
            for (int j = i + 1; j < length - 1; j++) {
                if (a[i]< a[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int buff = a[i];
                a[i]= a[min];
                a[min] = buff;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
