package com.winter.app.controls;

import java.util.Scanner;

public class StudyLoop5 {
	
	/**
	 * FPS
	 * 총알 30
	 * 탄장 1*30
	 * 탄창 3개
	 * 1.단발모드 2.점사모드
	 * 
	 * */
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0;i<3;i++) {
			System.out.println("1.단발 2.점사");
			int select = sc.nextInt();
			System.out.println(select);
			int count=3;
			String sound="타타탕";
			if(select==1) {
				count=1;
				sound="탕";
			}
			for(int j=0;j<30;j=j+count) {
				System.out.println(j+1+sound);
			}
			System.out.println("탄창 소비");
		}
		
		
		
		
		System.out.println("프로그램 종료");
	}

}
