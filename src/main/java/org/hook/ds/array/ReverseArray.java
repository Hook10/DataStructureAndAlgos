package org.hook.ds.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] nums = {5, 4, 3, 2, 1};
        int[] ints = reverseArray.reverseArray(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(ints));
    }

    private int[] reverseArray(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
}
