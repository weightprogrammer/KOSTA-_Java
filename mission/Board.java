package kosta.mission;

public class Board {
	//게시판에 여러개의 글을 입력 받고 전체를 출력하는 프로그램을 구현하자(생성자 기반)
	//글번호, 글제목, 내용
	//출력은 글쓰기, 전체 글 출력
	
	int tnum;
	String tName;
	String tStory;
	String contents;
	
	public Board() {}

	public Board(int tnum, String tName, String tStory ,String contents) {
		super();
		this.tnum = tnum;
		this.tName = tName;
		this.tStory = tStory;
		this.contents =contents;
	}
	//기능을 넣어야한다. 예 1/ 나는 그렇다. / 나는 프로그래밍을 한다.
	
	public void boardPrint() {
		System.out.println(tnum + "\t" + tName + "\t" +tStory+"\t"+contents);
	}
	
}
