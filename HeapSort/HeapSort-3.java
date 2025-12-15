import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeapSortTest {
    @Test
    void testHeapSort() {
        int[] input = new int[] {39, 23, 33, 87, 310, 4, 46, 0, 99};
        int[] exp = new int[] {310, 99, 87, 46, 39, 33, 23, 4, 0};
        HeapSort s = new HeapSort(input);
        Arrays.stream(exp).forEach(x -> assertEquals(x, s.GetNextMax()));
    }

    @Test
    void testHeapSortWithEqualsElements() {
        int[] input = new int[] {3, 8, 4, 5, 10, 3};
        int[] exp = new int[] {10, 8, 5, 4, 3, 3};
        HeapSort s = new HeapSort(input);
        Arrays.stream(exp).forEach(x -> assertEquals(x, s.GetNextMax()));
    }

    @Test
    void testHeapSortEmptyArray() {
        int[] input = new int[] {};
        HeapSort s = new HeapSort(input);
        assertEquals(-1, s.GetNextMax());
    }

    @Test
    void testHeapSortForOneElement() {
        int[] input = new int[] {0};
        int[] exp = new int[] {0};
        HeapSort s = new HeapSort(input);
        Arrays.stream(exp).forEach(x -> assertEquals(x, s.GetNextMax()));
    }

    @Test
    void testHeapSortForAllEqualsElements() {
        int[] input = new int[] {44, 44, 44, 44};
        int[] exp = new int[] {44, 44, 44, 44};
        HeapSort s = new HeapSort(input);
        Arrays.stream(exp).forEach(x -> assertEquals(x, s.GetNextMax()));
    }

    @Test
    void testHeapSortForAlreadySortedArray() {
        int[] input = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] exp = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        HeapSort s = new HeapSort(input);
        Arrays.stream(exp).forEach(x -> assertEquals(x, s.GetNextMax()));
    }
}


