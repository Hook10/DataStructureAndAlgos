package org.hook.ds.array;

import java.util.Arrays;

public class SortArray012 {
  public static void main(String[] args) {
    int[] array = {2, 2, 2, 0, 1, 0, 0, 1, 1};
    SortArray012 sort = new SortArray012();
    printArray(array);
    sort.threeNumberSort(array);
    printArray(array);
  }

  private static void printArray(int[] array) {
    Arrays.stream(array).forEach(a -> System.out.print(a + " "));
    System.out.println();
  }

  public void threeNumberSort(int[] arr) {
    int i = 0;
    int j = 0;
    int k = arr.length - 1;
    while (i <= k) {
      if (arr[i] == 0) {
        swap(arr, i, j);
        i++;
        j++;
      } else if (arr[i] == 1) {
        i++;
      } else if (arr[i] == 2) {
        swap(arr, i, k);
        k--;
      }
    }
  }

  public void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }


}
