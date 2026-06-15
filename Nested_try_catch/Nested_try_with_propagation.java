/*❓ Question
Demonstrate exception propagation using nested try.*/

package Java_LLMS.Nested_try_catch;

public class Nested_try_with_propagation {

	public static void main(String[] args) {
		try {
			try {
				int x =20/0;
			}catch(NullPointerException e) {
				System.out.println("Inner catch");
			}
		}catch(ArithmeticException e) {
			System.out.println("Outer Catch Handle it.");
		}
	}

}
