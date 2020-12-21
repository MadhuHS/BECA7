package collections;

import java.util.TreeSet;

public class Mainclass4 {

	public static void main(String[] args) 
	{
        TreeSet t1 = new TreeSet();
        TreeSet t2 = new TreeSet();
        
        t1.add("egg");
        t1.add("ball");
        t1.add("apple");
        t1.add("dog");
        t1.add("ant");
        
        t1.forEach(obj -> System.out.println(obj));
        
        t2.add(20);
        t2.add(10);
        t2.add(40);
        t2.add(50);
        t2.add(30);
        
        t2.forEach(obj -> System.out.println(obj));
	}

}
