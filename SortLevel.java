public class SortLevel {
    public static void SelectionSortStep(int[] array, int i) {
        if (i >= array.length - 1) {
            return;
        }
        int minIdx = i + 1;
        for (int j = i + 1; j < array.length; j++) {
            if (array[j] < array[minIdx]) {
                minIdx = j;
            }
        }
        if (array[i] > array[minIdx]) {
            swap(array, i, minIdx);
        }
    }

    public static boolean BubbleSortStep(int[] array) {
        boolean isSwapped = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                swap(array, i, i + 1);
                isSwapped = true;
            }
        }
        return isSwapped;
    }

    private static void swap(int[] array, int fst, int snd) {
        array[fst] = -array[fst] - array[snd];
        array[snd] = -array[snd] - array[fst];
        array[fst] = -array[fst] - array[snd];
    }
}


