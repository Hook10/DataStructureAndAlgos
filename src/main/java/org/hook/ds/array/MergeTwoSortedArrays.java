package org.hook.ds.array;

import java.util.Arrays;

public class MergeTwoSortedArrays {
  public static void main(String[] args) {
    int[] arr1 = {3, 7, 10, 15};
    int[] arr2 = {1, 2, 5, 8};
    MergeTwoSortedArrays merge = new MergeTwoSortedArrays();
    int[] merged = merge.merge(arr1, arr2, arr1.length, arr2.length);
    Arrays.stream(merged).forEach(a -> System.out.print(a + " "));
  }

  public int[] merge(int[] arr1, int[] arr2, int n, int m) {
    int[] result = new int[n + m];
    int i = 0; int j = 0; int k = 0;
    while (i < n && j < m) {
      if (arr1[i] < arr2[j]) {
        result[k] = arr1[i];
        i++;
      } else {
        result[k] = arr2[j];
        j++;
      }
      k++;
    }
    while (i < n) {
      result[k] = arr1[i];
      i++; k++;
    }
    while (j < m) {
      result[k] = arr2[j];
      j++; k++;
    }
    return result;
  }
}
