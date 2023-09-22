package org.hook.patterns.abstractfactory.factory.practice;

import org.hook.patterns.abstractfactory.factory.practice.uifactory.WinUIFactory;

public class Main {
  public static void main(String[] args) {
    Application application = new Application(new WinUIFactory());
    application.paint();
  }
}
