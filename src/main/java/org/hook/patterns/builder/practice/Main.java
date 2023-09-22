package org.hook.patterns.builder.practice;

public class Main {
  public static void main(String[] args) {
    Burger big = Burger.BurgerBuilder.builder()
        .size("big")
        .egg(true)
        .extraCheese(true)
        .build();
  }
}
