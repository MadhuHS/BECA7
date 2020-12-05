package ds;

class User extends Object {
	int id;
	String name;
	long mob;

	public User(int id, String name, long mob) {
		super();
		this.id = id;
		this.name = name;
		this.mob = mob;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + mob;
	}
}

class FrontEnd {
	public static void showAllUsers() 
	{
		for(int i=0; i<BackEnd.userArray.length; i++)
		{
		  System.out.println(BackEnd.userArray[i]);
		}
	}
}

class BackEnd 
{
	static User[] userArray = new User[3];
	static int index = 0;

	public static void addUser(int id, String name, long mob) 
	{
		if (index < userArray.length) 
		{
			userArray[index] = new User(id, name, mob);
			index++;
		}
		else
		{
		   System.out.println("Array is Full");
		}
	}
}

public class Mainclass {
	public static void main(String[] args) {
		BackEnd.addUser(123, "Smith", 9875567121l);
		BackEnd.addUser(124, "David", 8888888238l);
		BackEnd.addUser(423, "MArtn", 87668181314l);
		BackEnd.addUser(971, "Blake", 987876532l);

		FrontEnd.showAllUsers();
	}
}
