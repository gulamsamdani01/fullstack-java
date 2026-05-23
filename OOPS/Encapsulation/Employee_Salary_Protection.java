/*   Employee Salary Protection
❓ Question
Create an Employee class where salary cannot be negative.*/

package Java.OOPS.Encapsulation;

class Employee{
	private double salary;
	
	public void setsalary(double salary) {
		if (salary >=0) {
			this.salary = salary;
		}
	}
	
	public double getsalary(){
		return salary;
	}
}
public class Employee_Salary_Protection {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setsalary(10000);
		System.out.println("Salary = " + e.getsalary());
	}

}
