package kosta.oop;

public class Rectangle {
	//가로, 세로 길이 구해서 면적을 구하는 프로그램만들어보자
	//상태:
	
	int w; //0을 할 필요가 없고 이미 초기화 상태
	int h;
	int e;
	//행동(기능): 면적 구하기
	public Rectangle() {}
	
	
	
	public Rectangle(int w, int h) {
		super();
		this.w = w;
		this.h = h;
	}



	public void area() {
		 e = w*h;
	}
	
	public void print () {
		System.out.println("두합 의 면적는=" + e);
		
	}
	
	
}
