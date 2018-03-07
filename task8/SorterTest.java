package task8;

import java.util.Arrays;

public class SorterTest {

    public static void main(String[] args) {

        Integer[] a = {1, 8, 3, 5, 2};

       Sorter.bubbleSort(a);
       View.print(Arrays.toString(a));

        Integer[] a1 = {1, 8, 3, 5, 2};

       Sorter.insertionSort(a1);
       View.print(Arrays.toString(a1));

        Integer[] a2 = {1, 8, 3, 5, 2};

        Sorter.selectionSort(a2);
        View.print(Arrays.toString(a2));

        Integer[] a3 = {1, 8, 3, 5, 2};

        Sorter.mergeSort(a3);
        View.print(Arrays.toString(a3));

        Integer[] a4 = {1, 8, 3, 5, 2};

       Sorter.quickSort(a4);
       View.print(Arrays.toString(a4));

    }
}
