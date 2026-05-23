/*Employee Salary System
❓ Question
Create abstract class Employee with method calculateSalary().
Implement FullTimeEmployee and PartTimeEmployee.*/

package Java.OOPS.Abstraction_Interface;
abstract class Employee{
	abstract double calculateSalary();
	}

class FullTimeEmployee extends Employee{
	double calculateSalary() {
		return 50000;
	}
}

class PartTimeEmployee extends Employee{
	double calculateSalary() {
		return 20000;
	}
}

public class Employee_Salary_System {

	public static void main(String[] args) {
		Employee e;
		
		e = new FullTimeEmployee();
		System.out.println("Full Time Salary ::" + e.calculateSalary());
		
		e = new PartTimeEmployee();
		System.out.println("Part Time Salary ::" + e.calculateSalary());
	}

}
