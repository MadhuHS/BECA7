package collections;

import java.util.HashSet;

public class Mainclass3 {

	public static void main(String[] args) 
	{
		HashSet hs1 = new HashSet();
		
		hs1.add("hello");
		hs1.add("java");	
		
		hs1.forEach(obj -> System.out.println(obj));
	}

}
