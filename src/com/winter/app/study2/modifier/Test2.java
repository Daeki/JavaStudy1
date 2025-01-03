package com.winter.app.study2.modifier;

public class Test2 {

	public static int num2=100;//Test2.num2=200;
	
	static {
		Test2.num2=30;
	}
	
	public static void m2() {
		System.out.println("static 메서드");
	}
}
