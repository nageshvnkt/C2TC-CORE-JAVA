package ArraylistExamples;

import java.util.LinkedList;

class Students
{
	int rollNo;
	String stdName;
	double stdfees;
	public Students(int rollNo, String stdName, double stdfees) {
		super();
		this.rollNo = rollNo;
		this.stdName = stdName;
		this.stdfees = stdfees;
	}
	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", stdName=" + stdName + ", stdfees=" + stdfees + "]";
	}
	
	
}

public class Arraylist5 {

	public static void main(String[] args) {
		Students s1=new Students(213,"Govind",4867.8);
		Students s2=new Students(713,"Irfan",3698.0);
		Students s3=new Students(234,"Joseph",2109.0);
		Students s4=new Students(934,"Delin",3176.7);
		
		LinkedList<Students> ll=new LinkedList<Students>();
		
		ll.add(s1);
		ll.add(s2);
		ll.add(s3);
		ll.add(s4);
		
		for(Students st:ll)
			System.out.println(st);

	}

}
