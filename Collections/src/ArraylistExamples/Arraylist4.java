package ArraylistExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Arraylist4 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();  
			           ll.add("Ravi");  
			           ll.add("Vijay");  
		               ll.add("Ajay"); 
		               ll.add("Pooja");
		               
		              // Iterator itr=ll.iterator();
		              
		              Iterator itr=ll.descendingIterator();  
		              while(itr.hasNext())
		              System.out.println(itr.next());
  


	}

}
