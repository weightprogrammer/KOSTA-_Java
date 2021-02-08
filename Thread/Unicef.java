package kosta.Thread;

class Account {

	private int total = 0;



	synchronized void deposit() {

		total = total + 1000;

	}



	int gettotal() {

		return total;

	}

}
