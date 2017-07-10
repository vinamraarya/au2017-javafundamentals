package com.au.java.example;

// TODO: Auto-generated Javadoc
/**
 * The Class JavaFundamentals.
 */
public class JavaFundamentals {
	
	/** The var. */
	private static Integer var=10;
	
	/**
	 * Increment.
	 */
	public static void Increment()
	{
		var++;
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args){
		
        System.out.println("Test message");
		System.out.println(var);
		for (int i = 0; i < 5; i++) {
			Increment();
			System.out.println(var);
		}
	}
}
