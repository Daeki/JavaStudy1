package com.winter.app.study2.object1;

public class ObjectMain2 {
	
	
	public static void main(String[] args) {
		Student st = new Student();
		//멤버변수 사용
		//참조변수명.멤버변수명
		
		//멤버메서드 사용(메서드를 호출)
		//참조변수명.멤버메서드명([인자값])
		int n=5;
		st.info('1', 1.2);
		
		st.info(n, 3.2);
		
		st.print();
		st.name="iu";
		st.num=1;
		
		Student student = new Student();
		student.name="winter";
		student.num=2;
		
		StudentView studentView = new StudentView();
		studentView.view(st);
		studentView.view(student);
		

		
		
	}

}
