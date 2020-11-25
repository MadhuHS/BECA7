package libs;

class Employee extends Object
{
	String name;
	int    id;
	double sal;
	
	public Employee(String name, int id, double sal) 
	{
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	
	@Override
	public int hashCode()
	{
		return id;
	}
	
	@Override
	public String toString()
	{
		return id+" "+name+" "+sal;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		return this.hashCode() == obj.hashCode();// e1id == e2id
	}	       
}


public class Mainclass 
{
	public static void main(String[] args) 
	{
       Employee e1 = new Employee("Smith",1234,4567.2);
       Employee e2 = new Employee("Smith",1234,4567.2);
       
       System.out.println(e1.hashCode());
       System.out.println(e1.toString());
       System.out.println(e1.equals(e2));
	}
}







