import java.util.LinkedList;
import java.util.Queue;

public class SortLevel {
    public static void QuickSortTailOptimization(int[] array, int left, int right) {
        Queue<Bounds> bq = new LinkedList<>();
        bq.add(new Bounds(left, right));
        QuickSort(array, bq);
    }

    private static int QuickSort(int[] array, Queue<Bounds> bq) {
        if (bq.isEmpty()) {
            return -1;
        }
        Bounds b = bq.poll();
        int left = b.left();
        int right = b.right();
        if (left >= right) {
            return QuickSort(array, bq);
        }
        int N = ArrayChunk(array, left, right);
        bq.add(new Bounds(left, N - 1));
        bq.add(new Bounds(N + 1, right));
        return QuickSort(array, bq);
    }

    private static int ArrayChunk(int[] M, int left, int right) {
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

    private static void swap(int[] array, int fst, int snd) {
        array[fst] = -array[fst] - array[snd];
        array[snd] = -array[snd] - array[fst];
        array[fst] = -array[fst] - array[snd];
    }

    private static int getNewPivotIdx(int idx, int i1, int i2) {
        if (i1 == idx) {
            return i2;
        }
        if (i2 == idx) {
            return i1;
        }
        return idx;
    }
}

record Bounds(int left, int right) {}


