/*Method Overloading with Different Types
❓ Question
Create a class with overloaded method display() for:

int

String*/

package Java.OOPS.Polymorphism;

class Demo{
	void display(int a) {
		System.out.println("String : " + a);
	}
	
	void display(String s) {
		System.out.println("String : " + s);
	}
}
public class Method_Overloading_with_Different_Types {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.display(98);
		d.display("Prince Raza");
	}

}
