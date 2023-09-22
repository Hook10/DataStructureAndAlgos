package org.hook.patterns.abstractfactory.factory.practice.mac;

import org.hook.patterns.abstractfactory.factory.practice.CheckBox;

public class MacCheckBox implements CheckBox {
  @Override
  public void checkBox() {
    System.out.println("Mac checkbox");
  }
}
