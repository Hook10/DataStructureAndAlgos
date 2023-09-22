package org.hook.patterns.factory.practice;

public class Main {
  public static void main(String[] args) {
    OperatingSystem linux = OperationSystemFactory.getInstance("LINUX", "first", "best");
    System.out.println(linux);
  }
}
