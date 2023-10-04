package org.hook.ds.array;

import java.util.Arrays;

public class SquaresOfASortedArray {
  public static void main(String[] args) {
    int[] array = {-4, -1, 0, 3, 10};
    int[] squares = sortedSquares(array);
    Arrays.stream(squares).forEach(e -> System.out.print(e + " "));
  }

  public static int[] sortedSquares(int[] arr) {
    int n = arr.length;
    int i = 0;
    int j = n - 1;
    int[] result = new int[n];

    for (int k = n - 1; k >= 0; k--) {
      if (Math.abs(arr[i]) > Math.abs(arr[j])) {
        result[k] = arr[i] * arr[i];
        i++;
      } else {
        result[k] = arr[j] * arr[j];
        j--;
      }
    }
    return result;
  }
}
