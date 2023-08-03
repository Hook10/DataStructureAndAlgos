package org.hook.ds.array;

import java.util.Arrays;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 0, 2, 4, 0, 7};
        MoveAllZeroToEnd moveAllZeroToEnd = new MoveAllZeroToEnd();
        int[] ints = moveAllZeroToEnd.moveZeroToEnd(arr, arr.length);
        System.out.println(Arrays.toString(ints));
    }
    private int[] moveZeroToEnd(int[] arr, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0 && arr[j]==0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        return arr;
    }
}
