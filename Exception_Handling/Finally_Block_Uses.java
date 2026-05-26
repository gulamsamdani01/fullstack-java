package Java_LLMS.Exception_Handling;

public class Finally_Block_Uses {

	public static void main(String[] args) {
		try {
			int x=10/0;
		}catch(Exception e) {
			System.out.println("Exception occures");
		}finally {
			System.out.println("Always Executes");
		}
	}

}
