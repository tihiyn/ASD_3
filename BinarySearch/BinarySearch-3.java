import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    @Test
    void testBinarySearchLower() {
        int[] arr = new int[] {0, 3, 23, 33, 39, 46, 87, 99, 310};
        BinarySearch bs = new BinarySearch(arr);
        bs.Step(23);
        assertEquals(0, bs.Left);
        assertEquals(3, bs.Right);
        assertEquals(0, bs.GetResult());
    }

    @Test
    void testBinarySearchGreater() {
        int[] arr = new int[] {0, 3, 23, 33, 39, 46, 87, 99, 310};
        BinarySearch bs = new BinarySearch(arr);
        bs.Step(46);
        assertEquals(5, bs.Left);
        assertEquals(8, bs.Right);
        assertEquals(0, bs.GetResult());
    }

    @Test
    void testBinarySearchFirstFound() {
        int[] arr = new int[] {0, 3, 23, 33, 39, 46, 87, 99, 310};
        BinarySearch bs = new BinarySearch(arr);
        bs.Step(0);
        assertEquals(0, bs.GetResult());
        bs.Step(0);
        assertEquals(1, bs.GetResult());
        assertEquals(0, bs.Left);
        assertEquals(0, bs.Right);
    }

    @Test
    void testBinarySearchLastFound() {
        int[] arr = new int[] {0, 3, 23, 33, 39, 46, 87, 99, 310};
        BinarySearch bs = new BinarySearch(arr);
        bs.Step(310);
        assertEquals(0, bs.GetResult());
        bs.Step(310);
        assertEquals(0, bs.GetResult());
        bs.Step(310);
        assertEquals(1, bs.GetResult());
        assertEquals(8, bs.Left);
        assertEquals(8, bs.Right);
    }

    @Test
    void testBinarySearchNotFound() {
        int[] arr = new int[] {0, 3, 23, 33, 39, 46, 87, 99, 310};
        BinarySearch bs = new BinarySearch(arr);
        bs.Step(44);
        assertEquals(0, bs.GetResult());
        bs.Step(44);
        assertEquals(-1, bs.GetResult());
        assertEquals(5, bs.Left);
        assertEquals(5, bs.Right);
    }

    @Test
    void testBinarySearchStepDoNothingIfSearchEnd() {
        int[] arr = new int[] {0, 3, 23, 33, 39, 46, 87, 99, 310};
        BinarySearch bs = new BinarySearch(arr);
        bs.Step(44);
        bs.Step(44);
        assertEquals(-1, bs.GetResult());
        assertEquals(5, bs.Left);
        assertEquals(5, bs.Right);
        bs.Step(44);
        assertEquals(-1, bs.GetResult());
        assertEquals(5, bs.Left);
        assertEquals(5, bs.Right);
    }
}


