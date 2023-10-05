package org.hook.ds.array;

import java.util.Arrays;

public class RearrangeSortedArrayInMaxMinForm {
  public static void main(String[] args) {
    int[] array = {2, 3, 5, 6, 8, 9};
    RearrangeSortedArrayInMaxMinForm arrayInMaxMinForm = new RearrangeSortedArrayInMaxMinForm();
    printArray(array);
    arrayInMaxMinForm.arrangeMaxMin(array);
    printArray(array);
  }

  private static void printArray(int[] array) {
    Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    System.out.println();
  }

  public void arrangeMaxMin(int[] arr) {
    int maxIdx = arr.length - 1;
    int minIdx = 0;
    int max = 10;
    for (int i = 0; i < arr.length; i++) {
      if (i % 2 == 0) {
        arr[i] = arr[i] + (arr[maxIdx] % 10) * max;
        maxIdx--;
      } else {
        arr[i] = arr[i] + (arr[minIdx] % 10) * max;
        minIdx++;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] / max;
    }
  }
}
