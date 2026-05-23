/*Create an Employee class where each object gets 
 * a unique ID using constructor.*/

package Java.OOPS.Constructor;

class Employee{
	static int counter =1000;
	int id;
	String name;
	
	Employee(String name){
		this.name = name;
		id = ++counter;
	}
	void display() {
		System.out.println("ID = " +id);
		System.out.println("Name = " +name);
	}
}
public class Employee_Salary {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Raza");
		Employee e2 = new Employee("Sara");
		e1.display();
		e2.display();

	}

}
