package org.hook.patterns.abstractfactory.factory.practice.uifactory;

import org.hook.patterns.abstractfactory.factory.practice.Button;
import org.hook.patterns.abstractfactory.factory.practice.CheckBox;
import org.hook.patterns.abstractfactory.factory.practice.UIFactory;
import org.hook.patterns.abstractfactory.factory.practice.win.WinButton;
import org.hook.patterns.abstractfactory.factory.practice.win.WinCheckBox;

public class WinUIFactory implements UIFactory {

  @Override
  public Button createButton() {
    return new WinButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new WinCheckBox();
  }
}
