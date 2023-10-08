package org.hook.ds.dynamicprogramming;

public class FibonacciNumber {
  public static void main(String[] args) {
    FibonacciNumber number = new FibonacciNumber();
    int fib = number.finUsingArray(5);
    int fib1 = number.fib(new int[5 + 1], 5);
    System.out.println(fib);
    System.out.println(fib1);
  }

  public int fib(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    int left = fib(n - 1);
    int right = fib(n - 2);
    return left + right;
  }

  public int finUsingArray(int n) {
    int[] table = new int[n + 1];
    table[0] = 0;
    table[1] = 1;
    for (int i = 2; i <= n; i++) {
      table[i] = table[i - 1] + table[i - 2];
    }
    return table[n];
  }

  public int fib(int[] memo, int n) {
    if (memo[n] == 0) {
      if (n < 2) {
        memo[n] = n;
      } else {
        int left = fib(memo, n - 1);
        int right = fib(memo, n - 2);
        memo[n] = left + right;
      }
    }
    return memo[n];
  }
}
