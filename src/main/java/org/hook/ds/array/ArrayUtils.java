package org.hook.ds.array;

import java.util.Arrays;

public class ArrayUtils {
  public static void main(String[] args) {
    Arrays.stream(findProduct(new int[]{1, 2, 3, 4})).forEach(e -> System.out.print(e + "  "));
    System.out.println("\nMaxSubArraySum is: " + maxSubArraySum(new int[]{2, 7, 3, 5, 8, 1}, 3));
  }

  public static int removeDuplicates(int[] nums) {
    int i = 1;
    for (int j = 1; j < nums.length; j++) {
      if (nums[j - 1] != nums[j]) {
        nums[i] = nums[j];
        i++;
      }
    }
    return i;
  }

  public static int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != val) {
        nums[i] = nums[j];
        i++;
      }
    }
    return i;
  }

  public static void threeSum(int[] arr, int target) {
    Arrays.sort(arr);
    for (int i = 0; i < arr.length - 2; i++) {
      int j = i + 1;
      int k = arr.length - 1;
      while (j < k) {
        int sum = arr[i] + arr[j] + arr[k];
        if (sum == target) {
          System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
          j++;
          k--;
        } else if (sum < target) {
          j++;
        } else {
          k--;
        }
      }
    }
  }

  public static int[] findProduct(int[] arr) {
    int temp = 1;
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      result[i] = temp;
      temp = temp * arr[i];
    }
    temp = 1;
    for (int i = arr.length - 1; i >= 0; i--) {
      result[i] = result[i] * temp;
      temp = temp * arr[i];
    }
    return result;
  }

  public static int maxSubArraySum(int[] arr, int k) {
    int maxSum = 0;
    int windowSum = 0;
    int start = 0;
    for (int end = 0; end < arr.length; end++) {
      windowSum = windowSum + arr[end];
      if (end >= k - 1) {
        maxSum = Math.max(maxSum, windowSum);
        start++;
      }
    }
    return maxSum;
  }


}
