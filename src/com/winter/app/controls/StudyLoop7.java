package com.winter.app.controls;

import java.util.Scanner;

public class StudyLoop7 {
	/**
	 * 
	 * while(조건식){
	 * 	조건식이 true일때 실행
	 * }
	 * 
	 * */
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1.정보입력  2.정보수정 3.정보출력 4.프로그램종료
		
		boolean flag=true;
		
		while(flag) {
			System.out.println("1.정보입력  2.정보수정 3.정보출력 4.프로그램종료");
			int select= sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("정보입력 코드 생성");
				break;
			case 2:
				System.out.println("정보수정 코드 생성");
				break;
			case 4:
				System.out.println("종료");
				break;
				
			default:
				System.out.println("다시 입력하세요");
			}
			
//			if(select==1) {
//				System.out.println("정보입력 코드 생성");
//			}else if(select==2) {
//				System.out.println("정보수정 코드 생성");
//			}else if(select==3) {
//				System.out.println("정보출력 코드 생성");
//			}else if(select==4) {
//				System.out.println("종료");
//				flag=!flag;
//				break;
//			}else {
//				System.out.println("다시 입력하세요");
//			}
			
		}

	}

}
