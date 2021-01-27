package kosta.bank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//3개의 클래스를 만들어라
public class BankSystem {
	private MyBank myBank;
	
	public BankSystem() {
		myBank = new MyBank();
		showMenu();
	}
	
	public void showMenu() {
		String menu = null;
		String id = null;
		String name = null;
		long balance = 0;
		
		do {
			
			System.out.println("****메뉴를 입력하세요****");
			System.out.println("1. 고객등록");
			System.out.println("2. 고객보기");
			System.out.println("3. 고객전체보기");
			System.out.println("4. 고객예금출금");
			System.out.println("5. 고객예금입금");
			System.out.println("****끝내기****");
			System.out.println("********************");
			System.out.print(">>");
			
			menu = readFromKeyboard();
			
			if(menu.equals("1")) {
				System.out.print("id 를 입력하세요");
				id = readFromKeyboard();
				
				System.out.print("이름 를 입력하세요");
				name = readFromKeyboard();
				
				System.out.print("잔고 를 입력하세요");
				balance = Long.parseLong(readFromKeyboard());
				
				myBank.addCustomer(id, name, balance);
			}
			else if(menu.equals("2")) {
				System.out.print("고객 id 를 입력하세요:");
				id= readFromKeyboard();
				Customer cust = myBank.getCustomer(id);
				System.out.println(cust.getId() + ":" +cust.getName() + ":" + cust.getAccount() .getBalance()); 
			}
			else if(menu.equals("3")) {
				Customer[] allCust = myBank.getAllCustomers();
				
				for(int i =0; i<allCust.length;i++) {
					System.out.println(allCust[i].getId()+ ":" + allCust[i].getName() + ":"+ allCust[i].getAccount().getBalance()); 
				}
			}
			else if(menu.equals("4")) {
				
				System.out.print("고객의 Id를 입력하세요 :");
				id =readFromKeyboard();
				
				Customer cust = myBank.getCustomer(id);
				
				if(cust == null) {
					System.out.println("등록된 고객이 아닙니다.");
				}else {
					System.out.print("출금액을 입력하세요:");
					balance =Long.parseLong(readFromKeyboard());
					
					if(cust.getAccount().withdraw(balance)) {
						System.out.println("정상적으로 출금되었습니다.");
						System.out.println("출금후 잔고는 :" + cust.getAccount().getBalance());
					}else {
						System.out.println("잔고가 부족합니다.");
					}
				}
			}
		}while(!menu.equals("q"));
	}

	private String readFromKeyboard() {
		String input =null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		return input;
	}
	public static void main (String[] args) {
		BankSystem bank = new BankSystem();
	}
}










