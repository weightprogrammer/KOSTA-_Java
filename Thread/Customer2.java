package kosta.Thread;

class Customer2 extends Thread {

	Account same_a;



	Customer2(Account a, String s) {

		same_a = a;

		setName(s);

	}



	public void run() {

		for (int i = 0; i < 200; i++) {

			System.out.println(getName() + " : " + i+1 + "번째");

			same_a.deposit();

			if (same_a.gettotal() >= 500000)

				break;



			// 종료 시 5개의 스레드 중에서 가장 우선순위가 높은

			// 스레드가 조건문을 만족하면 (성금이 49만 9000인 경우 deposit() 후에는 50만원이 됨)

			// 나머지 4개의 스레드들도 마찬가지로 조건문을 만족하게 되어 반복문이 종료된다.

			// 결과적으로 후에 출력되는 총 성금은 50만 4000원이 된다.



			// 결과 값이 50만 3000원이 되는 경우는

			// 1번 스레드가 deposit() 메소드를 실행하고 49만 9000이 될 때

			// 정상적으로는 다음 조건문을 통과하게 되지만,

			// 조건문 실행 전에 다른 스레드가 deposit() 메소드를 실행되면

			// 50만원으로 조건문을 만족하게 되어 반복문을 종료하게 되는데

			// 이전에 실행되던 1번 스레드 또한 조건문을 만족하게 되어 종료가 되고

			// 나머지 3개의 스레드가 정상 실행되어 3천원의 성금이 추가되게 된다.



		}

	}

}



