package com.winter.app.controls;

import java.util.Scanner;

public class StudyControl2 {
	
	/**
	 * if ~ else 둘 중 하나를 선택
	 * 
	 * if(조건식){
	 * 		조건식이 true일 때만 실행
	 * }else {
	 * 		조건식이 false일 때 실행
	 * }
	 * 
	 * */

	public static void main(String[] args) {
		//sysout + crtl+space
		System.out.println("프로그램 시작");
		
		int num=-5;
		int age=0;
		if(num>0) {
			num++;
			age=20;//지역변수
			age++;
		}else {
			System.out.println("음수 입니다");
		}
		
		System.out.println(num);
		System.out.println(age);
		
		//-----------------------------------------
		Scanner sc = new Scanner(System.in);
		
		int id=1234;
		int pw=5678;
		
		System.out.println("id 입력");
		int yId = sc.nextInt();
		
		System.out.println("pw 입력");
		int yPw = sc.nextInt();
		
		if(id==yId && pw==yPw) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		
		
		
		System.out.println("프로그램 종료");
	}
}
