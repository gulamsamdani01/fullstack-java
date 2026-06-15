
package Java.Threads;

import java.util.PriorityQueue;

class Patient implements Comparable<Patient>{
	private String PatientName;
	private int priority;
	
	public Patient(String PatientName,int priority) {
		this.PatientName=PatientName;
		this.priority=priority;
	}
	
	public String getPatientName() {
		return PatientName;
	}
	
	public int getPriority() {
		return priority;
	}
	
	@Override
	public int compareTo(Patient other) {
		return Integer.compare(this.priority,other.priority);
	}
	@Override
	public String toString() {
		return "Patient Name:"+PatientName +
				" |Priority:"+priority;
	}
	
}

public class Hospital_Emergency_System {
	public static void main (String [] args) {
		
		PriorityQueue<Patient> patients = new PriorityQueue<>();
		
		patients.add(new Patient("Rahul",2));
		patients.add(new Patient("Muskan",1));
		patients.add(new Patient("Arif",5));
		patients.add(new Patient("Dev",4));
		patients.add(new Patient("Prince",3));
		
		System.out.println("====== Emergency Queue =======");
		
		while(!patients.isEmpty()) {
			Patient patient = patients.poll();
			
			System.out.println("Treating -->"+patient);
			
		}

		

}
}