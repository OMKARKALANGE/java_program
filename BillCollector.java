package in.ashokit;

public class BillCollector {
	
	private IPayment payment;
	public void setPayment(IPayment payment)
	{
		this.payment = payment;
		
	}
	public BillCollector()
	{
		
	}
	
	public BillCollector(IPayment payment)
	{
		this.payment=payment;
		
	}
	
	public void collectPayment(double amount)
	{
		String status =payment.pay(amount);
		System.out.println(status);
		
		
		//CreditcardPayment cd =new CreditcardPayment();
	//	ccd.pay(amount)l;  *** it is not way to develop classes tightly coupling
		
	}

}
