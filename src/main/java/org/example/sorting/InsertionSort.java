package org.example.sorting;

public class InsertionSort {

    // Partition the array between sorted and unsorted. Compare the new value with the largest element
    // in the sorted part of array. If it is smaller, swap the new element with the largest sorted
    // element. Keep swapping if the next largest sorted element is larger than the new element.
    // Time complexity: O(n^2) Notes: Insertion sort worst case is the same as Selection sort but
    // Insertion sort generally will take lesser or equal amount of comparisons.
    // Space complexity: O(1)
    public int[] insertionSort(int[] array) {
        int partition = 1;

        for(int i = 1; i < array.length; i++) {
            int prev = array[i-1];
            int cur = array[i];
            if(cur < prev) {
                array[i - 1] = cur;
                array[i] = prev;
                for(int j = partition - 1; j > 0; j--) {
                    if(array[j] < array[j - 1]) {
                        int temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                    else {
                        break;
                    }
                }
                partition++;
            }
        }

        return array;
    }
}
