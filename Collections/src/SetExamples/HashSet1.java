package SetExamples;

import java.util.HashSet;
import java.util.Iterator;



public class HashSet1 {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        set.add("Two"); 
        
        Iterator<String> itr=set.iterator();  
      while(itr.hasNext())  
        {  
        System.out.println(itr.next());  
        }  

	}

}
