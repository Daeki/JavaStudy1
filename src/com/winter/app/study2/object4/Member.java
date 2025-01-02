package com.winter.app.study2.object4;

public class Member {
	
	//비만관리프로그램
	//멤버변수 초기화 순서
	private String name;
	private int age=10;
	private double muge;
	private double ki;
	private String email;
	
	//Data를 변수에 넣는 메서드 set변수명   : setter 메서드 
	//Data를 외부로 보내는 메서드 get변수명  : getter 메서드
	
	{
		//instance 초기화 블럭
		//멤버변수의 값을 초기화 사용
		this.age=20;
	}
	
	public Member() {
		this.age=30;
	}
	
	
	
	public void setMuge(double muge) {
		if(muge>30 && muge<150) {
			this.muge=muge;
		}
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getKi() {
		return ki;
	}

	public void setKi(double ki) {
		this.ki = ki;
	}

	public double getMuge() {
		
		return this.muge;
	}

}
