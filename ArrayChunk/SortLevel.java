public class SortLevel {
    public static int ArrayChunk(int[] M) {
        if (M.length == 0) {
            return -1;
        }
        return ArrayChunkRec(M, M.length / 2, M[M.length / 2], 0, M.length - 1);
    }

    private static int ArrayChunkRec(int[] M, int pIdx, int pivot, int i1, int i2) {
        for (; M[i1] < pivot; i1++) {}
        for (; M[i2] > pivot; i2--) {}
        if (i1 == i2 - 1 && M[i1] > M[i2]) {
            swap(M, i1, i2);
            return ArrayChunkRec(M, M.length / 2, M[M.length / 2], 0, M.length - 1);
        }
        if (i1 == i2) {
            return pIdx;
        }
        swap(M, i1, i2);
        return ArrayChunkRec(M, getNewPivotIdx(pIdx, i1, i2), pivot, i1, i2);
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


