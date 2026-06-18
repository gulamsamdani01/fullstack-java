package Java.Collections;

import java.util.PriorityQueue;

class Patient implements Comparable<Patient>{
	private int id;
	private String name;
	private int Priority;
	
	public Patient(int id,String name,int Priority) {
		this.id=id;
		this.name=name;
		this.Priority=Priority;
	}
	@Override 
	public int compareTo(Patient other) {
		return Integer.compare(this.Priority, other.Priority);
	}
	@Override
	public String toString() {
		return " Patient ID : " + id +
				" ,Patient Name : "+name+
				" ,Priority : "+Priority;
		
	}
}
public class Hospital_Emergency_Management_System {

	public static void main(String[] args) {
		PriorityQueue<Patient> patient = new PriorityQueue<Patient>();
		
		patient.add(new Patient(101,"Aman",2));
		patient.add(new Patient(105,"Vishal",5));
		patient.add(new Patient(104,"Prince",1));
		patient.add(new Patient(102,"Arif",4));
		patient.add(new Patient(103,"Vivek",3));
		
		System.out.println("------- Emergency Treatment Queue --------");
		
		while(!patient.isEmpty()) {
			Patient patients = patient.poll();
			
			System.out.println("Treating : "+ patients);
		}
	}

}
