package com.winter.app.study2.object3;

public class ObjectExMain {

	public static void main(String[] args) {
		ObjectEx ex1 = new ObjectEx();
		ex1.num1=10;
		ex1.num2=20;
		
		ObjectEx ex2 = new ObjectEx();
		ex2.num1=12;
		ex2.num2=20;
		
		ex1.eq(ex2);
		ex2.eq(ex1);
		
		
		System.out.println(ex1==ex2);

	}

}
