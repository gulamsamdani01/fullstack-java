package Java_LLMS.Nested_try_catch;

class main{
	static int test(){
		try {
			try {
				return 1;
			}finally {
				System.out.println("Inner finally");
			}
		}finally {
			System.out.println("Outer finally");
		}
	}
}
public class Nested_Try_with_return_statment {

	public static void main(String[] args) {
		
		main m = new main();
		System.out.println(m.test());
	}

}
