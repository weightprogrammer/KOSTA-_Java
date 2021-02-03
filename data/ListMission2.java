package kosta.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ListMission2 {
	public static void main(String[] args) {
		//1. 배열
		Random r = new Random();
//		int arr[] = new int [6];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = r.nextInt(45) + 1;
//			for(int j =0;j<i;) {
//				if(arr[i] == arr[j]) {
//					i = i-1;
//				}
//			}
//		
//		}
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		//2. List
		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		while(true) {
//			int n = r.nextInt(45)+1;
//			if(list.contains(n)) {
//				continue;
//			}else {
//				list.add(n);
//			}
//			if(list.size() == 6) break;
//		}
//		
//		for(int n : list) {
//			System.out.print(n + ", ");
//		}
		
		//3. set
		
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;set.size()<6;i++) {
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//45개의 공을 만든다
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		for(int i = 1; i <= 45; i++) {
//			numbers.add(i); // 1~45
//		}
//		//섞는다
//		Collections.shuffle(numbers);
//		//뽑는다
//		int[] picked = new int[6];
//		for (int i = 0; i < 6; i++) { //numbers의 앞 6개 숫자를 가져옴
//			picked[i] = numbers.get(i);
//		}
//		//결과출력
//		System.out.printf("자동 생성 번호: %s", Arrays.toString(picked));
	}										//배열을 이쁘게 문자열로 바꿔주는 메소드
	
}
