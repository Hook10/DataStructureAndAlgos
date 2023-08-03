package org.hook.ds.array;

public class ResizeArray {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 9, 3, 10};
        ResizeArray resizeArray = new ResizeArray();
        System.out.println(arr.length);
        arr = resizeArray.resize(arr, arr.length*2);
        System.out.println(arr.length);
    }

    public int[] resize(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        return temp;
    }
}
