package samples.annotation;

@myParentObject
public class myChildObject {
	/**
	 * As you can see, you do not have to define the interface methods inside the  
	 * implementing class. These are automatically inherited because of using 
	 * the @Inherited tag.
	 * What would happen if you define the implementing class 
	 * in old-fashioned Java-style? 
	 * 	You have to implement all the abstract methods.
	 * 	Do you see the difference? You can see that you will
	 *  have to implement all the methods that the parent
	 *   interface owns. Besides the isInherited() and 
	 *   doSomething() methods from myParentObject, you will
	 *    have to implement the equals(), toString(), and 
	 *    hasCode() methods of java.lang.Object and also 
	 *    the annotationType() method of java.lang.annotation.
	 *    Annotation class. It does not matter whether you want to implement 
		these methods or not; you will have to include these in your inherited object.
	 */
	public static void main(String[] args) {
		
	}
}
