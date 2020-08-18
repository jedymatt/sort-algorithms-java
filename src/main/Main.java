package main;

import java.util.Arrays;
import other.Factorial;
import sort.BubbleSort;
import sort.InsertionSort;
import sort.MergeSort;
import sort.SelectionSort;
import sort.ShellSort;

/**
 *
 * @author Jedy Matt
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Unsorted Array: " + Arrays.toString(array));
//        BubbleSort.sortAscend(array);
//        SelectionSort.sortAscend(array);
//        InsertionSort.sortAscend(array);
//        ShellSort.sortAscending(array);
        System.out.println("Sorted Array(Ascending): " + Arrays.toString(array));

    }
}
