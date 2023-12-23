package org.example.junit.sorting;

import org.example.sorting.MergeSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MergeSortTest {
    private final MergeSort mergeSort = new MergeSort();

    @Test
    void givenTwoSameLengthSortedArrays_whenMerge_thenReturnOneSortedArray() {
        int[] leftArray = new int[] {1, 3, 5, 8};
        int[] rightArray = new int[] {2, 4, 6, 7};
        int[] expectedResult = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expectedResult, mergeSort.merge(leftArray, rightArray));
    }

    @Test
    void givenTwoDifferentLengthSortedArrays_whenMerge_thenReturnOneSortedArray() {
        int[] leftArray = new int[] {1, 5, 8};
        int[] rightArray = new int[] {2, 4, 6, 7};
        int[] expectedResult = new int[] {1, 2, 4, 5, 6, 7, 8};
        assertArrayEquals(expectedResult, mergeSort.merge(leftArray, rightArray));
    }

    @Test
    void givenOneZeroElementArray_whenMerge_thenReturnOneSortedArray() {
        int[] leftArray = new int[] {};
        int[] rightArray = new int[] {2, 4, 6, 7};
        int[] expectedResult = new int[] {2, 4, 6, 7};
        assertArrayEquals(expectedResult, mergeSort.merge(leftArray, rightArray));
    }

    @Test
    void givenEvenElementUnsortedArray_whenMergeSort_thenReturnSortedArray() {
        int[] example = new int[] {8, 2, 5, 3, 4, 7, 6, 1};
        int[] expectedResult = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expectedResult, mergeSort.mergeSort(example));
    }

    @Test
    void givenOddElementUnsortedArray_whenMergeSort_thenReturnSortedArray() {
        int[] example = new int[] {8, 2, 5, 3, 4, 7, 6, 1, 9};
        int[] expectedResult = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expectedResult, mergeSort.mergeSort(example));
    }
}
