import java.util.ArrayList;

public class SortLevel {
    public static ArrayList<Integer> KnuthSequence(int arraySize) {
        ArrayList<Integer> seq = new ArrayList<>();
        if (arraySize == 0) {
            return seq;
        }
        seq.add(1);
        for (int i = 4; i < arraySize; i = i * 3 + 1) {
            seq.addFirst(i);
        }
        return seq;
    }
}


