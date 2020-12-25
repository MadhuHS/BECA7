package lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Mainclass2 
{
	public static void main(String[] args) 
	{
		ArrayList alist = new ArrayList();
		alist.add(10);// store value to collection
		alist.add(20);
		alist.add(30);
		alist.add(40);
		alist.add(50);	
				
		Consumer c1 = (obj) -> 
		{
			System.out.println(obj);
		};
		
		alist.forEach(c1);
		
		alist.forEach((obj) -> System.out.println(obj));
		
		alist.stream().limit(2).forEach(c1);;
	}
}




