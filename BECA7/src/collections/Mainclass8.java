package collections;

import java.util.HashMap;

public class Mainclass8 
{
	public static void main(String[] args) 
	{
        HashMap hm1 = new HashMap();
        hm1.put(111,"city1");
        hm1.put(222,null);
        hm1.put(333,"city3");
        hm1.put(null,"city5");
        hm1.put(555,null);
        
        System.out.println(hm1.get(111));
        
        hm1.put(111,"city4");
        
        System.out.println(hm1.get(111));
        System.out.println(hm1.get(null));
        System.out.println(hm1.get(222));
        System.out.println(hm1.get(555));  
        
        System.out.println("-------foreach-------");
        hm1.forEach((key,value) -> System.out.println(value));
	}
}





