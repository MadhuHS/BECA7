/* Diff between Array and ArrayList*/

package collections;

import java.util.ArrayList;

public class Mainclass9 
{
	public static void main(String[] args) 
	{
        String[] a1 = new String[2];
        a1[0] = "hello";
        a1[1] = "world";        
        for(int index=0; index<a1.length; index++)
        {
          System.out.println(a1[index]+" "+a1[index].length());	
        }
        
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("hello");//store value to collection
        alist.add("world");
        
        for(int index=0; index<alist.size(); index++)
        {
          System.out.println(alist.get(index) +" "+alist.get(index).length());	
        }
        
	}
}








