package org.hook;

public class Main {
    public static void main(String[] args) {
        System.out.println(indexFor(10, 5));
    }

    static int indexFor(int h, int length) {
        int i = h & (length - 1);
        return i;
    }
}