/*☕ 🔹 2️. Constructor + Inheritance
❓ Question
Create class Person with constructor printing "Person created".
Create class Student that extends Person.*/

package Java.OOPS.Inheritance;

class Person{
	Person(){
		System.out.println("Person Created.");
	}
}

class Student extends Person{
	Student(){
		System.out.println("Student Created");
	}
}
public class Inheritance_02 {

	public static void main(String[] args) {
		Student s= new Student();
		
	}

}
