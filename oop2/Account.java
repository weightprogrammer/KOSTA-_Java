package kosta.oop2;

public class Account {

	//공통된 데이터 구조 (상태=> 변수)
	//계좌번호,계좌주,잔액: 상태(특성 => 멤버 변수(필드)
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public Account() {}
	
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}


												//메소드 만들때 중요성 : 1. 리턴값이 필요한가? 2. 파라미터가 뭐가 있는지?
	//공통된 기능 :행동(기능) = > 멤버 메서드 (오퍼레이션)
	//입금,출금 ,계과정보 출력
	public void deposit(int amount) {
		balance += amount;
	}
	public int withdraw(int amount) {
		if (balance < amount) {
			return 0 ;
		}
		balance -= amount;
		
		return amount;
	}
	
	
	public void print () {
		System.out.println("계좌번호 " + accountNo);
		System.out.println("계좌주 " + ownerName);
		System.out.println("잔액 " + balance);
	}


	public String getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
