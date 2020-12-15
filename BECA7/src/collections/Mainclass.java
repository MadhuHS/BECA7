/* Diff between Array and ArrayList*/

package collections;

import java.util.ArrayList;

public class Mainclass 
{
	public static void main(String[] args) 
	{
        int[] a1 = new int[2];
        a1[0] = 10;
        System.out.println(a1[0]);
        
        for(int index=0; index<a1.length; index++)
        {
          System.out.println(a1[index]);	
        }
        
        ArrayList alist = new ArrayList();
        alist.add(10);//store value to collection
        alist.add(20);
        alist.add(30);
        System.out.println(alist.get(0));
        
        for(int index=0; index<alist.size(); index++)
        {
          System.out.println(alist.get(index));	
        }
        
	}
}








