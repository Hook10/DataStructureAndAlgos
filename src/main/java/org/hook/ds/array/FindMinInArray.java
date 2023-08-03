package org.hook.ds.array;

public class FindMinInArray {
    public static void main(String[] args) {
        FindMinInArray findMinInArray = new FindMinInArray();
        int minimum = findMinInArray.findMinimum(new int[]{5, 3, 10, 35, 1, 4});
        System.out.println(minimum);

    }
    private int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}
