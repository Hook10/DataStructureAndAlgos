package org.hook.patterns.builder.practice;

public class Burger {
  private String size;
  private boolean egg;
  private boolean extraCheese;


  private Burger(BurgerBuilder burgerBuilder) {
    this.size = burgerBuilder.size;
    this.egg = burgerBuilder.egg;
    this.extraCheese = burgerBuilder.extraCheese;
  }

  public static class BurgerBuilder {
    private String size;
    private boolean egg;
    private boolean extraCheese;

    public static BurgerBuilder builder() {
      return new BurgerBuilder();
    }

    public BurgerBuilder size(String size) {
      this.size = size;
      return this;
    }

    public BurgerBuilder egg(Boolean egg) {
      this.egg = egg;
      return this;
    }

    public BurgerBuilder extraCheese(Boolean egg) {
      this.extraCheese = extraCheese;
      return this;
    }

    public Burger build() {
      return new Burger(this);
    }

  }

}
