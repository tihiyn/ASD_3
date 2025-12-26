import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GallopingSearchTest {
    @Test
    void testGallopingSearchFound() {
        int[] arr = {-15, -6, -1, 0, 1, 34, 150, 999};
        BinarySearch bs = new BinarySearch(arr);
        assertTrue(bs.GallopingSearch(arr, -1));
    }

    @Test
    void testGallopingSearchFoundFirst() {
        int[] arr = {-15, -6, -1, 0, 1, 34, 150, 999};
        BinarySearch bs = new BinarySearch(arr);
        assertTrue(bs.GallopingSearch(arr, -15));
    }

    @Test
    void testGallopingSearchFoundLast() {
        int[] arr = {-15, -6, -1, 0, 1, 34, 150, 999};
        BinarySearch bs = new BinarySearch(arr);
        assertTrue(bs.GallopingSearch(arr, 999));
    }

    @Test
    void testGallopingSearchNotFound() {
        int[] arr = {-15, -6, -1, 0, 1, 34, 150, 999};
        BinarySearch bs = new BinarySearch(arr);
        assertFalse(bs.GallopingSearch(arr, 130));
    }

    @Test
    void testGallopingSearchNotFoundLowerLeftBound() {
        int[] arr = {-15, -6, -1, 0, 1, 34, 150, 999};
        BinarySearch bs = new BinarySearch(arr);
        assertFalse(bs.GallopingSearch(arr, -30));
    }

    @Test
    void testGallopingSearchNotFoundGreaterRightBound() {
        int[] arr = {-15, -6, -1, 0, 1, 34, 150, 999};
        BinarySearch bs = new BinarySearch(arr);
        assertFalse(bs.GallopingSearch(arr, 1500));
    }
}


