package Java.Collections;

import java.util.TreeMap;

class Student{
	
	private int rank;
	private String name;
	private double percentage;
	
	public Student(int rank,String name,double percentage) {
		this.rank=rank;
		this.name=name;
		this.percentage=percentage;
	}
	@Override
	public String toString() {
		return " Rank : "+rank+
				", Name : "+name+
				", Percentage : "+percentage;
	}
}
public class Student_Ranking_Management_System {

	public static void main(String[] args) {
		TreeMap<Integer,Student> ranking = new TreeMap<>();
		
		ranking.put(2,new Student(2,"Aman",85.4));
		ranking.put(1,new Student(1,"Aditiya",95.8));
		ranking.put(3,new Student(3,"Prince",75.3));
		
		System.out.println("====== Student Ranking List ========");
		
		ranking.forEach((rank,Student)->
			System.out.println(Student));
		
		
	}

}
