package streams;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Emp
{
	int empno;
	String name;
	double sal;
	
	public Emp(int empno, String name, double sal) 
	{
		super();
		this.empno = empno;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public String toString() 
	{
		return empno +" "+name+" "+sal;
	}
}

public class Mainclass2 {

	public static void main(String[] args) 
	{
        Emp e1 = new Emp(123,"Blake",2000);
        Emp e2 = new Emp(345,"Miller",4563);
        Emp e3 = new Emp(546,"Martin",1234);
        Emp e4 = new Emp(678,"David",4567);
        
        ArrayList<Emp> elist = new ArrayList<Emp>();
        elist.add(e1);
        elist.add(e2);
        elist.add(e3);
        elist.add(e4);
        
        
        Predicate<Emp> p1 = (Emp emp1) ->{ return emp1.sal > 3000;};
        
        elist.stream().filter(p1).forEach((emp1) -> System.out.println(emp1));
        
        elist.stream().filter(p1).collect(Collectors.toList());
        
	}

}








