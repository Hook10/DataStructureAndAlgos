package org.hook.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department{
  private Integer id;
  private String name;
  private List<Department> childDepartments;

  public HeadDepartment(Integer id, String name) {
    this.id = id;
    this.name = name;
    this.childDepartments = new ArrayList<>();
  }

  public void printDepartment(){
    childDepartments.forEach(Department::printDepartment);
  }

  public void addDepartment(Department department) {
    childDepartments.add(department);
  }

  public void removeDepartment(Department department) {
    childDepartments.remove(department);
  }

}
