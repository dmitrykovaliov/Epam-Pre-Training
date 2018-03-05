package task8;

public class SearcherTest {
    public static void main(String[] args) {

        Integer[] a = {1, 2, 5, 9, 7, 15, 3};


        View.print(Searcher.linearSearch(a, 3) + "");

        Sorter.quickSort(a);
        View.print(Searcher.binarySearch(a, 3) + "");
        View.print(Searcher.recBinarySearch(a, 3) + "");
    }
}
