import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthOrderStatisticsStepTest {
    @Test
    void testPivotIdxGreaterThenK() {
        int[] input = new int[] {7, 5, 6, 4, 3, 1, 2};
        ArrayList<Integer> newBounds = SortLevel.KthOrderStatisticsStep(input, 0, input.length - 1, 2);
        assertArrayEquals(new int[] {2, 1, 3, 4, 6, 5, 7}, input);
        assertEquals(2, newBounds.size());
        assertEquals(0, newBounds.getFirst());
        assertEquals(2, newBounds.getLast());
    }

    @Test
    void testPivotIdxLowerThenK() {
        int[] input = new int[] {5, -3, 0, 1, -6, -9, 24};
        ArrayList<Integer> newBounds = SortLevel.KthOrderStatisticsStep(input, 0, input.length - 1, 4);
        assertArrayEquals(new int[] {-9, -6, 0, -3, 1, 5, 24}, input);
        assertEquals(2, newBounds.size());
        assertEquals(2, newBounds.getFirst());
        assertEquals(6, newBounds.getLast());
    }

    @Test
    void testPivotIdxEqualsK() {
        int[] input = new int[] {2, 7, -1, 3, 0};
        ArrayList<Integer> newBounds = SortLevel.KthOrderStatisticsStep(input, 0, input.length - 1, 0);
        assertArrayEquals(new int[] {-1, 7, 2, 3, 0}, input);
        assertEquals(2, newBounds.size());
        assertEquals(0, newBounds.getFirst());
        assertEquals(0, newBounds.getLast());
    }

    @Test
    void testSingleElementArray() {
        int[] input = new int[] {5};
        ArrayList<Integer> newBounds = SortLevel.KthOrderStatisticsStep(input, 0, input.length - 1, 0);
        assertArrayEquals(new int[] {5}, input);
        assertEquals(2, newBounds.size());
        assertEquals(0, newBounds.getFirst());
        assertEquals(0, newBounds.getLast());
    }
}


