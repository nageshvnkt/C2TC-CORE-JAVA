package SetExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ListToHashSet {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();  
        list.add("Ravi");  
        list.add("Vijay");  
        list.add("Ajay"); 
        list.add("Ravi");

         HashSet<String> set=new HashSet(list);  
         Iterator<String> itr=set.iterator();  
         while(itr.hasNext())  
                    {  
                    System.out.println(itr.next());  
                    }

	}

}
