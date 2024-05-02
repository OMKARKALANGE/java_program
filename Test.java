package in.ashokit;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws Exception {
	//	BillCollector bc = new BillCollector();
		
	//	injecting Creditcard object into BillCollector (Setter injection)
	//	bc.setPayment(new CreditcardPayment());
	
		
		
	//injecting CreditCard obj into BillCollector(Constructor Injection)
	//	BillCollector bc1= new BillCollector(new CreditcardPayment()) ;
	
		
		//	bc.setPaymenrt(new DebitcardPayment());
	//	bc.setPaymenrt(new UpiPayment());
		
		
	//	bc.collectPayment(1500.00);
		
		
	/*	CreditcardPayment ccd = new CreditcardPayment();
		
		Class<?> clz = Class.forName("in.ashokit.Billcollector");//loading the class
		
		
		Field field = clz.getDeclaredField("payment");//getting field name which we need to access
		field.setAccessible(true);						
		
		
		Object obj = clz.newInstance();					//creating a object of the class we loaded 
		field.set(obj, ccd);							//injecting value to variable
		
		
		BillCollector bc =(BillCollector) obj;
		bc.collectPayment(2000.00);*/
		
		
		
		//dependent class object
		CreditcardPayment ccd =new CreditcardPayment();
		
		//target class object
		BillCollector collector = new BillCollector();
		
		//injecting dependent class object into target class object
		collector.setPayment(ccd);

		collector.collectPayment(3000.00);
		
		
	}
}
