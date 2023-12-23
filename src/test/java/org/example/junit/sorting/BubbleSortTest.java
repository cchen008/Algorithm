package org.example.junit.sorting;

import org.example.sorting.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    private final BubbleSort bubbleSort = new BubbleSort();

    @Test
    void givenUnsortedArray_whenBubbleSort_thenReturnSortedArray() {
        int[] example = new int[] {8, 2, 5, 3, 4, 7, 6, 1};
        int[] expectResult = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expectResult, bubbleSort.bubbleSort(example));
    }

    @Test
    void givenSingleElementArray_whenBubbleSort_thenReturnSortedArray() {
        int[] example = new int[] {5};
        int[] expectResult = new int[] {5};
        assertArrayEquals(expectResult, bubbleSort.bubbleSort(example));
    }
}
