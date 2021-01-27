package kosta.phone;

import java.util.Scanner;

public class Manager {
	

	//Scanner sc =new Scanner(System.in);
	int count = 0;
	
	PhoneInfo arr[];
	
	public Manager() {
		arr = new PhoneInfo[10];
	}
	
	public void addPhoneInfo()throws Exception {
		//이름, 전화번호, 생년월일 입력
		System.out.print("이름을 입력 하세요 :");
		String name = DateInput.sc.nextLine();
		System.out.print("핸드폰 번호를 입력하세요");
		String phoneNum = DateInput.sc.nextLine();
		System.out.print("생년월일을 입력하세요");
		String birth =DateInput.sc.nextLine();
		
		if(phoneNum ==null || phoneNum.length()==0) {
			throw new Exception("반드시 전화번호 입력하세요");
		}
		
		arr[count++] = new PhoneInfo(name, phoneNum, birth);
		//PhoneInfo객체생성 => 배열추가
	}
	
	public void listPhoneInfo() {
		//배열에 있는 PhoneInfo객체 모두를 출력
		for (int i =0; i<count; i++) {
			arr[i].show();
		}
	}
	
	public void searchPhoneInfo() {
		//키보드로 부터 이름 입력 받아
		System.out.println("검색할 학생의 이름 : ");
		String name =DateInput.sc.nextLine();
		int index = -1;
		// 해당 PhoneInfo 객체만 출력
		for (int i=0; i<=count - 1; i += 1 ) {
			if(name.equals(arr[i].name)) {
				index =i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("존재하지 않습니다.");
		}else {
			arr[index].show();
		}
	}
	//변경
	public void change() {
		System.out.println("검색할 이름 :");
		String name = DateInput.sc.nextLine();
		int index = -1;
		
		for(int i=0; i<= count -1; i+= 1) {
			if((arr[i].name).equals(name)) {
				index = i;
				System.out.println("변경할 번호 : ");
				String phoneNum = DateInput.sc.nextLine();
				arr[index].phoneNum = phoneNum;
				
				break;
			}
		}
		if (index == -1) {
			System.out.println("대상을 찾지 못했습니다.");
		}else {
			System.out.println("수정 완료");
		}
	}
	//삭제
	public void delete() {
		System.out.println("검색할 이름 : ");
		String name =DateInput.sc.nextLine();
		int index = -1;
		
		for (int i=0; i<=count -1; i+=1) {
			if((arr[i].name).equals(name)) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			for(int i =index; i < count; i +=1) {
				if (i !=arr.length) {
					arr[i] =arr[i + 1];
				}
			}
			arr[count -1] = null;
			count --;
		}else {
			System.out.println("찾을수 없습니다.");
		}
	}
}
