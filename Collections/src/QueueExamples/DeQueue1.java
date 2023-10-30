package QueueExamples;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueue1 {

	public static void main(String[] args) {
		Deque<String> deque=new ArrayDeque<String>();  
	    deque.offer("arvind");  
	    deque.offer("vimal");  
	    deque.add("mukul");  
	    deque.offerFirst("jai");  
	    System.out.println("After offerFirst Traversal...");  
	for(String s:deque){  
	        System.out.println(s);  
	    }  
	deque.poll();
	deque.pollFirst();//it is same as poll()
	    deque.pollLast();  
	    System.out.println("After pollLast() Traversal..."); 
	 System.out.println("Afterpoll and  pollFirst() Traversal...");
	for(String s:deque){  
	        System.out.println(s);  
	    }  


	}

}
