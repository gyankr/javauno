package samples.patterns;

/**
 * <p>
I think the Singleton implementation goes as below various versions!!

1. Traditional Approach
</p>
*
*/

public class MySingleton {

	private static MySingleton mySingleton= new MySingleton();

	private MySingleton () { }

	public static MySingleton getInstance() { return mySingleton; }
}
/**
 * <p>
This works fine for multiple thread but the object resides in memory even if its unused. (i.e. as it not lazy instantiated)

2. To Implement lazy instantiation following was done but does not work with multithreading
*</p>
*/
 class MySingleton2 {

	private static MySingleton2 mySingleton ;

	private MySingleton2 () { }

	public static MySingleton2 getInstance() { 
             	if ( mySingleton == null ) mySingleton = new MySingleton2();
			return mySingleton ; 
      }
}

/**
 * <p>
 * 3. To make above work in multi-threaded environment following was done*/
 class MySingleton3 {

	private static MySingleton3 mySingleton ;

	private MySingleton3 () { }

	public static synchronized MySingleton3 getInstance() { 
             	if ( mySingleton == null ) mySingleton = new MySingleton3();
			return mySingleton ; 
      }
}


/**
 * 4. Problem is every time a lock is obtained for every call to getInstance. So double-checked was done to avoid this.*/
 class MySingleton4 {

	private static MySingleton4 mySingleton ;

	private MySingleton4 () { }

	public static MySingleton4 getInstance() { 
             	if ( mySingleton == null ) {

				synchronized ( MySingleton4.class )  {
					
					if ( mySingleton == null ) {
						mySingleton = new MySingleton4();
					}
				}
			}
			return mySingleton ; 
      }
}


/**
 * 5. Double-checked sometimes does not work as each thread may Cache the object in their threads there is some explainination given in 
	http://en.wikipedia.org/wiki/Double_checked_locking_pattern#cite_note-6
And about Volatile
	http://www.java-samples.com/showtutorial.php?tutorialid=331

*/
