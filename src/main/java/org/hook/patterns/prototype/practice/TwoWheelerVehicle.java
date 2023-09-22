package org.hook.patterns.prototype.practice;

public class TwoWheelerVehicle extends Vehicle{

  private boolean isElectric;

  public TwoWheelerVehicle(String engine, String model, long price, boolean isElectric) {
    super(engine, model, price);
    this.isElectric = isElectric;
  }
}
