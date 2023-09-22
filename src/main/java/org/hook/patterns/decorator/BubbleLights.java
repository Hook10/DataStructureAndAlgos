package org.hook.patterns.decorator;

public class BubbleLights extends TreeDecorator{
  public BubbleLights(ChristmasTree tree) {
    super(tree);
  }

  @Override
  public String decorate() {
    return super.decorate() + decoreWithBubbles();
  }

  public String decoreWithBubbles() {
    return " bubbles";
  }
}
