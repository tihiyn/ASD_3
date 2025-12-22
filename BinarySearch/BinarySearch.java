public class BinarySearch {
    private final int[] arr;
    public int Left;
    public int Right;
    private int res;

    public BinarySearch(int[] arr) {
        this.arr = arr;
        Left = 0;
        Right = arr.length - 1;
        res = 0;
    }

    public void Step(int N) {
        if (Math.abs(res) == 1) {
            return;
        }
        final int cntr = (Right + Left) / 2;
        if (arr[cntr] == N) {
            res = 1;
            return;
        }
        correctBounds(N, cntr);
        if (Left >= Right) {
            res = checkFound(N, Left);
        }
    }

    private int checkFound(int N, int pos) {
        if (arr[pos] == N) {
            return 1;
        }
        return -1;
    }

    private void correctBounds(int N, int cntr) {
        if (N < arr[cntr]) {
            Right = cntr - 1;
            return;
        }
        Left = cntr + 1;
    }

    public int GetResult() {
        return res;
    }
}


