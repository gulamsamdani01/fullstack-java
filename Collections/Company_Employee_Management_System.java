package Java.Collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	private int employeeId;
	private String employeeName;
	private String department;
	private double salary;
	
	public Employee(int employeeId,String employeeName,String department,double salary) {
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.department=department;
		this.salary=salary;
	}
	
	public String getdepartment() {
		return department;
	}
	public double getsalary() {
		return salary;
	}
	public String toString() {
		return "Employee ID : "+employeeId+
				", Employee Name : "+employeeName+
				", Department : "+department+
				", Salary : "+salary;
	}
}
public class Company_Employee_Management_System {

	public static void main(String[] args) {
		List<Employee> employee = Arrays.asList(
				
				new Employee(101,"Prince","HR",60000),
				new Employee(104,"Arif","IT",75000),
				new Employee(102,"Misu","Finance",80000),
				new Employee(105,"Rahul","IT",55000),
				new Employee(104,"Krishna","HR",90000));
		
		List<Employee> highSalaryEmpolyee = employee.stream()
				.filter(emp->
						emp.getsalary()>=70000)
				.collect(Collectors.toList());
		
		highSalaryEmpolyee.forEach(System.out::println);
			
	}

}
