public class BankDemo
{
	public static void main(String[] args)
	{
		CheckingAccount c=new CheckingAccount(101);
		System.out.println("Deposting $500...");
		c.deposit(500.00);
		try
		{
			System.out.println("\nWithdrawing $100...");
			c.withdraw(100.00);
			System.out.println("\nWithdrawing $600...");
			c.withdraw(600.00);
		}
		catch(InsufficientResourcesException e)
		{
			System.out.println("Sorry,but you are short $"+e.getAmount());
			e.printStackTrace();
		}
	}
}
class InsufficientResourcesException extends Exception
{
	private double amount;
	public InsufficientResourcesException(double amount)
	{
		this.amount=amount;
	}
	public double getAmount()
	{
		return amount;
	}
}

class CheckingAccount
{
	private double balance;
	private int number;
	public CheckingAccount(int number)
	{
		this.number=number;
	}
	public void deposit(double amount)
	{
		balance+= amount;
	}
	public void withdraw(double amount) throws InsufficientResourcesException
	{
		if(amount<=balance)
		{
			balance-=amount;
		}
		else
		{
			double needs = amount-balance;
			throw new InsufficientResourcesException(needs);
		}
		
	}
	public double getBalance()
	{
		return balance;
	}
	public int getNumber()
	{
		return number;
	}
}
		