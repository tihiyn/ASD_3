import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ksortTest {
    @Test
    void testKsort() {
        String s = "b64";
        ksort sort = new ksort();
        assertTrue(sort.add(s));
        assertEquals(164, sort.index(s));
    }

    @Test
    void testKsortForTwo() {
        String s1 = "h99";
        String s2 = "h98";
        ksort sort = new ksort();
        assertTrue(sort.add(s1));
        assertTrue(sort.add(s2));
        assertEquals(799, sort.index(s1));
        assertEquals(798, sort.index(s2));
    }

    @Test
    void testAddForNotValidSize() {
        String s = "d66ro5ty";
        ksort sort = new ksort();
        assertFalse(sort.add(s));
    }

    @Test
    void testAddForNotValidLetter() {
        String s = "j99";
        ksort sort = new ksort();
        assertFalse(sort.add(s));
    }

    @Test
    void testAddForNotValidFirstNum() {
        String s = "e-9";
        ksort sort = new ksort();
        assertFalse(sort.add(s));
    }

    @Test
    void testAddForNotValidSecondNum() {
        String s = "e7+";
        ksort sort = new ksort();
        assertFalse(sort.add(s));
    }

    @Test
    void testIndexForNotValidSize() {
        String s = "a23r67342gf3--";
        ksort sort = new ksort();
        assertEquals(-1, sort.index(s));
    }

    @Test
    void testIndexForNotValidLetter() {
        String s = "z77";
        ksort sort = new ksort();
        assertEquals(-1, sort.index(s));
    }

    @Test
    void testIndexForNotValidFirstNum() {
        String s = "a~1";
        ksort sort = new ksort();
        assertEquals(-1, sort.index(s));
    }

    @Test
    void testIndexForNotValidSecondNum() {
        String s = "g4|";
        ksort sort = new ksort();
        assertEquals(-1, sort.index(s));
    }

    @Test
    void testKsortForAllAvailValues() {
        List<Character> letters = List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h');
        List<Character> numbers = List.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
        ksort sort = new ksort();
        for (Character l: letters) {
            for (Character n1: numbers) {
                for (Character n2: numbers) {
                    String s = new StringBuilder()
                        .append(l)
                        .append(n1)
                        .append(n2)
                        .toString();
                    sort.add(s);
                }
            }
        }
        Arrays.stream(sort.items).forEach(Assertions::assertNotNull);
    }
}


