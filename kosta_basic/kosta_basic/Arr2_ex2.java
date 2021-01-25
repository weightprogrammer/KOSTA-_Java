package kosta_basic;

public class Arr2_ex2 {

	public static void main(String[] args) {
		int [][] score = {
				{100,100,90},
				{80,39,49,29},
				{98,94,28,95,},
				{20,30,40,60}
		};
		int sum = 0;
		
		for(int i =0; i<score.length; i++) {
			for(int j =0; j<score[i].length;j++) {
				System.out.printf("score:[%d][%d]=%d%n", i , j ,score[i][j]);
				
				sum += score[i][j];
			}
		}
		System.out.println("sum=" + sum);
	}

}
