package com.winter.app.controls;

public class StudyControl4 {
	
	/**
	 * 여러개 중 하나 선택
	 * 
	 * switch case
	 * 
	 * switch(정수식 또는 문자열){
	 * 		case 정수 또는 문자열:
	 * 		break;
	 * 
	 * 		case 정수 또는 문자열:
	 * 		break;
	 * 		...
	 * 
	 * 		default:
	 * }
	 * 
	 * */
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//A, B, C, D, F
		int avg=100;  
		//90, 91, 92 ...99 A
		//80, 81, 82 ...89 B
		//70, 71, 72 ...79 C
		
		switch(avg/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		
		default:
			System.out.println("F");
		
		}
		
		
		System.out.println("프로그램 종료");
	}

}
