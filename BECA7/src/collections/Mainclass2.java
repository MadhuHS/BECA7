package collections;

import java.util.ArrayList;

public class Mainclass2 
{
	public static void main(String[] args) 
	{
		ArrayList alist = new ArrayList();
		alist.add(10);// store value to collection
		alist.add(null);
		alist.add(30);
		alist.add(null);
		alist.add("Hello");
		alist.add(10);
		System.out.println(alist.get(0));
		
		System.out.println(alist);
		
		for(Object ref : alist)
		{
			System.out.println(ref);
		}		
		
	}
}




