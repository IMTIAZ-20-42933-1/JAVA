import java.lang.*;

public class Account
{
	int accountNumber;
    String accountHolderName;
    double balance;
	
	public void setaccountNumber(int an)
	{
		accountNumber = an;
	}
	
	public void setaccountHolderName (String ahn)
	{
	accountHolderName = ahn;	
	}
	
	public void setbalance (double b)
	{
		balance = b;
	}
	
	public int getaccountNumber ()
	{
		return accountNumber;
	}
	
	public String getaccountHolderNumber ()
	{
		return accountHolderName;
	}
	
	public double getbalance ()
	{
		return balance;
	}
	public void showDetails()
	{
		System.out.println("Account Number:" + accountNumber);
		System.out.println("Account Holder Name:" + accountHolderName);
		System.out.println("Balance:" + balance);
	}
}
		