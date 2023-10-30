package SetExamples;

import java.util.HashSet;
import java.util.Objects;

class Students
{
	int rollno;
	String name;
	double fees;
	public Students(int rollno, String name, double fees) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.fees = fees;
	}
	@Override
	public int hashCode() {
		return Objects.hash(fees, name, rollno);
	}
	
		
}
public class HastSetduplicate {
	

	public static void main(String[] args) {
		Students s1=new Students(123,"Sachin",2944.0);
		Students s2=new Students(173,"Saurav",2644.0);
		Students s3=new Students(183,"Rahul",2334.0);
		Students s4=new Students(183,"Rahul",2334.0);
		
		HashSet<Students> set=new HashSet<Students>();  
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
	for(Students st:set)
	System.out.println(st.rollno+" "+st.name+" "+st.fees);

}
}