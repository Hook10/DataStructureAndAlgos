package org.hook.ds.array;

public class ArrayUtils {
  public static void main(String[] args) {

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


}
