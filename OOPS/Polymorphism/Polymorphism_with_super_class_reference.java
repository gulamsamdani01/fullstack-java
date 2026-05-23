/*Polymorphism with super class reference
❓ Question
Use parent reference to call child method.*/

package Java.OOPS.Polymorphism;

class Shape{
	void draw() {
		System.out.println("Drawing Shape");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle ");
	}
}
public class Polymorphism_with_super_class_reference {

	public static void main(String[] args) {
		Shape s = new Shape();
		s.draw();
	}

}
