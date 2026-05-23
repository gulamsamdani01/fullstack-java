/*	Notification System
❓ Question
Create an interface Notification with method send().
Implement Email, SMS, and PushNotification.*/

package Java.OOPS.Abstraction_Interface;
interface Notification{
	void send (String message);
}

class Email implements Notification{
	public void send (String message) {
		System.out.println("Email : " +message);
	}
}

class Sms implements Notification{
	public void send(String message) {
		System.out.println("SMS : " + message);
	}
}
 class PushNotification implements Notification{
	 public void send(String message) {
		 String AppName = "My App";
		 String Type = "Alert";
		 System.out.println("📱📱 = " + AppName);
		 System.out.println("Type = " + Type);
		 System.out.println("Push Notification = " + message);
		 System.out.println("Time = " + java.time.LocalTime.now());
	 }
 }
public class Notification_System {

	public static void main(String[] args) {
		Notification n;
		
		n = new Email();
		n.send("Hello User");
		
		n = new Sms();
		n.send("OTP : 1234");
		
		n = new PushNotification();
		n.send("Out Of Dilvery.");
	}

}
