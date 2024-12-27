package com.winter.app.controls;

public class StudyLoop1 {
	/**
	 * 반복작업
	 * 1. for  2. while
	 * 
	 * 1. for ~동안
	 * 	  for(초기식;조건식;증감식){
	 * 		조건식이 true일때 실행 
	 * 	  }
	 * 
	 * 	 1) 초기식 진행
	 *   2) 조건식 진행
	 *   	 true라면 {} 실행
	 *   		증감식 실행
	 *   		조건식 진행
	 *   
	 *   	 false라면 for문 종료 
	 * 
	 * */
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		for(int i=0;i<10;i++) {
			//0-9 짝수만 출력
			if(i%2==0) {
				System.out.println(i+"hello");
			}
			
			
		}
		
		for(int i=0;i<10;i=i+1) {
			System.out.println(i);
		}
		
		int count=5;
		//누적함수
		// 0+1+2+3+4+5=> 15
		// sum=sum+?
		int sum=0;
		for(int i=1;i<count;i++) {
			sum=sum+i;
		}
		
		System.out.println("프로그램 종료");
	}

}
