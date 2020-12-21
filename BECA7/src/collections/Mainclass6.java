package collections;

import java.util.Comparator;
import java.util.TreeSet;

class Student implements Comparable<Student>
{
	String name;
	int id;
	double agg;
	
	public Student(String name, int id, double agg) 
	{
		super();
		this.name = name;
		this.id = id;
		this.agg = agg;
	}
	
	@Override
	public String toString() 
	{
		return id+" "+name+" "+agg;
	}

	@Override
	public int compareTo(Student obj)//natural ordering 
	{
		int res = this.id - obj.id;
		return res;
	}	
}


class IDOrder implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) 
	{
		int res = s1.id - s2.id;
		return res;
	}
	
}
public class Mainclass6 {

	public static void main(String[] args) 
	{
        Student s1 = new Student("S1",1,61.2);
        Student s4 = new Student("S4",4,87.2);
        Student s2 = new Student("S2",2,67.2);
        Student s3 = new Student("S3",3,59.2);
        
        TreeSet<Student> t1 = new TreeSet<Student>();
        t1.add(s2);
        t1.add(s4);
        t1.add(s3);
        t1.add(s1);
        
        t1.forEach(std -> System.out.println(std));
	}

}






