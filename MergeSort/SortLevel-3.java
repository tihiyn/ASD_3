import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeSortTest {
    @Test
    void testMergeSort() {
        ArrayList<Integer> arr = new ArrayList<>(List.of(7, 5, 6, 4, 3, 1, 2));
        assertEquals(new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7)), SortLevel.MergeSort(arr));
    }

    @Test
    void testMergeSortWithNegativeElements() {
        ArrayList<Integer> arr = new ArrayList<>(List.of(5, -3, 0, 1, -6, -9, 24));
        assertEquals(new ArrayList<>(List.of(-9, -6, -3, 0, 1, 5, 24)), SortLevel.MergeSort(arr));
    }

    @Test
    void testMergeSortSortedArray() {
        ArrayList<Integer> arr = new ArrayList<>(List.of(-3, 0, 5, 6, 9));
        assertEquals(new ArrayList<>(List.of(-3, 0, 5, 6, 9)), SortLevel.MergeSort(arr));
    }

    @Test
    void testMergeSortOneElement() {
        ArrayList<Integer> arr = new ArrayList<>(List.of(7));
        assertEquals(new ArrayList<>(List.of(7)), SortLevel.MergeSort(arr));
    }

    @Test
    void testMergeSortTwoElements() {
        ArrayList<Integer> arr = new ArrayList<>(List.of(7, 3));
        assertEquals(new ArrayList<>(List.of(3, 7)), SortLevel.MergeSort(arr));
    }

    @Test
    void testMergeSortEmptyArray() {
        ArrayList<Integer> arr = new ArrayList<>();
        assertEquals(new ArrayList<>(), SortLevel.MergeSort(arr));
    }
}


