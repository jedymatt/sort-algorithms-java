package sort;

public class BubbleSort {

    private BubbleSort() {

    }

    public static void sortAscend(int[] array) {
        for (int i = array.length - 1; i > 0; i--) { //first sorted index
            for (int j = 0; j < i; j++) { //unsorted elements
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
