package Java.OOPS.Inheritance;
class Animal{
	void sound() {
		System.out.println("Animal Sound");
	}
}
class dog extends Animal{
	void sound(){
		System.out.println("Dog Sound");
	}
}
public class Animal_Sound {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
		
		dog d = new dog();
		d.sound();
	}

}
