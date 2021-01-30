package kosta.studnt;

import java.util.Scanner;

public class StudentInfo extends Student_Idcard {

	// 학생 이름, 학번, 점수는 슈퍼클래스에서 상속

	char grade[] = new char[4]; // 학점 배열

	int total, average; // 총점, 평균



	StudentInfo(String name, String studentNo, int score[]) {

		super(name, studentNo, score); // 슈퍼클래스의 생성자 상속

	}

	StudentInfo(String name, String studentNo) {

		super(name, studentNo); // 슈퍼클래스의 생성자 상속

	}



	void input() { // 국어점수, 수학점수 입력 메소드

		Scanner in = new Scanner(System.in);

		System.out.printf("국어점수:");

		score[0] = in.nextInt();

		System.out.printf("수학점수:");

		score[1] = in.nextInt();

		System.out.printf("영어점수:");

		score[2] = in.nextInt();

		System.out.printf("과학점수:");

		score[3] = in.nextInt();

	}

//	void Getgrade() {	 // 학점 계산 메소드
//
//		for(int i=0;i<score.length;i++) {
//
//		if( score[i] >= 90 ) grade[i] = 'A';
//
//		else if( score[i] >= 80 ) grade[i] = 'B';
//
//		else if( score[i] >= 70 ) grade[i] = 'C';
//
//		else if( score[i] >= 60 ) grade[i] = 'D';
//
//		else grade[i] = 'F';
//
//		// if의 결과로 배열변수가 사라지지 않으므로 return 값은 없어도 됨
//
//		}		
//
//	}

	

	int getTotal() { // 총점 계산 메소드

		for (int i = 0; i < score.length; i++)

			total += score[i];

		return total;

	}

	int getAverage() { // 평균 계산 메소드

		average = total / score.length;

		return average;

	}



	void prn() { // 출력 메소드

//		Getgrade(); // 메소드는 이렇게 호출해주지 않으면 작동 안함!!

		getTotal(); 

		getAverage();

		System.out.println("이름:" + name);

		System.out.println("학번:" + studentNo);

		System.out.println("국어점수:" + score[0] );

		System.out.println("수학점수:" + score[1] );

		System.out.println("영어점수:" + score[1] );

		System.out.println("과학점수:" + score[1] );

		System.out.println("총점:" + total + " 평균=" + average);

	}

}




