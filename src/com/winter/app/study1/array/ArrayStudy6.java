package com.winter.app.study1.array;

import java.util.Scanner;

public class ArrayStudy6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		//학생수를 입력 받음
		System.out.println("학생 수 입력");
		int count= sc.nextInt();
		//학생 수 만큼 학생이름 입력 받고, 출력
		
		
		String [] names = new String [count];
		int [] kors = new int [names.length];
		int [] maths = new int [names.length];
		int [] totals = new int [names.length];
		
		for(int i=0;i<names.length;i++) {
			System.out.println(i+1+ "번째 학생 이름 입력");
			names[i]=sc.next();
		}
		//학생수 만큼 국어 점수 입력
		//입력한 이름의 국어 점수 입력, 수학 점수 입력
		for(int i=0;i<kors.length;i++) {
			System.out.println(names[i]+" 의 국어 점수 입력");
			kors[i]=sc.nextInt();
			System.out.println(names[i]+" 의 수학 점수 입력");
			maths[i]=sc.nextInt();
			totals[i]=kors[i]+maths[i];
		}
		
		//------------------------------------------------
		//총점 기준으로 내림차순 정렬
		
		
		
		
		
		//--------------------------------
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i] +" : "+kors[i]+ " : "+maths[i]+" : "+totals[i]);
		}

	}

}
