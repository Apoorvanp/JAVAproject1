package employee;
import java.util.Scanner;

public class Employee {

  String firstName;
  String lastName;
  double salary;

// constructor
  public Employee(String firstName, String lastName, double salary) {
  this.firstName = firstName;
  this.lastName = lastName;
  if (salary > 0)
  this.salary = salary;
  }

  public Employee()
  {

  }

// getter and setter
  public String getFirstName() {
  return firstName;
  }

  public String getLastName() {
  return lastName;
  }

  public void setFirstName(String firstName) {
  this.firstName = firstName;
  }

  public void setLastName(String lastName) {
  this.lastName = lastName;
  }

  public void setSalary(double salary) {
  if( salary > 0)
  this.salary = salary;
  }

  public double getSalary() {
  return salary;
  }

  public double getAnnualSalary()
  {
  return this.salary*12;
  }

  public void incrementSalary()
  {
  this.salary += this.salary*0.1;
  }

}