package com.winter.app.study1.array;

import java.util.Scanner;

public class ArrayStudy1 {

	public static void main(String[] args) {
		//변수 선언 공식 -> 데이터타입 변수명;
		//
		int [] nums = new int [3];
		double [] avgs = new double [3];
		
		//사람이름10000명을 모을 배열 
		String [] names = new String [10000];
		
		

		
		avgs[1]=3.12;
		
		System.out.println(nums[1]);
		System.out.println(avgs[0]);
		
		
//		for(int i=0;i<10000;i++) {
//			System.out.println(names[i]);
//		}
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<nums.length;i++) {
			System.out.println("숫자를 입력하세요");
			nums[i]=sc.nextInt();
		}
		
		//nums를 출력
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		
		

	}

}
