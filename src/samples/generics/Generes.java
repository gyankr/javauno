package samples.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

public class Generes {
	
	public static void main(String[] args) {
		//List<Integer> myIntList = new LinkedList<Integer>();
		List myIntList = new LinkedList();
		myIntList.add(new Integer(0));
		Integer x =  (Integer)myIntList.iterator().next(); 
		/*
		 * The above cast is annoying
		 * uncomment the line List<Integer> , to infer
		 * generics
		 */
		
		List<String> ls = new ArrayList<String>(); //1
		// List<Object> lo = ls; //This would cause compile time error , see below
		/*
		 * In general, if Foo is a subtype (subclass or subinterface) of Bar, and G is some
generic type declaration, it is not the case that G<Foo> is a subtype of G<Bar>.
This is probably the hardest thing you need to learn about generics, because it goes
against our deeply held intuitions.
		 */

		Collection<?> c = new ArrayList<String>();
	//	c.add(new Object()); //compile error
		
		/*
		 * Wildcards
		Take a look at the following declaration.
			<T extends Vehicle> int totalFuel(List<T> list) { }
	
	The parameter T occurs only once in the method signature, in an argument. You can imagine that the method body 
	does not use the name T either. In this case you can use an alternative syntax, 
	called wildcards, denoted with ?

			int totalFuel(List<? extends Vehicle> list) { }
			
	The two signatures for totalFuel are equivalent. The meaning of <? extends Vehicle> is: I don't care what the 
	type parameter is, as long as it is a subclass of Vehicle. 
		 * 
		 * 
		 * The super bound is not allowed in class definition.
			//this code does not compile !
			class Forbidden<X super Vehicle> { }
		 */
		
	}
}
