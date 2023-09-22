package org.hook.patterns.composite;

public class Main {
  public static void main(String[] args) {
    Department fd = new FinancialDepartment(1, "Fin department");
    Department sales = new SalesDepartment(2, "Sales department");

    HeadDepartment headDepartment = new HeadDepartment(3, "Head department");

    headDepartment.addDepartment(sales);
    headDepartment.addDepartment(fd);

    headDepartment.printDepartment();
  }
}
