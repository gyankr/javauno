package samples.patterns.Command;

public class Food {

	
	public Food(Order order) {
		this.item= order.toString();
	}

	public  String item="water"; //default
	
}
