package SetExamples;

import java.util.LinkedHashSet;

public class LinkedJHashset {

	public static void main(String[] args) {
		LinkedHashSet<String> lset=new LinkedHashSet<String>();
		lset.add("One");
		lset.add("Two");
		lset.add("Three");
		lset.add("Four");
		lset.add("Two");
		for(String s:lset)
			System.out.println(s);

	}

}
