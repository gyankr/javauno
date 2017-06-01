package samples.annotation;

import java.lang.annotation.Inherited;

/**
 * 
 * @Inherited is an inherited annotation
	This is a bit of a complex annotation type. It indicates that 
	the annotated class with this type is automatically inherited. 
	More specifically, if you define an annotation with the @Inherited tag, 
	then annotate a class with your annotation, and finally extend the class 
	in a subclass,all properties of the parent class will be inherited into its subclass.
 */

@Inherited 
	public @interface myParentObject {
		boolean isinherited() default true;
		String doSomething() default "Do What?";
	}
