public class ShellSort {
    public static void sort(int[] array) {
        SortLevel.KnuthSequence(array.length).forEach(step -> {
            for (int i = 0; i < step; i++) {
                InsertionSortStep(array, step, i);
            }
        });
    }

    private static void InsertionSortStep(int[] array, int step, int i) {
        for (int j = i; j < array.length; j += step) {
            for (int k = i; k < j; k += step) {
                if (array[j] < array[k]) {
                    swap(array, j, k);
                }
            }
        }
    }

    private static void swap(int[] array, int fst, int snd) {
        array[fst] = -array[fst] - array[snd];
        array[snd] = -array[snd] - array[fst];
        array[fst] = -array[fst] - array[snd];
    }


}
