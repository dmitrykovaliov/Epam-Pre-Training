package task8;

public class Searcher {

    public static <T extends Comparable> int linearSearch(T[]a, T item) {
//O(N)
        int length = a.length;

        for (int i = 0; i < a.length; i++) {
            if(a[i].compareTo(item) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static <T extends Comparable> int binarySearch(T[]a, T item) {

        //O(log(N))

        int start = 0;
        int end = a.length;

        while(end >= start) {

            int mid = (start + end) / 2;

            if(a[mid].compareTo(item) < 0) {
                start = mid + 1;
            } else if (a[mid].compareTo(item) > 0) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static <T extends Comparable> int recBinarySearch(T[]a, T item) {
        int start = 0;
        int end = a.length;
        return recBinarySearch(a, item, start, end);
    }

    private static <T extends Comparable> int recBinarySearch(T[] a, T item, int start, int end) {
        if(end >= start) {

            int mid = (start + end) / 2;

            if(a[mid].compareTo(item) < 0) {
                return recBinarySearch(a, item, mid + 1, end);
            } else if (a[mid].compareTo(item) > 0) {
                return recBinarySearch(a, item, start, mid - 1);
            } else {
                return mid;
            }
        } else {
            return -1;
        }
    }


}
