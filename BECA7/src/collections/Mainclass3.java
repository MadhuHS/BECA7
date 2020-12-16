package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Mainclass3 {

	public static void main(String[] args) 
	{
		HashSet hs1 = new HashSet();
		
		hs1.add("hello");
		hs1.add("java");
		hs1.add(null);
		hs1.add("hello");
		hs1.add("html");
		hs1.add(null);

			
		for(Object obj: hs1)
		{
			System.out.println(obj);
		}
		
		System.out.println("----------------------");
        LinkedHashSet hs2 = new LinkedHashSet();
		
        hs2.add("hello");
        hs2.add("java");
        hs2.add(null);
        hs2.add("hello");
        hs2.add("html");
        hs2.add(null);

			
		for(Object obj: hs2)
		{
			System.out.println(obj);
		}
	}

}
