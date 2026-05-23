
/*☕ User Registration System
❓ Question
Create a User class where constructor initializes username, 
email, and password. Ensure password is at least 6 characters.*/

package Java.OOPS.Constructor;



class user{
	String username;
	String email;
	String password;


	user(String username,String email , String password){
		this.username = username;
		this.email = email;
		
		if(password.length() >=6) {
			this.password = password;
		}
		else {
			this.password = "default123";
		}
		}
	void display(){
		System.out.println( "Username= " +username);
		System.out.println("Email = " +email);
		System.out.println("Password= "+password);
	}
	}
public class User_Registration_System {

	public static void main(String[] args) {
		user u = new user("Prince Raza","princeraza021@gmail.com","12365");
		u.display();
	}

}
