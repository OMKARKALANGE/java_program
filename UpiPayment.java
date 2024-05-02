package in.ashokit;

public class UpiPayment implements IPayment {

	@Override
	public String pay(double amount) {
		// logic through upi
		return "PAyment successfull through upi ";
	}

}
