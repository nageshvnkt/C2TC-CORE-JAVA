package SetExamples;

import java.util.TreeSet;

import java.util.*;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet<String> al=new TreeSet<String>();
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		al.add("Ajay");  
		
		//Traversing elements
//		  Iterator<String> itr=al.iterator();  
//		while(itr.hasNext()){  
//		   System.out.println(itr.next());  
//		  }  

		//Traversing elements descending order
		  Iterator<String> itr2=al.descendingIterator();  
		while(itr2.hasNext()){  
		   System.out.println(itr2.next());  
		  }  

	}

}
