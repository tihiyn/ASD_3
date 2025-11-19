import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KnuthSequenceTest {
    @Test
    void testKnuthSequence() {
        assertEquals(new ArrayList<>(List.of(13, 4, 1)), SortLevel.KnuthSequence(15));
    }

    @Test
    void testKnuthSequenceForEmptyArray() {
        assertEquals(new ArrayList<>(List.of(1)), SortLevel.KnuthSequence(0));
    }

    @Test
    void testKnuthSequenceForSingleElementArray() {
        assertEquals(new ArrayList<>(List.of(1)), SortLevel.KnuthSequence(1));
    }

    @Test
    void testKnuthSequenceForBigArray() {
        assertEquals(
            new ArrayList<>(List.of(265720, 88573, 29524, 9841, 3280, 1093, 364, 121, 40, 13, 4, 1)),
            SortLevel.KnuthSequence(300_000)
        );
    }
}

