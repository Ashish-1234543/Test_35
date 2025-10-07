import java.util.*;

public class The_Spiral_Library {
    static void spiral(int[][] arr, int top, int bottom, int left, int right, List<Integer> res) {
        if (top > bottom || left > right) return;
        for (int i = left; i <= right; i++) res.add(arr[top][i]);
        for (int i = top + 1; i <= bottom; i++) res.add(arr[i][right]);
        if (top < bottom)
            for (int i = right - 1; i >= left; i--) res.add(arr[bottom][i]);
        if (left < right)
            for (int i = bottom - 1; i > top; i--) res.add(arr[i][left]);
        spiral(arr, top + 1, bottom - 1, left + 1, right - 1, res);
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        List<Integer> res = new ArrayList<>();
        spiral(arr, 0, arr.length - 1, 0, arr[0].length - 1, res);
        System.out.println(res);
    }
}
