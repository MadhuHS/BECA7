package encapsulation;

class Account//Bank Account
{
	private double bal;
	
	public void setBal(double bal)//intialize
	{
		if(bal > 0)
		{
		 this.bal = bal;
		}
		else
		{
		  System.out.println("TRANSACTION FAILED due to INVALID AMT");
		}
	}
	
	public double getBal()//return Currentvalue
	{
		return this.bal;
	}
}

class Transaction//UPI apps--> G-pay PhonePe PayTm
{
	public static void deposit(double amt,Account ref)
	{
		double b1 = ref.getBal();//get current bal
		b1 = b1 + amt;//cal new bal
		ref.setBal(b1);//update new bal
	}
	
	public static void withdraw(double amt,Account ref)
	{
		double b2 = ref.getBal();//get current bal
		b2 = b2 - amt;//cal new bal
		ref.setBal(b2);//update new bal
	}
	
	public static void checkBal(Account ref)
	{
		double b3 = ref.getBal();
		System.out.println("Current Bal : "+b3);
	}
}

public class Mainclass 
{
	public static void main(String[] args) 
	{
       Account a1 = new Account();
       Transaction.checkBal(a1);
       Transaction.deposit(1000, a1);
       Transaction.checkBal(a1);
	}
}





