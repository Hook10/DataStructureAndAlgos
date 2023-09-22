package org.hook.patterns.factory.practice;

public class Linux extends OperatingSystem{

  public Linux(String version, String architecture) {
    super(version, architecture);
  }

  @Override
  public void work() {
    System.out.println("Linux works ... ");
  }
}
