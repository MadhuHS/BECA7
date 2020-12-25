package collections;

import java.util.PriorityQueue;


public class Mainclass7 {
	
	public static void main(String[] args) 
	{
		PriorityQueue q1 = new PriorityQueue();
        
        q1.add("e");
        q1.add("b");
        q1.add("a");
        q1.add("c");
        q1.add("b");
        q1.add("d");
        
        //q1.forEach(obj -> System.out.println(obj));
        
        while(q1.size()!=0)
        {
        	System.out.println(q1.poll());
        }
	}

}
