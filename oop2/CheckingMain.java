package kosta.oop2;

public class CheckingMain {

	public static void main(String[] args) {
		
		CheckingAccount ca = new CheckingAccount("222-222", "ȫ�浿", 3000, "222-222");
		
		
		try {
		ca.pay("222-222", 500);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		ca.print();
	}

}
