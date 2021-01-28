package Day7;

public class VdieoMain {

	public static void main(String[] args) {
		GeneralMember gm = new GeneralMember("1", "홍길동","가산동");
		Video v1 = new Video("01","기생충","송강호");
		
		gm.rentalService(v1);
		
		System.out.println("빌린비디오 제목: " + gm.getRentalVideo().getTitle());

	}

}
