import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionAndBubbleSortTest {
    @Test
    void testSelectionSortForFirstElement() {
        int[] input = new int[] {3, 9, 2, 6, 4};
        int index = 0;
        SortLevel.SelectionSortStep(input, index);
        assertArrayEquals(new int[] {2, 9, 3, 6, 4}, input);
    }

    @Test
    void testSelectionSortWithSwap() {
        int[] input = new int[] {-77, -5, 24, 0};
        int index = 2;
        SortLevel.SelectionSortStep(input, index);
        assertArrayEquals(new int[] {-77, -5, 0, 24}, input);
    }

    @Test
    void testSelectionSortWithoutSwap() {
        int[] input = new int[] {-12, 3, 18, 7, 110, 16};
        int index = 1;
        SortLevel.SelectionSortStep(input, index);
        assertArrayEquals(new int[] {-12, 3, 18, 7, 110, 16}, input);
    }

    @Test
    void testSelectionSortForLastElement() {
        int[] input = new int[] {-3, -2, 2, 3};
        int index = 3;
        SortLevel.SelectionSortStep(input, index);
        assertArrayEquals(new int[] {-3, -2, 2, 3}, input);
    }

    @Test
    void testSelectionSortForEmptyArray() {
        int[] input = new int[] {};
        int index = 0;
        SortLevel.SelectionSortStep(input, index);
        assertArrayEquals(new int[] {}, input);
    }

    @Test
    void testBubbleSortForNotSortedArray() {
        int[] input = new int[] {4, 9, 2, -1, 0};
        assertFalse(SortLevel.BubbleSortStep(input));
        assertArrayEquals(new int[] {4, 2, -1, 0, 9}, input);
    }

    @Test
    void testBubbleSortForSortedArray() {
        int[] input = new int[] {3, 7, 10, 11, 11, 56};
        assertTrue(SortLevel.BubbleSortStep(input));
        assertArrayEquals(new int[] {3, 7, 10, 11, 11, 56}, input);
    }

    @Test
    void testBubbleSortForEmptyArray() {
        int[] input = new int[] {};
        assertTrue(SortLevel.BubbleSortStep(input));
        assertArrayEquals(new int[] {}, input);
    }
}

