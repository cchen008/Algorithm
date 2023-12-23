package org.example.junit.sorting;


import org.example.sorting.InsertionSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InsertionSortTest {
    private final InsertionSort insertionSort = new InsertionSort();

    @Test
    void givenEvenLengthUnsortedArray_whenInsertionSort_thenReturnSortedArray() {
        int[] example = new int[] {8, 2, 5, 3, 4, 7, 6, 1};
        int[] expectResult = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expectResult, insertionSort.insertionSort(example));
    }

    @Test
    void givenOddLengthUnsortedArray_whenInsertionSort_thenReturnSortedArray() {
        int[] example = new int[] {8, 2, 5, 3, 4, 7, 6, 1, 9};
        int[] expectResult = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expectResult, insertionSort.insertionSort(example));
    }

    @Test
    void givenOneElementArray_whenInsertionSort_thenReturnSortedArray() {
        int[] example = new int[] {7};
        int[] expectResult = new int[] {7};
        assertArrayEquals(expectResult, insertionSort.insertionSort(example));
    }
}
