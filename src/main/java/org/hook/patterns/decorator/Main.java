package org.hook.patterns.decorator;

public class Main {
  public static void main(String[] args) {
    TreeDecorator bubbles = new BubbleLights(new ChristmasTreeImpl());
    String decorate = bubbles.decorate();
    System.out.println(decorate);
  }
}
