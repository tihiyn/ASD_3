public class SortLevel {
    public static void QuickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int N = ArrayChunk(array, left, right);
        QuickSort(array, left, N - 1);
        QuickSort(array, N + 1, right);
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


