package com.winter.app.study2.object1;

public class ObjectMain {

	public static void main(String[] args) {
		//OOP 기초
		//객체 생성
		//변수 선언 같아요
		//클래스는 데이터타입입니다...
		//데이터타입 변수명
		//Reference, 지역변수, 참조변수
		Student st= new Student();
		st.name="winter";
		st.num=1;
		
		
		Teacher t = new Teacher();
		t.name="영희";
		t.kind="과학";
		
		
		//
		Student [] students = new Student[5];
		students[0]=st;
		System.out.println(students[0].name);
		
		for(int i=0;i<5;i++) {
			students[i] = new Student();
		}
		
		t.students=students;
		
		System.out.println(t.name);
		System.out.println(t.students[0].name);
		
//		Student st2 = new Student();
//		st2.name="iu";
//		st2.num=2;
//		
//		st = st2;
//		
//		st.name="철수";
//		
//		System.out.println(st.num);
//		System.out.println(st2.name);
//		
//		Monster mon = new Monster();
//		mon.name="오우거";
		
		
		
		
		

	}

}
