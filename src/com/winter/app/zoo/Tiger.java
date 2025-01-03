package com.winter.app.zoo;

public class Tiger extends Animal {
	
	
	//overriding
	//상속받은 메서드의 내용을 자신에 맞게 재정의 하는것
	//메서드의 선언부는 부모것과 동일하게 선언 내용만 수정
	//단 접근지정자는 부모와 동일하거나 더 넓은 개념은 가능
	public void eat() {
		System.out.println("우걱우걱");
	}
	
	public void sleep() {
		System.out.println("");
	}

	
	public void play() {
		System.out.println();
		
	}

	@Override
	public void poo() {
		System.out.println();
		
	}
	
	
	

}
