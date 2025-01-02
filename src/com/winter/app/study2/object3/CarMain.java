package com.winter.app.study2.object3;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		
		Car car1 = new Car();
		car1.info();
		
		Car car2 = new Car("White");
		//car2.color="White";
		car2.info();
		
		//k5, Red
		Car car3 = new Car("Red");
		//k7, yellow
		Car car4 = new Car("Yellow", "K7");
		car4.info();

	}

}
