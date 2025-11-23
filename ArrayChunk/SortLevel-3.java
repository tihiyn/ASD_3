import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayChunkTest {
    @Test
    void testArrayChunk() {
        int[] input = new int[] {7, 5, 6, 4, 3, 1, 2};
        int supportIdx = SortLevel.ArrayChunk(input);
        assertEquals(3, supportIdx);
        assertArrayEquals(new int[] {2, 1, 3, 4, 6, 5, 7}, input);
    }

    @Test
    void testArrayChunkWithChangingOfPivot() {
        int[] input = new int[] {5, -3, 0, 1, -6, -9, 24};
        int supportIdx = SortLevel.ArrayChunk(input);
        assertEquals(1, supportIdx);
        assertArrayEquals(new int[] {-9, -6, 0, -3, 1, 5, 24}, input);
    }

    @Test
    void testArrayChunkForOneElement() {
        int[] input = new int[] {7};
        int supportIdx = SortLevel.ArrayChunk(input);
        assertEquals(0, supportIdx);
        assertArrayEquals(new int[] {7}, input);
    }

    @Test
    void testArrayChunkForTwoNotOrderedElements() {
        int[] input = new int[] {7, 3};
        int supportIdx = SortLevel.ArrayChunk(input);
        assertEquals(1, supportIdx);
        assertArrayEquals(new int[] {3, 7}, input);
    }

    @Test
    void testArrayChunkForEmpty() {
        int[] input = new int[] {};
        int supportIdx = SortLevel.ArrayChunk(input);
        assertEquals(-1, supportIdx);
        assertArrayEquals(new int[] {}, input);
    }
}


