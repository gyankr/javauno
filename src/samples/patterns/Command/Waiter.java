package samples.patterns.Command;

public class Waiter {

		/*
		 * The waiter is associated with 
		 * multiple customers and multiple orders 
		 * 			
		 */
	public Food takeOrder(Customer cust, Order order) {
		//Now waiter takes it to the cook 
		Cook cook = new Cook();
		//Cook who (has-a relation) prepares food
		Food food = cook.prepareOrder(order,this);
		return food;
	}
}
