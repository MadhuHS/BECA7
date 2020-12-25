package collections;

import java.util.LinkedList;

public class Mainclas6 
{
	public static void main(String[] args) 
	{
       LinkedList lst = new LinkedList();
       lst.add(10);
       lst.add(20);
       lst.add(30);
       lst.add(40);
       
       System.out.println(lst.get(0));//LIST
       
       System.out.println("Size : "+lst.size());
       lst.forEach(obj -> System.out.println(obj));
       System.out.println("Size : "+lst.size());
       
       while(lst.size()!=0)
       {
          System.out.println(lst.poll());//FIFO//QUEUE
       }
       
       System.out.println("Size : "+lst.size());
	}
}
