package org.hook.patterns.abstractfactory.factory.practice.uifactory;

import org.hook.patterns.abstractfactory.factory.practice.Button;
import org.hook.patterns.abstractfactory.factory.practice.CheckBox;
import org.hook.patterns.abstractfactory.factory.practice.UIFactory;
import org.hook.patterns.abstractfactory.factory.practice.mac.MacButton;
import org.hook.patterns.abstractfactory.factory.practice.mac.MacCheckBox;
import org.hook.patterns.abstractfactory.factory.practice.win.WinButton;
import org.hook.patterns.abstractfactory.factory.practice.win.WinCheckBox;

public class MacUIFactory implements UIFactory {

  @Override
  public Button createButton() {
    return new MacButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new MacCheckBox();
  }
}
