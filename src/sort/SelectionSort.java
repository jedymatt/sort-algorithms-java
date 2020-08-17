package sort;

public class SelectionSort {

    private SelectionSort() {

    }

    public static void sortAscend(int[] array) {
        for (int i = array.length - 1; i > 0; i--) { // first sorted index
            int largest = 0; //container of the index of the largest element inside unsorted array
            for (int j = 0; j <= i; j++) { // unsorted elements
                if (array[j] > array[largest]) { // looks for the largest element inside the unsorted array
                    largest = j; //transfers the new largest index
                }
            }
            // swap is dismissed if first sorted index are the same of the largest index
            swap(array, largest, i);//swap the last unsorted index to the larger element    
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
