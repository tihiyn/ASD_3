import java.util.ArrayList;

public class SortLevel {
    public static ArrayList<Integer> KthOrderStatisticsStep(int[] Array, int L, int R, int k) {
        ArrayList<Integer> newBounds = new ArrayList<>(2);
        if (L > R) {
            return newBounds;
        }
        final int N = ArrayChunk(Array, L, R);
        if (N == k) {
            newBounds.add(N);
            newBounds.add(N);
            return newBounds;
        }
        if (N < k) {
            newBounds.add(N + 1);
            newBounds.add(R);
            return newBounds;
        }
        newBounds.add(L);
        newBounds.add(N - 1);
        return newBounds;
    }

    private static int ArrayChunk(int[] M, final int left, final int right) {
        int pivotIdx = left + (right - left + 1) / 2;
        int N = M[pivotIdx];
        int i1 = left;
        int i2 = right;
        while (true) {
            for (; M[i1] < N; i1++) {}
            for (; M[i2] > N; i2--) {}
            if (i1 == i2 - 1 && M[i1] > M[i2]) {
                swap(M, i1, i2);
                pivotIdx = left + (right - left + 1) / 2;
                N = M[pivotIdx];
                i1 = left;
                i2 = right;
                continue;
            }
            if (i1 == i2) {
                return pivotIdx;
            }
            swap(M, i1, i2);
            pivotIdx = getNewPivotIdx(pivotIdx, i1, i2);
            N = M[pivotIdx];
        }
    }

    private static void swap(int[] array, final int fst, final int snd) {
        array[fst] = -array[fst] - array[snd];
        array[snd] = -array[snd] - array[fst];
        array[fst] = -array[fst] - array[snd];
    }

    private static int getNewPivotIdx(final int idx, final int i1, final int i2) {
        if (i1 == idx) {
            return i2;
        }
        if (i2 == idx) {
            return i1;
        }
        return idx;
    }
}


