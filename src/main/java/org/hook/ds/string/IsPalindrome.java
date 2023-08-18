package org.hook.ds.string;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome("madamm"));
    }

    private boolean isPalindrome(String string) {
        if (string.isBlank()) return false;
        char[] array = string.toCharArray();
        int start = 0;
        int end = string.length() - 1;
        while(start < end) {
            if (array[start] != array[end]){
                return false;
            }
                start++;
                end--;
        }
        return true;
    }
}
