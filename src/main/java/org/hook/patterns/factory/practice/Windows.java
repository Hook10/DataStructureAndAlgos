package org.hook.patterns.factory.practice;

public class Windows extends OperatingSystem{

  public Windows(String version, String architecture) {
    super(version, architecture);
  }

  @Override
  public void work() {
    System.out.println("Windows works . . .");
  }
}
