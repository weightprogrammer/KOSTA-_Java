package kosta_basic;

public class Method_ex02 {
	

	public static void main(String[] args) {
		//메서드를 이용하여 두배열의 개수와 내용이 일치하는지 체크
		int num1[] = {1,2,3,4,5};
		int num2[] = {1,2,3,4,5};
	
		if(equals(num1,num2)) {
			System.out.println("일치");
		}else {
			System.out.println("불일치");
		}
		//메서드 이름
	}

	private static boolean equals(int[] num1, int[] num2) {
		if(num1.length != num2.length) {
			return false;
		}
		for(int i=0;i<num1.length;i++) {
			if(num1[i] != num2[i]) {
				return false;
			}
		}
		return true;
	}
}