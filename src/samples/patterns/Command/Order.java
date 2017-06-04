package samples.patterns.Command;


public class Order {

	/*
	 * The order is made of command which the customer gives the waiter.
	 */
	
	private String command;
	
	public Order(String command) {
			
		this.command=command;
		System.out.println(" Order/command recieved " + this.command);
	}
	
}
