package com.winter.app.controls;

import java.util.Scanner;

public class StudyLoop8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		
		//1.로그인 시도 2.프로그램종료
		boolean check=true;
		
		while(check) {
			System.out.println("1.로그인 2.종료");
			int select = sc.nextInt();
			
			if(select==1) {
				//로그인 진행
				System.out.println("ID 입력");
				int yId=sc.nextInt();
				
				System.out.println("PW 입력");
				int yPw=sc.nextInt();
				if(yId==id && yPw==pw) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("로그인 실패");
				}
				
				
			}else {
				break;
			}
			
		}
		//2번, 로그인 성공
		
		
		
		
		System.out.println("프로그램 종료");
		
		
	}
	

}
