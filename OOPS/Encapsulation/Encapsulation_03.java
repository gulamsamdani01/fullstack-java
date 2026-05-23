/*☕ 🔹 3️. User Login System
❓ Question
Create a User class with username and password. Password must
 be hidden.*/

package Java.OOPS.Encapsulation;
class User{
	private String username;
	private String password;
	
	public void setUsername (String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		if(password.length() >= 6) {
			this.password = password;
		}else {
			this.password ="Defult@1234";
		}
	}
	
	public String getUsername(){
		return username;
	}
	
	public String getPassword() {
		return "*********" ;
	}
}
public class Encapsulation_03 {

	public static void main(String[] args) {
		User u = new User();
		u.setUsername("Prince Raza");
		u.setPassword("maru");
		System.out.println("Username = " +u.getUsername());
		System.out.println("Password = " +u.getPassword());

	}

}
