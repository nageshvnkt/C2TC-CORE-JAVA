package ArraylistExamples;

import java.util.ArrayList;
import java.util.Iterator;

class Student
{
	int rollNo;
	String stdName;
	int stdAge;
	public Student(int rollNo, String stdName, int stdAge) {
		super();
		this.rollNo = rollNo;
		this.stdName = stdName;
		this.stdAge = stdAge;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", stdName=" + stdName + ", stdAge=" + stdAge + "]";
	}	
	
}

public class Arraylist3 {

	public static void main(String[] args) {
		Student s1=new Student(213,"Govind",46);
		Student s2=new Student(713,"Irfan",36);
		Student s3=new Student(234,"Joseph",21);
		Student s4=new Student(934,"Delin",31);
		
		ArrayList <Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Iterator itr=al.iterator();  
		//traversing elements of ArrayList object
		while(itr.hasNext()){  
		    Student st=(Student)itr.next();  
		  // System.out.println(st.rollNo+" "+st.stdName+" "+st.stdAge); 
		    System.out.println(st);
		  }  

		
		
	}

}
