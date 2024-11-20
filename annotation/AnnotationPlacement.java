package com.annotation;



@Deprecated // Marks the class as deprecated
public class AnnotationPlacement {

	@SuppressWarnings("deprecation") // Suppresses deprecation warnings for the method
	public void oldMethod() {
		System.out.println("This is an old method that is deprecated.");
	}

	public static void main(String[] args) {
		AnnotationPlacement example = new AnnotationPlacement();

		example.oldMethod(); // Calling deprecated method

		// Using annotation on a local variable
		@SuppressWarnings("unused")
		int unusedVar = 10; // Suppresses the warning for the unused local variable

	}
}
