package kosta.Thread;









public class TVContribution {

	public static void main(String args[]) throws Exception {

		int count = 0;

		Account same_account = new Account();

		Customer2 donator1 = new Customer2(same_account, "1번째 성금자");

		Customer2 donator2 = new Customer2(same_account, "2번째 성금자");

		Customer2 donator3 = new Customer2(same_account, "3번째 성금자");

		Customer2 donator4 = new Customer2(same_account, "4번째 성금자");

		Customer2 donator5 = new Customer2(same_account, "5번째 성금자");



		donator1.start();

		donator2.start();

		donator3.start();

		donator4.start();

		donator5.start();

		donator1.join();

		donator2.join();

		donator3.join();

		donator4.join();

		donator5.join();

		System.out.println("성금 총액은 : " + same_account.gettotal());

	}

}



