public class BinarySearch {
    private int[] arr;
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
        if (Right - Left < 2) {
            res = checkFound(N, Left, Right);
        }
    }

    public boolean GallopingSearch(int[] arr, int N) {
        if (arr.length == 0 || N < arr[0] || N > arr[arr.length - 1]) {
            return false;
        }
        int i = 1;
        for (; Math.pow(2, i) - 2 < arr.length - 1; i++) {
            int cur = (int) (Math.pow(2, i) - 2) % arr.length;
            if (arr[cur] == N) {
                return true;
            }
            if (arr[cur] < N) {
                continue;
            }
            break;
        }
        this.arr = arr;
        this.Left = (int) (Math.pow(2, i - 1) - 1);
        this.Right = (int) (Math.pow(2, i) - 2) % arr.length;
        this.res = 0;
        for (; GetResult() == 0;) {
            Step(N);
        }
        return GetResult() == 1;
    }

    private int checkFound(int N, int Left, int Right) {
        if (arr[Left] == N || arr[Right] == N) {
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


