package in.ashokit;

public class DebitcardPayment implements IPayment {

	@Override
	public String pay(double amount) {

		//Debitcard payment logic
		return "PAyment successful through debit card";
	}

}
