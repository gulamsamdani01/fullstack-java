/* ☕ 🔹 4️. Method Overriding + super
❓ Question
Override a method but also call parent method using super */

package Java.OOPS.Inheritance;
class Parent{
	void show() {
		System.out.println("Parent Method");
	}
}

class child extends Parent{
	void show() {
		super.show();
		System.out.println("Child Method");
	}
}
public class Inheritance_04 {

	public static void main(String[] args) {
		child c = new child();
		c.show();
	}

}
