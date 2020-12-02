package exceptions;

public class Mainclass2 {

	public static void test(int num)throws InterruptedException 
	{
		System.out.println("test() starts...");
        Thread.sleep(num);
		System.out.println("test() ends...");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main starts...");
		System.out.println("Main starts...");
		try 
		{
			test(0);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Main ends...");
	}

}
