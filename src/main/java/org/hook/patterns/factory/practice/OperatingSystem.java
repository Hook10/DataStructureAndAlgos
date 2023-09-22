package org.hook.patterns.factory.practice;

public abstract class OperatingSystem {
  private String version;
  private String architecture;

  public abstract void work();

  public OperatingSystem(String version, String architecture) {
    this.version = version;
    this.architecture = architecture;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  @Override
  public String toString() {
    return "OperatingSystem{" +
        "version='" + version + '\'' +
        ", architecture='" + architecture + '\'' +
        '}';
  }
}
