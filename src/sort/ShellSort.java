/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author Jedy Matt
 */
public class ShellSort {

    private ShellSort() {

    }

    public static void sortAscending(int[] array) {
        int gap = array.length / 2; // same as insertion sort but has gap greater than one
        while (gap > 0) {  // while reducing the gap until 1(insertion sort)
            for (int i = gap; i < array.length; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap; j -= gap) {
                    if (temp < array[j - gap]) {
                        array[j] = array[j - gap];
                    } else {
                        break;
                    }
                }
                // same as the insertion sort, the loop at the above can be achieved in a lesser code
                // refer to the comment in the insertion sort
                array[j] = temp;
            }
            gap /= 2;
        }
    }
}
