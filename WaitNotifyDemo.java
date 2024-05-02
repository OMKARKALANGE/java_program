package in.threadpractice;
class Customer
{
	int amount=10000;
	void withdraw(int amount)
	{
		
		System.out.println("Going to withdraw ");
		if(this.amount<amount)
		{
			System.out.println("Less balance : Waiting for deposit");
		}
		this.amount =this.amount - amount;
		System.out.println("Withdarwal completed");
	}
	synchronized void deposit(int amount)
	{
		System.out.println("Going to deposit...");
		this.amount=this.amount+amount;
		System.out.println(Thread.currentThread().getName()));
		System.out.println("wmount deposited");
	}
}
public class WaitNotifyDemo {
	public static void main(String[] args) {
		Customer cs= new Customer();
		
		new Thread();
		{
			public void run
			{
				cs.withdraw(15000);
			}.start();
			
			new Thread()
			{
				public void run()
				{
					cs.deposit(10000);
				}
			}
		}
	}

}
