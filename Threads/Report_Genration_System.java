package Java.Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ReportGenrator implements Callable<String>{
	
	private String ReportName;
	public ReportGenrator (String ReportName) {
		this.ReportName=ReportName;
	}
	@Override
	
	public String call() throws Exception{
		
		Thread.sleep(3000);
		return ReportName + "Genrator Succefull";
	}
	
}

public class Report_Genration_System {

	public static void main(String[] args) {
		
		try {
			ExecutorService executor = Executors.newSingleThreadExecutor();
			
			// Create object of Callable class
			ReportGenrator report = new ReportGenrator("Sales Report");
			
			//Submit Task..
			
			Future<String> future = executor.submit(report);
			System.out.println("Report is Genrating....");
			
			// Get result
			
			String result = future.get();
			
			System.out.println(result);
			
			executor.shutdown();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
