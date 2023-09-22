package org.hook.patterns.abstractfactory.factory.practice.win;

import org.hook.patterns.abstractfactory.factory.practice.CheckBox;

public class WinCheckBox implements CheckBox {
  @Override
  public void checkBox() {
    System.out.println("Win checkbox");
  }
}
