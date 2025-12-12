import java.util.ArrayList;

public class SortLevel {
    public static ArrayList<Integer> MergeSort(ArrayList<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }
        int cntr = arr.size() / 2;
        ArrayList<Integer> left = MergeSort(new ArrayList<>(arr.subList(0, cntr)));
        ArrayList<Integer> right = MergeSort(new ArrayList<>(arr.subList(cntr, arr.size())));
        ArrayList<Integer> res = new ArrayList<>(arr.size());
        int lPtr = 0;
        int rPtr = 0;
        for (; lPtr != left.size() && rPtr != right.size(); ) {
            if (left.get(lPtr) <= right.get(rPtr)) {
                res.add(left.get(lPtr));
                lPtr++;
                continue;
            }
            res.add(right.get(rPtr));
            rPtr++;
        }
        for (; lPtr < left.size(); lPtr++) {
            res.add(left.get(lPtr));
        }
        for (; rPtr < right.size(); rPtr++) {
            res.add(right.get(rPtr));
        }
        return res;
    }
}


