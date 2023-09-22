package org.hook.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

  private static final Map<ShapeType, Shape> shapes = new HashMap<>();

  public static Shape getShape(ShapeType type) {
    Shape shapeImpl = shapes.get(type);

    if (shapeImpl == null) {
      if (type.equals(ShapeType.LINE)) {
        shapeImpl = new Line();
      }

      shapes.put(type, shapeImpl);
    }
    return shapeImpl;
  }

  public static enum ShapeType {
    OVAL_FILL, OVAL_NO_FILL, LINE
  }
}
