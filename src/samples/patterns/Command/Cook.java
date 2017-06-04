package samples.patterns.Command;

public class Cook {

	public Food prepareOrder(Order order, Waiter waiter) {
		
		
		return new Food(order);
	}

}
