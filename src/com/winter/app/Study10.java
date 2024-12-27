package com.winter.app;

public class Study10 {
	/**
	 * 증감연산자
	 * 1씩 증가 시키거나 1씩 감소 시킬 때 사용
	 * ++
	 * 
	 * --
	 * 
	 * 
	 * 1. 선행
	 * ++변수명
	 * 
	 * 2. 후행
	 * 변수명++
	 * 
	 * 
	 * 확장된 대입 연산자
	 * 
	 * num=num+3;
	 * num+=3
	 * 
	 * num=num/5;
	 * num/=5;
	 * 
	 * num=n+5;(x)
	 * */
	
	
	public static void main(String[] args) {
		int num=0;
		
		num=num+1;
		
		++num; //num=num+1
		
		num++; //num=num+1
		
		--num;
		
		num--;
		
		num=1;
		
		int result=++num; //2, 2
		
		result = num++ + ++num;
		System.out.println(num);
		System.out.println(result);
		
		
	}

}
