package com.winter.app;

import java.util.Scanner;

public class Study5 {
	/**
	 * 연산자
	 * 산술연산자 - 숫자 계산
	 * 	+, -, *, /, %(나머지값 구하는 연산자)
	 * 
	 *  + 
	 *  1) 산술연산자
	 *  2) 연결연산자 문자열 + primitive
	 * 
	 * */
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 50;
		int num2 = num1 + 20;
		num2 = (int)(num1 + 1.2);
		
		System.out.println("국어 입력");
		int n1 = sc.nextInt();
		
		System.out.println("영어 입력");
		int n2 = sc.nextInt();
		
		System.out.println("수학 입력");
		int n3 = sc.nextInt();
		
		int total = n1+n2+n3;
		double avg = (double)total/3.0;
		
		System.out.println(total);
		System.out.println(avg);
		
		System.out.println("프로그램 종료");
	}

}
