package employee;
import java.util.Scanner;
public class EmployeeTest{

 public static void main(String[] args) {

  Scanner in = new Scanner(System.in);

// setting using constructor
  System.out.println("Enter first name");
  String firstName = in.nextLine();
  System.out.println("Enter last name");
  String lastName = in.nextLine();
  System.out.println("Enter salary");
  double salary = in.nextDouble();
  Employee e1 = new Employee(firstName, lastName, salary);

// setting using setter
  firstName = "Apoorva";
  lastName = "Kumar";
  salary = 1000;
  
  Employee e2 = new Employee();
  e2.setFirstName(firstName);
  e2.setLastName(lastName);
  e2.setSalary(salary);

// displaying yearly salary before increment
  System.out.println("Emp1: " + e1.getAnnualSalary());
  System.out.println("Emp2: " + e2.getAnnualSalary());

// displaying yearly salary after increment
  e1.incrementSalary();
  e2.incrementSalary();
  System.out.println("Emp1: " + e1.getAnnualSalary());
  System.out.println("Emp2: " + e2.getAnnualSalary());


  }

}


	
