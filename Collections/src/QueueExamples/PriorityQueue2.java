package QueueExamples;

import java.util.PriorityQueue;



class Studen implements Comparable<Studen>
{
	int rollNo;
	String name;
	int fees;
	public Studen(int rollNo, String name, int fees) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
	}
	@Override
	public int compareTo(Studen o) {
		if(rollNo>o.rollNo){    
			return 1;    
			    }else if(rollNo<o.rollNo){    
			return -1;    
			    }else{    
		
		return 0;
	}
		
}
	@Override
	public String toString() {
		return "Studen [rollNo=" + rollNo + ", name=" + name + ", fees=" + fees + "]";
	}
	
}
public class PriorityQueue2 {

	public static void main(String[] args) {
		Studen s1=new Studen(213,"Govind",46);
		Studen s2=new Studen(713,"Irfan",36);
		Studen s3=new Studen(234,"Joseph",21);
		Studen s4=new Studen(934,"Delin",31);
		
		PriorityQueue<Studen> queue=new PriorityQueue<Studen>();
		queue.add(s1);
		queue.add(s2);
		queue.add(s3);
		queue.add(s4);
		
		System.out.println("Traverse elements");
		for(Studen st:queue)
			System.out.println(st);
		
		queue.remove(); 
	    System.out.println("After removal");	
		for(Studen st:queue)
			System.out.println(st);

	
	}

}
