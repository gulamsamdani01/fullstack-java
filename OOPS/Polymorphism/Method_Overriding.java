/* Method Overriding (Runtime Polymorphism)..
❓ Question
Create a class Animal with method sound().
Create subclasses Dog and Cat that override this method.*/

package Java.OOPS.Polymorphism;

class Animals{
	void sound() {
		System.out.println("Animal Sound");
	}
}

class Dog extends Animals {
	void sound() {
		System.out.println("Dog Barks..");
	}
}

class Cat extends Dog {
	void sound() {
		System.out.println("Cat Meow..");
	}
}
public class Method_Overriding {

	public static void main(String[] args) {
		Animals a;
		
		a = new Dog();
		a.sound();
		
		a = new Cat();
		a.sound();
	}

}
