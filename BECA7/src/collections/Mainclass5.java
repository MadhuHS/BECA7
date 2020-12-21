package collections;

import java.util.Comparator;
import java.util.TreeSet;

class DescOrder implements Comparator<String>
{
	@Override
	public int compare(String s1, String s2) 
	{
		return s2.compareTo(s1);
	}
}

class LengthOrder implements Comparator<String>
{
	@Override
	public int compare(String s1, String s2) 
	{
		return s1.length() - s2.length();
	}
	
}

public class Mainclass5 {
	
	public static void main(String[] args) 
	{
		DescOrder d1 = new DescOrder();
		LengthOrder l1 = new LengthOrder();
		TreeSet t1 = new TreeSet(l1);
        
        t1.add("eeeee");
        t1.add("bb");
        t1.add("a");
        t1.add("ccc");
        t1.add("dddd");
        
        t1.forEach(obj -> System.out.println(obj));
	}

}
