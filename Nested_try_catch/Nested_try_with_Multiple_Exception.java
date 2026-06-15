//  Handle string and arithmetic exception using nested try.

package Java_LLMS.Nested_try_catch;

public class Nested_try_with_Multiple_Exception {

	public static void main(String[] args) {
		try {
			try {
				String s = null;
				System.out.println(s.length());
			}catch(NullPointerException e) {
				System.out.println("Inner: Null error");
			}
			
			int a = 20/0;
			
		}catch(ArithmeticException e) {
			System.out.println("outer: Divided by zero");
		}
	}

}
