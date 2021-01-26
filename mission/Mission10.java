package kosta.mission;

import java.util.Arrays;
import java.util.Comparator;

public class Mission10 {

	public static void main(String[] args) {
		//2차원으로 성적만들어 보자
		//국어,수학,영어 점수 입력 => 총점,평균
		//2명 이상의 성적을 입력 받음 => 2차원 배열
		//국어 영어 수학 총점 평균
		//전체 출력
		
		int[][] score = {{100,80,55},{50,100,90},{40,60,70}};
		
		Arrays.sort(score, new Comparator<int[]>() {

			public int compare(int[] o1, int[] o2) {
				if(o1[0] > o2[0]) {
					return -1;
				}else if(o1[0]<o2[0]) {
					return 1;
				}else {
				return 0;
			}
		}
		});
		for(int i=0; i< score.length;i++) {
			for(int j=0;j<2; j++) {
				System.out.print(score[i][j] + ",");
			}
			System.out.println();
		}
		
		int korTotal = 0 , engTotal =0 , matTotal =0;
		
		System.out.println("번호  국어     영어    수학   총점   평균");
		System.out.println("===========================");
		
		for(int i =0; i< score.length; i++) {
			int sum = 0; //총점에 대한 변수
			float aver = 0.0f; //평균에 대한 변수
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			matTotal += score[i][2];
			System.out.printf("%d" , i+1);
			
			for(int j=0; j< score[i].length;j++) {
				sum += score[i][j];
				System.out.printf("%5d" , score[i][j]);
			}
			
			aver = sum/(float)score[i].length;
			System.out.printf("%5d %5.1f%n", sum , aver);
		}
	}
}