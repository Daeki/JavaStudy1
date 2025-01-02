package com.winter.app.study2.object3;

class ObjectStudent {
	
	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	//생성자
	//메서드명은 클래스명과 동일하게
	//기본 생성자(Default Constructor)
	//매개변수가 없는 생성자
	public ObjectStudent() {
		System.out.println("생성자 호출");
	}
	
	
	public void info() {
		System.out.println("info");
		//참조변수 this
		//객체가 생성할 시 만들어지는 변수 
		//해당객체의 주소가 저장
		//this는 생략 가능
		this.sum();
		System.out.println(this);
		System.out.println(this.name);
		System.out.println(num);
		
	}
	
	public void sum() {
		System.out.println("sum 메서드 입니다");
		//재귀함수
		//this.info();
		this.total=this.kor+this.eng+this.math;
		this.avg = this.total/3.0;
	}

}
