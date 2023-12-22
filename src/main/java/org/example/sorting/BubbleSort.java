package org.example.sorting;


import static org.example.helper.ArrayHelper.printArr;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
        int[] array2 = {8};

        bubbleSort(array);
        bubbleSort(array2);
        printArr(array);
    }

    //Time complexity: O(n^2) Worst case is when array is sorted in descending order
    //Space complexity: O(1)
    public static void bubbleSort(int[] array) {
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
    }
}
