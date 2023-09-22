package org.hook.patterns.factory.practice;

public class OperationSystemFactory {

  private OperationSystemFactory(){}

  public static OperatingSystem getInstance(String type, String version, String architecture) {
    switch (type) {
      case "WINDOWS":
        return new Windows(version, architecture);
      case "LINUX":
        return new Linux(version, architecture);
      default:
        throw new IllegalArgumentException("OS Not supported");
    }
  }
}
