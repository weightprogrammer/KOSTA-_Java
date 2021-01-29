package kosta.oop;

public class Book {
	//상태 : 책이름, 정가, 할인된 가격
	//기능: 할인가격 산출, 책에 대한 정보 출력
	String bkn;
	int sail;
	int dc;
	
	public Book () {}

	public Book(String bkn, int sail) {
		super();
		this.bkn = bkn;
		this.sail = sail;
	}
	public void discount() {
		if(sail >= 30000) {
			dc = (int)(sail*0.75); //int형으로 형변환
		}else if(sail >= 25000) {
			dc = (int)(sail*0.80);
		}else if(sail >= 15000){
			dc = (int)(sail*0.85);
		}
	}
	public void print() {
		System.out.println(bkn + "의 정가는 " + sail + "할인된 가격은 " + dc +"원 입니다.");
	}
	
	
}

	
