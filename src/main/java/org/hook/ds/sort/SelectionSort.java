package org.hook.ds.sort;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = {5, 3, 2, 4, 1};
    SelectionSort ss = new SelectionSort();
    ss.selectionSort(arr);
    ss.printArray(arr);
  }

  public void selectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int min = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
  }

  public void printArray(int[] arr) {
    Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    System.out.println();
  }
}
