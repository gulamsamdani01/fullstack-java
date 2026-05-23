/* Method Overloading (Compile-time Polymorphism)
❓ Question
Create a class with method add() to add:

two integers

three integers*/

package Java.OOPS.Polymorphism;

class Calculator{
	int add(int a,int b) {
		return a + b;
	}
	
	int add (int a ,int b , int c) {
		return a + b + c;
	}
}
public class Method_Overloading {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Add Two Numbers : " + c.add(10,14 ));
		System.out.println("Add Three Numbers : " +c.add(24,65,19 ));
	}

}
