package org.hook.patterns.abstractfactory.factory.practice.mac;

import org.hook.patterns.abstractfactory.factory.practice.Button;

public class MacButton implements Button {
  @Override
  public void click() {
    System.out.println("Mack button");
  }
}
