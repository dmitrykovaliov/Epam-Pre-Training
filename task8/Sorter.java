package task8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Sorter {

    public static <T extends Comparable> void bubbleSort(T[] a) {

        int length = a.length;

        for (int j = 0; j < length - 1; j++) {
            boolean isSorted = true;
            for (int i = 0; i < length - 1 - j; i++) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    isSorted = false;
                    swap(a, i, i + 1);
                }
            }
            if (isSorted) break;
        }

        //O(n2)
    }

    public static <T extends Comparable> void insertionSort(T[] a) {

        int length = a.length;

        for (int j = 0; j < length - 1; j++) {

            T item = a[j];

            int i = j;

            while (i > 0 && a[i - 1].compareTo(item) > 0) {
                a[i] = a[i - 1];
                i--;
                a[i] = item;
            }
        }

        // O(n2)
    }

    public static <T extends Comparable> void selectionSort(T[] a) {

        int length = a.length;

        for (int i = 0; i < length - 2; i++) {
            int min = i;
            for (int j = i + 1; j < length - 1; j++) {
                if (a[i].compareTo(a[min]) > 0) {
                    min = j;
                }
            }

            if (min != i) {
                swap(a, min, i);
            }
        }

        // O(n2)
    }

    public static <T extends Comparable> void mergeSort(T[] a) {

        recMergeSort(a, 0, a.length - 1);

        // O(n * log(n))
    }

    private static <T extends Comparable> void recMergeSort(T[] a, int start, int end) {

        if (end > start) {
            int mid = (start + end) / 2;

            recMergeSort(a, start, mid);
            recMergeSort(a, mid + 1, end);

            merge(a, start, mid, end);
        }
    }

    private static <T extends Comparable> void merge(T[] a, int start, int mid, int end) {

        T[] helper = (T[]) Array.newInstance(a.getClass().getComponentType(), a.length);


        for (int i = start; i <= end; i++) {
            helper[i] = a[i];
        }

        int helperLeft = start;
        int helperRight = mid + 1;
        int current = start;

        while (helperLeft <= mid && helperRight <= end) {
            if (helper[helperLeft].compareTo(helper[helperRight]) < 0) {
                a[current] = helper[helperLeft];
                helperLeft++;

            } else {
                a[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = mid - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            a[current + i] = helper[helperLeft + i];
        }

    }

    public static <T extends Comparable> void quickSort(T[] a) {
        recursiveQuickSort(a, 0, a.length - 1);
        // O(n2)
    }


    public static <T extends Comparable> void recursiveQuickSort(T[] array, int start, int end) {

        int id = partition(array, start, end);

        if (start < id - 1) {
            recursiveQuickSort(array, start, id - 1);
        }

        // Recursively call quick sort with right part of the partitioned array
        if (end > id) {
            recursiveQuickSort(array, id, end);
        }
    }


    public static <T extends Comparable> int partition(T[] array, int left, int right) {
        T pivot = array[left]; // taking first element as pivot

        while (left <= right) {
            while (array[left].compareTo(pivot) < 0) {
                left++;
            }
            while (array[right].compareTo(pivot) > 0) {
                right--;
            }

            if (left <= right) {
                swap(array, left, right);

                left++;
                right--;
            }
        }
        return left;
    }


    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
