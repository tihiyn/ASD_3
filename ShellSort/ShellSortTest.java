import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ShellSortTest {
    @Test
    void testSort() {
        int[] input = new int[] {4, 8, 2, 5, -4, 6, -3, 21};
        ShellSort.sort(input);
        assertArrayEquals(new int[] {-4, -3, 2, 4, 5, 6, 8, 21}, input);
    }

    @Test
    void testSortReversedArray() {
        int[] input = new int[] {19, 15, 15, 12, 6, 0, -3, -3};
        ShellSort.sort(input);
        assertArrayEquals(new int[] {-3, -3, 0, 6, 12, 15, 15, 19}, input);
    }

    @Test
    void testSortOrderedArray() {
        int[] input = new int[] {-3, 0, 0, 2, 15};
        ShellSort.sort(input);
        assertArrayEquals(new int[] {-3, 0, 0, 2, 15}, input);
    }

    @Test
    void testSortEmptyArray() {
        int[] input = new int[] {};
        ShellSort.sort(input);
        assertArrayEquals(new int[] {}, input);
    }


}
