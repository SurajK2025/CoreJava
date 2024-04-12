package com.passByValue;

//Reassigning a reference variable.

public class PassByValue_2_ObjectRef_ReassigningRefVar {
	
	private void passTheReference(Student s) {
		s = new Student("Akshay", 26);
		System.out.println("Inside method: "+s.toString());
	}

	public static void main(String[] args) {
		Student s1 = new Student("Suraj", 23);
		System.out.println("Before method call: "+s1.toString());
		new PassByValue_2_ObjectRef_ReassigningRefVar().passTheReference(s1);
		System.out.println("After method call: "+s1.toString());
	}

}
