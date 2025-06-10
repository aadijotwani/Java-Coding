package pack1;

public class Employee 
{
	private int accountID;
	private double bankBalance;
	
	public void set(int accountID , double bankBalance)
	{
		this.accountID = accountID;
		this.bankBalance = bankBalance;
	}
	public void get()
	{
		System.out.println("Account number = " + accountID);
		System.out.println("Bank Balance = " + bankBalance);
	}
}
