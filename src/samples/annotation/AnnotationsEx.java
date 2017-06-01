package samples.annotation;

/*
 * Where are they useful? Say you are working with RMI 
 * (Remote Method Invocation) and you don't want all 
 * of your methods available remotely. 
 * You could annotate the remotable ones with 
 * a @Remote annotation, then whatever serves up 
 * the remote access can only allow those to be remotely 
 * accessed. There are a ton of great uses for these, and 
 * they are fully extendable (you can annotate annotations)!
 */
public class AnnotationsEx {
	
	public static void main(String[] args) {
		new AnnotationsEx()
			.callAnnotatedMeth();
	}

	@SimpleAnnotation(doTestTarget = "Annotation from Test")
	private void callAnnotatedMeth() {
		   System.out.println("Testing Target annotation");

	}

}
