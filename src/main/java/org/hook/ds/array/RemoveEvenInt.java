package org.hook.ds.array;

import java.util.Arrays;

public class RemoveEvenInt {
    public static void main(String[] args) {
      RemoveEvenInt removeEvenInt = new RemoveEvenInt();
        int[] ints = removeEvenInt.removeEven(new int[]{3, 2, 4, 7, 10, 6, 5});
        System.out.println(Arrays.toString(ints));
    }

    private int[] removeEven(int[] arr) {
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd++;
            }
        }
        int[] result = new int[odd];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }
}
