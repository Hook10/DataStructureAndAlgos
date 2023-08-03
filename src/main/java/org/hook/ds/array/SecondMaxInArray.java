package org.hook.ds.array;

public class SecondMaxInArray {
    public static void main(String[] args){
        SecondMaxInArray secondMax = new SecondMaxInArray();
        int secondMax1 = secondMax.findSecondMax(new int[]{5, 3, 4, 2, 1, 6});
        System.out.println(secondMax1);
    }

    private int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

}
