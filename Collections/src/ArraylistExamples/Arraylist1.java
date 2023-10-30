package ArraylistExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1 {

	public static void main(String[] args) {
		
		  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	      list.add("Mango");//Adding object in arraylist  
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");  
	      list.add("Mango");
	//Printing the arraylist object 
	     // System.out.println(list);  
	      
	      
	      //Use Iterator
	      
	 /*     Iterator itr=list.iterator();//getting the Iterator
	      while(itr.hasNext()){//check if iterator has the elements
	         System.out.println(itr.next());//printing the element and move to next
	               }  
      */
    
	      //Use ForEach
	      
	      for(String fruit:list)
	    	  System.out.println(fruit);
	    	  
	      
	    	  
	      
	      
	}

}
