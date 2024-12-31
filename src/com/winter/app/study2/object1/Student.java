package com.winter.app.study2.object1;

public class Student {
	
	//멤버변수(Instance 변수)
	//접근지정자 [그외지정자] 데이터타입 변수명;
	//이름,학번, 국어, 영어, 수학, 총점, 평균

	//Reference, instance, 참조
	String name;
	//Primitive, Instance
	int num;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	
	
	//하는일 멤버메서드(Instance 메서드)
	//접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]){
	//  실행 코드들,,,
	//}
	public void info(int num1, double num2) {
		System.out.println("학생 입니다");
		//두개의 숫자를 합을 계산
		System.out.println(num1+num2);
		
	}
	
	//print
	public void print() {
		System.out.println("print");
	}
	

}
