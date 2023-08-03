package org.hook.ds.array;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,8,9,10};
        FindMissingNumberInArray f = new FindMissingNumberInArray();
        int missingNumber = f.findMissingNumber(arr);
        System.out.println(missingNumber);
    }

    private int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum -= num;
        }
        return sum;
    }
}
