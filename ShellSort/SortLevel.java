import java.util.ArrayList;

public class SortLevel {
    public static ArrayList<Integer> KnuthSequence(int arraySize) {
        ArrayList<Integer> seq = new ArrayList<>();
        for (int i = 1; i < arraySize; i = i * 3 + 1) {
            seq.addFirst(i);
        }
        return seq;
    }
}


