package org.hook.patterns.abstractfactory.factory.practice.win;

import org.hook.patterns.abstractfactory.factory.practice.Button;

public class WinButton implements Button {
  @Override
  public void click() {
    System.out.println("win botton");
  }
}
