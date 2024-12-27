package com.winter.app.controls;

import java.util.Scanner;

public class StudyLoop2 {
	
	public static void main(String[] args) {
		//for(초기식;조건식;증감식){}
		//0초 ~ 59초
		Scanner sc = new Scanner(System.in);
//		System.out.println("초를 입력");
//		int sec= sc.nextInt();//10
//		
//		
//		for(int i=0;i<60;i++) {
//			System.out.println(i+"초");
//			if(sec==i) {
//				i=59;
//			}
//			
//		}
		
		int id=1234;
		int pw=5678;
		
		//id와 pw를 입력받아서 로그인 유무 판단
		//최대 5번의 기회
		//5번 내에서 성공하면 로그인 성공 출력후 종료
		//5번이 넘어가면 은행방문 출력후 종료
		
		boolean check=false;
		
		for(int i=0;i<5;i++) {
		
			System.out.println("id 입력");
			int yId = sc.nextInt();
			System.out.println("pw 입력");
			int yPw = sc.nextInt();
			
			if(id==yId && pw==yPw) {
				//로그인 성공
				i=1000;
				check=!check;
			}else if(i<4) {
				System.out.println("로그인 실패");
			}else {
				System.out.println("은행방문");
			}
		}
		
		if(check) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("은행 방문");
		}
		
		System.out.println("프로그램 종료");
		
	}//main 끝

}//class 끝
