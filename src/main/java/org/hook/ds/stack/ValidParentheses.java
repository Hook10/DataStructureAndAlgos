package org.hook.ds.stack;

import java.util.Stack;

public class ValidParentheses {
  public static void main(String[] args) {
    System.out.println(isValidParentheses("{}{}}"));
    System.out.println(isValidParentheses("(({{}}))"));
  }

  private static boolean isValidParentheses(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else {
        if (stack.isEmpty()) {
          return false;
        } else {
          char top = stack.peek();
          if (c == ')' && top == '(' ||
              c == '}' && top == '{' ||
              c == ']' && top == '[') {
            stack.pop();
          } else {
            return false;
          }
        }
      }
    }
    return stack.isEmpty();
  }

}
