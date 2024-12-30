package com.winter.app.study1.array;

import java.util.Scanner;

public class ArrayStudy2 {

	public static void main(String[] args) {
		//한반에서 국어시험 의 결과를 저장
		//학생 수는 N명
		//학생 수를 입력 받아서 시작
		//국어의 총점과 평균을 계산
		//30, 50, 60, 40
		//180, 45
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수 입력");
		int count=sc.nextInt();//4
		
		
		int [] kors = new int [count];
		int idx=0;
		for(int i=0;i<kors.length;i++) {
			
			kors[i]=sc.nextInt();

		}
		
		int total = 0;
		
		for(int i=0;i<kors.length;i++) {
			total=total+kors[i];
		}
		
		double avg = total/kors.length*1.0;
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		
		for(int i=0;i<kors.length;i++) {
			System.out.println(kors[i]);
		}
		

	}

}
