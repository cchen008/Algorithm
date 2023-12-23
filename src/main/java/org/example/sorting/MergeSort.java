package org.example.sorting;

import static org.example.helper.ArrayHelper.printArr;

public class MergeSort {
    public static void main(String[] args) {
        // merge sort = recursively divide array in 2, sort, re-combine
        // run-time complexity = O(n Log n)
        // space complexity    = O(n)

        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
        MergeSort mergeSort = new MergeSort();

        printArr(mergeSort.mergeSort(array));

    }

    public int[] mergeSort(int[] array) {
        int len = array.length;

        //Base case to stop recursion
        if(len <= 1) {
            return array;
        }

        int[] left = new int[len / 2];
        int[] right = new int[len - left.length];

        //Go through array and store the values in left and right array
        for(int i = 0; i < len; i++) {
            if(i < left.length) {
                left[i] = array[i];
            }
            else {
                right[i - left.length] = array[i];
            }
        }

        //Recursively go through left and right subarrays until left and right array length == 1
        left = mergeSort(left);
        right = mergeSort(right);
        //Merge the arrays together
        array = merge(left, right);
        //first merge call: left = [8] right = [2] array = [8 2]

        return array;
    }

    public int[] merge(int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int[] array = new int[leftSize + rightSize];
        int l = 0;
        int r = 0;
        int i = 0;

        //Keep looping until left array or right array is empty
        while(l < leftSize && r < rightSize) {
            //Compare the values of left and right array and store the smallest in array
            if(leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                l++;
            }
            else {
                array[i] = rightArray[r];
                r++;
            }
            i++;
        }

        //If there's left elements left, add the remaining left elements to array
        while(l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        //If there's right elements left, add the remaining right elements to array
        while(r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }

        return array;
    }
}
