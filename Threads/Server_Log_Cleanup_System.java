package Java.Threads;

import java.time.LocalDateTime;

class logCleanupService extends Thread{
	public void run() {
		while(true) {
			try {
				System.out.println("[DAMON] Cleaning old logs in :: "+
			LocalDateTime.now());
				
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				System.out.println("[DOMAN] Cleaning Interrupted...");
			}
		}
	}
}

public class Server_Log_Cleanup_System {

	public static void main(String[] args) {
		logCleanupService logCleanup = new logCleanupService();
		
        // Make daemon thread
		logCleanup.setDaemon(true);
		
		logCleanup.start();
		
		try {
			for (int i=1;i<=5;i++) {
				System.out.println("[User] Processing Request:"+i);
				Thread.sleep(2000);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("[User] Application Shutdown..");
	}

}
