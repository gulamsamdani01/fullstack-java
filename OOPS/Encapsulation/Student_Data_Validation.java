/*  Student Data Validation
❓ Question
Create a Student class with private marks. Allow setting 
marks only between 0–100.*/

package Java.OOPS.Encapsulation;

class Student{
	private int marks;
	
	public void setMarks (int marks) {
		if (marks >= 0 && marks <= 100) {
			this.marks = marks;
		}else {
			System.out.println("Invalid Marks...");
		}
	}
	
	
	public int getMarks(){
		return marks;
	}
}
public class Student_Data_Validation {

	public static void main(String[] args) {
		Student s = new Student();
		s.setMarks(80);
		System.out.println("Marks =" + s.getMarks());
	}

}
