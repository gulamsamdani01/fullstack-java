package Java.MultiThreading;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CustomerRequest implements Runnable{
	public final int requestId; 
	
	public CustomerRequest (int requestId) {
		this.requestId=requestId;
	}	
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+
					" Processing Request. "+requestId+" at "+LocalDateTime.now());
			Thread.sleep(2000);
			
			System.out.println(Thread.currentThread().getName()+
					" Complete Request : "+requestId);
		}catch(InterruptedException e) {
			System.out.println(Thread.currentThread().getName()+
					" Request failed :"+requestId);
		}
	}
}
public class E_Commerce_Request_Processing_System {

	public static void main(String[] args) {
		
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		
		System.out.println(" E-Commerce Service start \n");
		
		for(int i=1;i<=10;i++) {
			threadPool.submit(new CustomerRequest(i));
		}
		threadPool.shutdown();
	}

}
