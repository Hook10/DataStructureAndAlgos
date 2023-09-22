package org.hook.patterns.prototype.practice;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {

  private static Map<String, Vehicle> mapVehicles = new HashMap<>();

  static {
    mapVehicles.put("TWO", new TwoWheelerVehicle("120", "ModelTwo", 123L, true));
    mapVehicles.put("FOUR", new FourWheelerVehicle("120", "fourModel", 4445L, true, false));
  }

  public Vehicle getVehicle(String vehicle) throws CloneNotSupportedException {
    return mapVehicles.get(vehicle).clone();
  }

}
