package com.passByValue;

//Modifying an object’s properties via a reference variable.

class Student {
	private String name;
	private Integer age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	Student(String name, Integer age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString(){
		return "Name: "+this.name+" Age: "+this.age;
	}
}

public class PassByValue_3_ObjectRef_ModifyingProperties {
	
	private void passTheReference(Student s) {
		s.setName("Akshay");
		s.setAge(26);
		System.out.println("Inside method: "+s.toString());
	}

	public static void main(String[] args) {
		Student s1 = new Student("Suraj", 23);
		System.out.println("Before method call: "+s1.toString());
		new PassByValue_3_ObjectRef_ModifyingProperties().passTheReference(s1);
		System.out.println("After method call: "+s1.toString());
	}

}
