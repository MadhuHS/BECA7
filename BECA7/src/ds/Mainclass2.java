package ds;

class Mobile extends Object
{
	double price;
	String model;

	public Mobile(double price, String model) 
	{
		super();
		this.price = price;
		this.model = model;
	}
	
	@Override
	public String toString() 
	{
		return model + " " +price;
	}
}

class Laptop extends Object
{
	double price;
	String model;

	public Laptop(double price, String model) 
	{
		super();
		this.price = price;
		this.model = model;
	}
	
	@Override
	public String toString() 
	{
		return model + " " +price;
	}
}

class Book extends Object
{
	double cost;
	String title;
	String author;

	public Book(double cost, String title, String author) 
	{
		super();
		this.cost = cost;
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() 
	{
		return title + " " +author+" "+cost;
	}

}

class Cart 
{
  static Object[] crt = new Object[3];
  static int index = 0;
   
   public static void addToCart(Object ref)
   {
	 if(index < crt.length)
	 {
	   crt[index] = ref;
	   index++;
	   System.out.println("product added to cart"); 
	 }
	 else
	 {
		 System.out.println("Cart is full");
	 }
	 
   }
   
   public static void showCart()
   {
	 for (int i = 0; i < crt.length; i++) 
	 {
	    System.out.println(crt[i]);	
	 }  
   }
}

public class Mainclass2 
{
	public static void main(String[] args) 
	{
		System.out.println("Program starts...");
        
		Book b1 = new Book(931,"t1","auth1");
		Cart.addToCart(b1);
		
		Mobile m1 = new Mobile(12331,"mobile1");
		Cart.addToCart(m1);
		
		Laptop l1 = new Laptop(100000,"laptop1");
		Cart.addToCart(l1);
		
		Cart.showCart();
        
        
		System.out.println("Program ends...");
	}
}








