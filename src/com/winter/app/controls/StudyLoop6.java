package com.winter.app.controls;

import java.util.Scanner;

public class StudyLoop6 {
	/**
	 * 0분 0초
	 * 0분 1초
	 * 0분 2초
	 * ...
	 * 0분 59초
	 * 1분 0초
	 * ...
	 * 59분 59초
	 * 
	 * 분 초 를 입력받음
	 * ex) 1, 5
	 * 1분 5초 까지 출력하고 종료
	 * */
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("분 입력");
		int min = sc.nextInt();
		System.out.println("초 입력");
		int sec = sc.nextInt();
		
		boolean flag=false;
		
		for(int m=0;m<60;m++) {
			for(int s=0;s<60;s++) {
				System.out.println(m+":"+s);
				if(min==m && sec==s) {
					flag=!flag;
					m=60;
					break;
				}
			}
			
//			if(flag) {
//				break;
//			}
			
		}
		
		
		System.out.println("프로그램 종료");
	}

}
