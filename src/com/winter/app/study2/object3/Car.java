package com.winter.app.study2.object3;

public class Car {
	String company;
	String brand;
	String color;
	int wheel;
	
	//메서드
	public Car() {
		//this();->자기 클래스의 또 다른 생성자 호출
		//생성자내에서 첫줄에 위치
		//위에 다른 코드가 있으면 error발생
		
//		this.company="Kia";
//		this.brand="K5";
//		this.color="Black";
//		this.wheel=4;
		
		this("Black");
		System.out.println("");
	}
	
	
	
	public Car(String color) {
//		this.company="Kia";
//		this.brand="K5";
//		this.color=color;
//		this.wheel=4;
		this(color, "k5");
	}
	
	public Car(String color, String brand) {
//		this.company="kia";
//		this.brand=brand;
//		this.color=color;
//		this.wheel=4;		
		this(color, brand, 4);
	}
	
	public Car(String color, String brand, int wheel) {
		this.company="kia";
		this.brand=brand;
		this.color=color;
		this.wheel=wheel;		
	}
	
	
	
	public void info() {
		System.out.println(this.company);
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.wheel);
		System.out.println("===================");
	}
	

}
