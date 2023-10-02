package org.hook.ds.sort;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {5, 2, 1, 7, 3};
    BubbleSort bs = new BubbleSort();
    bs.bubbleSort(arr);
    bs.printArray(arr);
  }

  public void bubbleSort(int[] arr) {
    int n = arr.length;
    boolean isSwapped;
    for (int i = 0; i < n - 1; i++) {
      isSwapped = false;
      for (int j = 0; j < n - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          isSwapped = true;
        }
      }
      if (isSwapped == false) break;
    }
  }

  public void printArray(int[] arr) {
    Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    System.out.println();
  }
}
