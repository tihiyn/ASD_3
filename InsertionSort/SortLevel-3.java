import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortStepTest {
    @Test
    void testInsertionSortBeginningWithStart() {
        int[] input = new int[] {7, 6, 5, 4, 3, 2, 1};
        SortLevel.InsertionSortStep(input, 3, 0);
        assertArrayEquals(new int[] {1, 6, 5, 4, 3, 2, 7}, input);
    }

    @Test
    void testInsertionSortBeginningWithNotStart() {
        int[] input = new int[] {9, 4, 9, 5, 7, 2, 3, 2};
        SortLevel.InsertionSortStep(input, 2, 1);
        assertArrayEquals(new int[] {9, 2, 9, 2, 7, 4, 3, 5}, input);
    }

    @Test
    void testInsertionSortBeginningWithLengthMinusStep() {
        int[] input = new int[] {9, 6, 2, 5, 1, 6, 7, 0, 2};
        SortLevel.InsertionSortStep(input, 4, 5);
        assertArrayEquals(new int[] {9, 6, 2, 5, 1, 6, 7, 0, 2}, input);
    }

    @Test
    void testInsertionSortForEmptyArray() {
        int[] input = new int[] {};
        SortLevel.InsertionSortStep(input, 10, 0);
        assertArrayEquals(new int[] {}, input);
    }

    @Test
    void testInsertionSortWithDefaultStep() {
        int[] input = new int[] {-5, 9, 5, 39, 2, 6, 4, 8, 23};
        SortLevel.InsertionSortStep(input, 1, 3);
        assertArrayEquals(new int[] {-5, 9, 5, 2, 4, 6, 8, 23, 39}, input);
    }

    @Test
    void testInsertionSortForSortedArray() {
        int[] input = new int[] {-6, -3, -2, 0, 9, 11};
        SortLevel.InsertionSortStep(input, 2, 1);
        assertArrayEquals(new int[] {-6, -3, -2, 0, 9, 11}, input);
    }
}


