package Java.MultiThreading;

import java.util.concurrent.CompletableFuture;

public class E_Commerce_user_dashboard {

	public static void main(String[] args) {
		
		System.out.println("Dashboard Loading.......");
		
		CompletableFuture<String> profileFuture=
				CompletableFuture.supplyAsync(()->{
					
					try {
						Thread.sleep(3000);
					}catch(Exception e) {}
					
					return "Profile : Prince Raza";

				});
		
		CompletableFuture<String> OrderFuture=
				CompletableFuture.supplyAsync(()->{
					
					try {
						Thread.sleep(1500);
					}catch(Exception e) {}
					
					return "Order : 25 Completed Order";
				});
		
		CompletableFuture<String> walletFuture =
				CompletableFuture.supplyAsync(()->{
					
					try {
						Thread.sleep(1000);
					}catch(Exception e) {}
					
					return "Wallet Balance :$2500 ";
				});
		
		CompletableFuture<String> rewardFuture=
				CompletableFuture.supplyAsync(()->{
					
					try {
						Thread.sleep(500);
					}catch(Exception e) {}
					
					return "Reward Points : 1500";
				});
		
		CompletableFuture.allOf(profileFuture,OrderFuture,
				walletFuture,rewardFuture).join();
		
		System.out.println(profileFuture.join());
		System.out.println(OrderFuture.join());
		System.out.println(walletFuture.join());
		System.out.println(rewardFuture.join());
		
		System.out.println("Dashboard Load Succesfully....");
	}

}
