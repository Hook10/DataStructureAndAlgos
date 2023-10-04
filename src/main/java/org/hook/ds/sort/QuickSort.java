package org.hook.ds.sort;

import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {
    int[] array = {5, 3, 1, 9, 2, 0};
    QuickSort qs = new QuickSort();
    qs.printArray(array);
    qs.sort(array, 0, array.length - 1);
    qs.printArray(array);
  }

  public void sort(int[] arr, int low, int high) {
    if (low < high) {
      int p = partition(arr, low, high);
      sort(arr, low, p - 1);
      sort(arr, p + 1, high);
    }
  }

  public int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low;
    int j = low;
    while (i <= high) {
      if (arr[i] <= pivot) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j++;
      }
      i++;
    }
    return j - 1;
  }

  public void printArray(int[] arr) {
    Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    System.out.println();
  }
}
