package com.winter.app.study2.object2;

import java.util.Scanner;

public class SchoolMateFactory {
	
	
	//make
	//SchoolMate 객체 생성
	//모든 정보를 입력받아서 대입
	public SchoolMate [] make(SchoolMate [] schoolMates) {
		Scanner sc = new Scanner(System.in);
		SchoolMate schoolMate = new SchoolMate();
		
		System.out.println("이름 입력");
		schoolMate.name=sc.next();
		System.out.println("번호 입력");
		schoolMate.num=sc.nextInt();
		System.out.println("국어 입력");
		schoolMate.kor=sc.nextInt();
		System.out.println("영어 입력");
		schoolMate.eng=sc.nextInt();
		System.out.println("수학 입력");
		schoolMate.math=sc.nextInt();
		schoolMate.total=schoolMate.kor+schoolMate.eng+schoolMate.math;
		schoolMate.avg = schoolMate.total/3.0;
		
		//1. +1 된 새로운 배열 생성
		SchoolMate [] copys = new SchoolMate[schoolMates.length+1];
		
		//2. 기존의 값을 새로운배열로 값을 저장
		for(int i=0;i<schoolMates.length;i++) {
			copys[i]=schoolMates[i];
		}
		
		//3. 마지막 index 새로만든 schoolmate 대입
		copys[schoolMates.length]=schoolMate;
		
		
		return copys;
	}

}
