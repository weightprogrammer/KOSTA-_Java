package kosta.studnt;


public class Student_Idcard {   

	String name;// 이름

	String studentNo; //학번	

	int score[] = new int[4]; // 점수 배열	

	

	Student_Idcard(String name, String studentNo, int score[]){ // 생성자

	this.name = name;

	this.studentNo = studentNo;

	this.score= score;

	}	



	Student_Idcard(String name, String studentNo){ 

	// testExample1에서 점수는 input으로 받으므로 2개만 불러들일 생성자

	this.name = name;

	this.studentNo = studentNo;	

	}	

}






