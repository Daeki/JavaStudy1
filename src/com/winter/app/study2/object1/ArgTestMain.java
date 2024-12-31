package com.winter.app.study2.object1;

public class ArgTestMain {

	public static void main(String[] args) {
		
		ArgTest test = new ArgTest();
		
		int num=5;
		
		test.info(num);
		
		System.out.println(num);
		
		Student student = new Student();
		student.kor=30;
		test.info2(student);
		System.out.println(student.kor);
		

	}

}
