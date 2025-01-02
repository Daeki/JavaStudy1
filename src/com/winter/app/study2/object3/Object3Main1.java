package com.winter.app.study2.object3;

import com.winter.app.study2.object4.ModTest;

public class Object3Main1 {

	public static void main(String[] args) {
		ObjectStudent student;
		student = new ObjectStudent();
		student.name="winter";
		System.out.println(student);
		//student.ObjectStudent();
		
		ObjectStudent student2 = new ObjectStudent();
		student2.name="iu";
		
		
		student.info();
		student2.info();
		
		ModTest modTest = new ModTest();
		modTest.num1=1;
		//modTest.num2=2;
		//modTest.num3=3;
		//modTest.num4=4;
		

	}

}
