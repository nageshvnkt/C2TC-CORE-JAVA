package SetExamples;

import java.util.HashSet;
import java.util.Objects;

class Student
{
	int rollno;
	String name;
	int fees;
	public Student(int rollno, String name, int fees) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", fees=" + fees + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(fees, name, rollno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return fees == other.fees && Objects.equals(name, other.name) && rollno == other.rollno;
	}
	
}
public class HashSetUserdefined {

	public static void main(String[] args) {
		Student s1=new Student(23,"Rohit",345);
		Student s2=new Student(13,"Rohan",415);
		Student s3=new Student(63,"Suresh",562);
		Student s4=new Student(63,"Suresh",562);
		HashSet<Student> set=new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		for(Student st:set)
			System.out.println(st);
		
	}

}
