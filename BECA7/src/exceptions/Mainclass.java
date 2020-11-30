package exceptions;

public class Mainclass 
{
	public static void test(int num)
	{
	   System.out.println("test() starts...");
	   
	   try
	   {
	    int res = 50 / num;
	    System.out.println(res);
	   }
	   catch(ArithmeticException ae)
	   {
		 System.out.println("INVALID NUM for the DIVISION operation");  
	   }
	   
	   System.out.println("test() ends...");
	}
	
	public static void main(String[] args) 
	{
       System.out.println("Main starts...");
       test(0);
       System.out.println("Main ends...");
	}
}
