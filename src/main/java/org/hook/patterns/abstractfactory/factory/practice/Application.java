package org.hook.patterns.abstractfactory.factory.practice;

public class Application {
  private Button button;
  private CheckBox checkBox;

  public Application(UIFactory factory) {
    button = factory.createButton();
    checkBox = factory.createCheckBox();
  }

  public void paint() {
    button.click();
    checkBox.checkBox();
  }
}
