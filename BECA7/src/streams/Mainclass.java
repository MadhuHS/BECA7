package streams;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
public class Mainclass 
{
	public static void main(String[] args) 
	{
       ArrayList<String> a1 = new ArrayList<String>();
       a1.add("aaa");
       a1.add("bbbb");
       a1.add("cccccc");
       a1.add("DD");
       a1.add("E");
      

       /*
        * filter() : Returns a stream consisting of the 
                     elements of this stream that match 
                     the given predicate.
        */

       
       Predicate<String> p1 = (String str) ->
       {
    	   return str.length() > 2;
       };
       a1.stream()
       .filter(p1)
       .forEach(str -> System.out.println(str));
     
       
       Predicate<String> p2 = (String str) ->
       {
    	 String res = str.toUpperCase();
    	 return str.equals(res);
       };
     
       List<String> lst = a1.stream()
       .filter(p2)
       .collect(Collectors.toList());
       
       System.out.println(a1.size());
       
       System.out.println(lst.size());
       
       System.out.println(lst);
       

       
	}
}




