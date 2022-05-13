package com.pcwk.oop05;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		Car car02 = new Car("Red");
		
		System.out.println(car.toString());
		
		System.out.println("Car(): "+car.color+", "+car.gearType
				+", "+car.door); // Car(): white, auto, 4
		System.out.println("Car(\"Red\"): "+car02.color+", "+car02.gearType
				+", "+car02.door); // Car("Red"): Red, auto, 4

	}

}
