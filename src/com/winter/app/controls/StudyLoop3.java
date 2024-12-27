package com.winter.app.controls;

public class StudyLoop3 {
	/**
	 * 반복문 내에서 사용하는 보조문
	 * 1. break
	 * 그 즉시 반복문을 벗어나라(종료)
	 * 
	 * 2. continue
	 * 1) for   -> 그 즉시 증감식으로 이동
	 * 2) while -> 그 즉시 조건식으로 이동 
	 * */
	
	public static void main(String[] args) {
		int count=3;
		for(int i=0;i<10;i++) {
			
			if(i%2==1) {
				continue;
				
			}
			System.out.println(i);
			
			
			
			if(count==i) {
				i=10;
				break;
				
			}
			
		}
		
		
	}

}
