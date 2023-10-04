package org.hook.ds.sort;

import java.util.Arrays;

public class MergeSort {
  public static void main(String[] args) {
    int[] arr = {9, 5, 2, 4, 3};
    MergeSort ms = new MergeSort();
    ms.printArray(arr);
    ms.sort(arr, new int[arr.length], 0, arr.length - 1);
    ms.printArray(arr);
  }

  public void sort(int[] arr, int[] temp, int low, int high) {
    if (low < high) {
      int mid = low + (high - low) / 2;
      sort(arr, temp, low, mid);
      sort(arr, temp, mid + 1, high);
      merge(arr, temp, low, mid, high);
    }
  }

  public void merge(int[] arr, int[] temp, int low, int mid, int high) {
    for (int i = low; i <= high; i++) {
      temp[i] = arr[i];
    }
    int i = low;
    int j = mid + 1;
    int k = low;
    while (i <= mid && j <= high) {
      if (temp[i] <= temp[j]) {
        arr[k] = temp[i];
        i++;
      } else {
        arr[k] = temp[j];
        j++;
      }
      k++;
    }
    while (i <= mid) {
      arr[k] = temp[i];
      i++;
      k++;
    }
  }

  public void printArray(int[] arr) {
    Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    System.out.println();
  }

}
