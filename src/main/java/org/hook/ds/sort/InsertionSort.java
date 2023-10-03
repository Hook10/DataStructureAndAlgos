package org.hook.ds.sort;

import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = {5, 1, 2, 9, 10};
    InsertionSort is = new InsertionSort();
    is.insertionSort(arr);
    is.printArray(arr);
  }

  public void insertionSort(int[] arr) {
    int n = arr.length;

    for (int i = 1; i < n; i++) {
      int temp = arr[i];
      int j = i - 1;

      while (j >= 0 && arr[j] > temp) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = temp;
    }
  }

  public void printArray(int[] arr) {
    Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    System.out.println();
  }
}
