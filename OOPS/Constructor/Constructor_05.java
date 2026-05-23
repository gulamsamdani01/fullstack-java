/*☕ 🔹 5️⃣ Copy Constructor for Student Records
❓ Question
Create a Student class where one student object copies another 
and adds bonus marks.*/

package Java.OOPS.Constructor;

class Student{
	int marks;
	
	Student(int marks){
		this.marks = marks;
	}
	
	Student(Student s){
		this.marks = s.marks + 5;
	}
	
	void show() {
		System.out.println("Marks = " + marks);
	}
}


public class Constructor_05 {

	public static void main(String[] args) {
		Student s1 = new Student(90);
		Student s2 = new Student(s1);
		
		s2.show();
	}

}
