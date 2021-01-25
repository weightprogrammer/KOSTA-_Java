package kosta_basic;

import java.util.Scanner;

public class Loop_ex {

	public static void main(String[] args) {
	// while :초기식 -> 조건식 -> 명령문 -> 증감자 : 수직방향구조
		
	// for : 초기식 -> 조건식 -> 명령문 -> 증감자 :수평구조
		
	//do ~ while : 명령을 먼저 실행 조건을 비교
		
	//적어도 1번은 무조건 실행이 필요한 경우
		
		
	//구구단 7단 출력
	//ex 7 *1 =7
		
	//1 ~100 사이에 2의 배수 및 3의 배수가 아닌 숫자만 출력하세요.
		
		
//		for(int i =1;i<=100;i++) {
//			if(i%2==0||i%3==0) {
//				continue;
//			}
//		}
//	}
//}
		
		int sum = 0;
		int num = 0;
	    Scanner scanner = new Scanner(System.in);
        System.out.print("결과값: ");
        num = scanner.nextInt();
        
        for(int i= 0; i< num ; i++) {
        	if((i%2)==0) {
        		continue;
        	}else if((i%3)== 0) {
        		continue;
        	}else {
        		System.out.println(i + "");
        		sum +=1;
        	}
        }
	}
}
//	}
//}
//		for(int i= 1; i<=100;i++) {
//			if(!(i%2==0||i%3==0)) {
//				System.out.println(i +",");
//			}
//		}
//		
//	}
//}
		
//		int sum = 0;
//		     //초기식            //조건식
//		for(int i=1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println("1 ~10까지 합은" + sum);
		
//		int sum =0;
//		for(int i=1; i<=9; i++) {
//			System.out.println("7 *"+ i +"=" +7*i);
//		}
		
//		System.out.println("7단");
//		int sum =0;
//		//초기식 어디서 부터 어디까지 쓰는지
//		int i =1;
//		//조건식 어떤 조건을 걸건지
//		while(i <= 10) {
//			
//			sum += i;
//			//증감자 
//			i++;
//		}
//      명령문 어떤 명령을 내릴건지
//		System.out.println("1 ~10까지 합은" + sum);


