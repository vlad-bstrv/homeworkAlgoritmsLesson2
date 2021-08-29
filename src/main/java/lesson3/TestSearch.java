package lesson3;

public class TestSearch {
    public static void main(String[] args) {
        int[] a = {1, 2 ,3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};
        int[] b = {1, 2, 4, 5, 6};
        int[] c = {};

        System.out.println(SearchNumber.search(a));
        System.out.println(SearchNumber.search(b));
        System.out.println(SearchNumber.search(c));
    }
}
