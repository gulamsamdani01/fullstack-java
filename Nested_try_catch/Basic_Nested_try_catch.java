/*❓ Question
Write a program using nested try-catch where:

Outer block handles arithmetic error

Inner block handles array error*/

package Java_LLMS.Nested_try_catch;

public class Basic_Nested_try_catch {
	public static void main (String[]args) {
		try {
			try {
				int arr[]= {1,2,3};
				System.out.println(arr[5]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Inner : Array Error");
			}
			int x =10/0;
			
				
			}catch(ArithmeticException e) {
				System.out.println("Outer: Arithmetic Error");
		}
	}
}
