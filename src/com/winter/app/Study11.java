package com.winter.app;

public class Study11 {
	
	/**
	 * 삼항연산자
	 * 조건식은 결과물이 boolean
	 * 변수 = 조건식?조건식이 true라면 실행:조건식이 false일때 실행;
	 * 
	 * 
	 * 비트 논리 연산자 
	 * &(and), |(or), ~(not)
	 * 0 : false, 1: true
	 * 
	 * 쉬프트 연산자
	 * 3 << 2 
	 * 정수3을 2비트만큼 왼쪽으로 밀고 빈칸은 0으로 채움
	 * 
	 * 3 >> 2
	 * 정수 3을 2비트만큼 오른쪽으로 밀고 
	 * 양의 정수였다면 빈칸을 0으로 채우고
	 * 음의 정수 였다면 빈칸을 1로 채움
	 * 
	 * 3 >>> 2
	 * 정수 3을 2비트만큼 오른쪽으로 밀고
	 * 음수든 양수든 상관없이 빈칸을 0으로 채움
	 * */
	
	public static void main(String[] args) {
		
		//나이를 입력 받아서 미성년자 구분
		int age=18;
		
		String result = age>19?"성년":"미성년";
		
		System.out.println(result);
		
		int price=20000;
		//가격이 30000이상 구매시 택배비 무료, 아니라면 2500택배비가 추가
		//최종 가격
		
		//int money = price >=30000?0:2500;
		price = price>=30000?price:price+2500;
		
		System.out.println(price);
		
		System.out.println(3&2);
		System.out.println(~2);
		
	}

}
