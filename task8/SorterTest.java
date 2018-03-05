package task8;

import java.util.Arrays;

public class SorterTest {

    public static void main(String[] args) {

        Integer[] a = {1, 2, 5, 9, 7, 15, 3};



        Sorter.bubbleSort(a);
        View.print(Arrays.toString(a));

        Sorter.insertionSort(a);
        View.print(Arrays.toString(a));

        Sorter.selectionSort(a);
        View.print(Arrays.toString(a));

        Sorter.mergeSort(a);
         View.print(Arrays.toString(a));

        Sorter.quickSort(a);
        View.print(Arrays.toString(a));

    }
}
