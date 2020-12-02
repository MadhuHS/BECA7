package exceptions;

public class Mainclass {
	public static void test(int num) {
		System.out.println("test() starts...");

		int res = 50 / num;
		System.out.println(res);

		System.out.println("test() ends...");
	}

	public static void main(String[] args) {
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
