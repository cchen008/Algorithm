package org.example.sorting;

public class BubbleSort {
    //Time complexity: O(n^2) Worst case is when array is sorted in descending order
    //Space complexity: O(1)
    public int[] bubbleSort(int[] array) {
        boolean isSwapped = true;

        //if no swap has happened, stop looping
        while(isSwapped) {
            isSwapped = false;
            //Go through array and swap if the current element is smaller than the previous
            for(int i = 1; i < array.length; i++) {
                int prev = array[i-1];
                int cur = array[i];
                if(cur < prev) {
                    array[i-1] = cur;
                    array[i] = prev;
                    isSwapped = true;
                }
            }
        }

        return array;
    }
}
