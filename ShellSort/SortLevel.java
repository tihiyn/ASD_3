import java.util.ArrayList;

public class SortLevel {
    public static ArrayList<Integer> KnuthSequence(int arraySize) {
        ArrayList<Integer> seq = new ArrayList<>();
        seq.add(1);
        for (int i = 4; i < arraySize; i = i * 3 + 1) {
            seq.addFirst(i);
        }
        return seq;
    }
}


