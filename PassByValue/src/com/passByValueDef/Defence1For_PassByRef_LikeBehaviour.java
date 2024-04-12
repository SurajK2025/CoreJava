package com.passByValueDef;

//To avoid direct modification of your original object:
//1.Make object properties immutable (using final keyword).

class Car{
	final Integer seatCount;
	
//	public void setSeatCount(Integer newSeatCount) {	//Compiler/Checked error, trying to modify immutable property.
//		this.seatCount = newSeatCount;
//	}
	
	public Integer getSeatCount() {
		return this.seatCount;
	}
	
	public Car(Integer seatCount) {
		this.seatCount = seatCount;
	}
	
	public String toString() {
		return "Number of seats: " + this.seatCount;
	}
}

public class Defence1For_PassByRef_LikeBehaviour {
	private void addOneSeatToCar(Car c) {
//		c.seatCount = c.seatCount + 1;	//Compiler/Checked error, trying to modify immutable property.
		
		//Safe modification
		c = new Car(c.getSeatCount()+1);
	}
	
	public static void main(String[] args) {
		Car c = new Car(4);
		System.out.println("Before modification: " + c);
		new Defence1For_PassByRef_LikeBehaviour().addOneSeatToCar(c);
		System.out.println("After modification: " + c);
	}
}
