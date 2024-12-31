package com.winter.app.study2.object2;

import java.util.Scanner;

public class SchoolMateFactory {
	
	
	//make
	//SchoolMate 객체 생성
	//모든 정보를 입력받아서 대입
	public SchoolMate make() {
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
		
		return schoolMate;
	}

}
