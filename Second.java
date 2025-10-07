import java.util.*;

public class The_Lost_Soldier {
    static int findMissing(int[] arr, int start, int end) {
        if (start > end) return start;
        int mid = (start + end) / 2;
        if (arr[mid] == mid) return findMissing(arr, mid + 1, end);
        else return findMissing(arr, start, mid - 1);
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 5};
        System.out.println(findMissing(arr, 0, arr.length - 1));
    }
}
