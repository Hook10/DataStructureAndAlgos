package org.hook.patterns.adapter;

public class Main {
  public static void main(String[] args) {
    SwiggyStore swiggyStore = new SwiggyStore();
    swiggyStore.addItems(new FoodItem());
    swiggyStore.addItems(new FoodItem());

    swiggyStore.addItems(new GroceryItemAdapter(new GroceryProduct()));
  }
}
