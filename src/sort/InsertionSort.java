package sort;

public class InsertionSort {

    private InsertionSort() {

    }

    public static void sortAscend(int[] array) { // lisod i-explain, sunod nalang ahahha
        for (int i = 1; i < array.length; i++) { // first unsorted index
            int temp = array[i]; // hold the value of the first unsorted index
            int j = i;
            for (; j > 0; j--) {
                if (temp < array[j - 1]) { // compare the value of unsorted and the sorted
                    array[j] = array[j - 1];
                } else {
                    break; // loop stops to where the temp is greater than the unsorted
                }
            }
            /*
             * This is a much shorter loop compared to the one on top
             * if the else condition has break, it can be shorten by putting
             * the condition in the for loop condition. it is much efficient.
                for (; j > 0 && temp < array[j - 1]; j--) {
                    array[j] = array[j - 1];
                }
             */
            array[j] = temp; // use the index of where the j stopped and put the temp value(first unsorted) in the array
        }
    }

}
