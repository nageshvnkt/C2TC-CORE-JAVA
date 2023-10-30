package ArraylistExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist1a {

	public static void main(String[] args) {
		ArrayList <String> al=new ArrayList<String>();
		al.add("Banana");
		al.add("Apple");
		al.add("Orange");
		al.add("Grapes");
		al.add("Apple");
		
		//System.out.println(al);
		
//		Iterator itr=al.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
//		System.out.println("Returning element: "+al.get(1));
//		al.set(1,"Dates");
		
		Collections.sort(al);
		for(String fruits:al)
			System.out.println(fruits);
		
		
	ArrayList <Integer>al2=new ArrayList<Integer>();
	al2.add(56);
	al2.add(899);
	al2.add(516);
	al2.add(829);

	Collections.sort(al2);
	for(Integer numb:al2)
		System.out.println(numb);
	
	
	
		
		
		
		

	}

}
