package ArraylistExamples;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist2 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();//Creating arraylist  
	      al.add("Mango");//Adding object in arraylist  
	      al.add("Apple");    
	      al.add("Banana");    
	      al.add("Grapes");  
	      al.add("Mango");
	      
	      Collections.sort(al);
	       for(String fruit:al)
	    	   System.out.println(fruit);

	       ArrayList<Integer> al2=new ArrayList<Integer>();//Creating arraylist  
		      al2.add(89);//Adding object in arraylist  
		      al2.add(78);    
		      al2.add(56);    
		      al2.add(24);  
		      al2.add(34);
		      
		      Collections.sort(al2);
		       for(Integer numb:al2)
		    	   System.out.println(numb);    
	       
	       
	       
	       
	}

}
