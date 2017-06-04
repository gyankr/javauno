package samples.patterns.Command;

public class Client {

	
	public static void main(String[] args) {
		Customer cust= new Customer();
			Waiter waiter = new Waiter();
			Order order = new Order("Chicken wings with barbeque sauce ");
				waiter.takeOrder(cust, order);
	}
	
}
