package Java_LLMS.Nested_try_catch;

/*❓ Question
Show how finally works with nested try.*/

public class Nested_try_with_finally {

	public static void main(String[] args) {
		
		try {
			try {
				int a = 10/0;
			}catch(ArithmeticException e) {
				System.out.println("Inner : catch");
			}finally {
				System.out.println("Inner : Finally");
			}
		}catch(Exception e) {
			System.out.println("Outer : catch");
		}finally {
			System.out.println("Outer : Finally");
		}
	}

}
