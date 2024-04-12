package com.passByValue;

//Passing a local and instance variable (primitave type) and changing its value inside a method.

public class PassByValue_1_Primitive {
	
	static int instanceValue = 10;

	private static void changePassedValue(int localValue, int instanceValue) {
		localValue = instanceValue = 20;
		System.out.println("Inside method: "+ localValue + " " + instanceValue);
	}
	
	public static void main(String[] args) {
		int localValue = 10;
		System.out.println("Before method call: " + localValue + " " + instanceValue);
		changePassedValue(localValue, instanceValue);
		System.out.println("After method call: " + localValue + " " + instanceValue);
	}

}