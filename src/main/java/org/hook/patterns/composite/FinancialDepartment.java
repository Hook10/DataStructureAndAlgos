package org.hook.patterns.composite;

public class FinancialDepartment implements Department {

  private Integer id;
  private String name;

  public FinancialDepartment(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public void printDepartment() {
    System.out.println(getClass().getSimpleName());
  }
}
