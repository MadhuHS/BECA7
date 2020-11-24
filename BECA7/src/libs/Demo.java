package libs;

public class Demo extends Object
{
	public static void main(String[] args) 
	{
       System.out.println("Program starts...");
       
       Object obj1 = new Object();//instance
       Object obj2 = obj1;
       Object obj3 = new Object();
       
       int h1 = obj1.hashCode();
       System.out.println(h1);
       
       System.out.println(obj2.hashCode());
       System.out.println(obj3.hashCode());
       
       String s1 = obj1.toString();
       System.out.println(s1);
       
       System.out.println(obj2.toString());
       System.out.println(obj3);//println()-->toString()
       
       boolean b1 = obj1.equals(obj2);
       System.out.println(b1);
       
       System.out.println(obj1.equals(obj3));
       
       System.out.println("Program ends...");
	}
}




