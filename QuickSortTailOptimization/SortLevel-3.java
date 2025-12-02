import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTailOptimizationTest {
    void testArrayChunk() {
        int[] input = new int[] {7, 5, 6, 4, 3, 1, 2};
        SortLevel.QuickSortTailOptimization(input, 0, input.length - 1);
        assertArrayEquals(new int[] {1, 2, 3, 4, 5, 6, 7}, input);
    }

    @Test
    void testArrayChunkWithChangingOfPivot() {
        int[] input = new int[] {5, -3, 0, 1, -6, -9, 24};
        SortLevel.QuickSortTailOptimization(input, 0, input.length - 1);
        assertArrayEquals(new int[] {-9, -6, -3, 0, 1, 5, 24}, input);
    }

    @Test
    void testArrayChunkForOneElement() {
        int[] input = new int[] {7};
        SortLevel.QuickSortTailOptimization(input, 0, 0);
        assertArrayEquals(new int[] {7}, input);
    }

    @Test
    void testArrayChunkForTwoNotOrderedElements() {
        int[] input = new int[] {7, 3};
        SortLevel.QuickSortTailOptimization(input, 0, input.length - 1);
        assertArrayEquals(new int[] {3, 7}, input);
    }

    @Test
    void testArrayChunkForEmpty() {
        int[] input = new int[] {};
        SortLevel.QuickSortTailOptimization(input, 0, 0);
        assertArrayEquals(new int[] {}, input);
    }


}
