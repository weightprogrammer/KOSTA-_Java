package kosta_basic;

import java.util.Arrays;

public class Arr2_ex01 {

	public static void main(String[] args) {
		int arr[][];;// 2차원 배열 선원 배열을 가르킬수 잇는 변수가 생성 
		arr =new int[3][2]; //변수를 지정 arr[0][0]
		
		//1 차원 배열의 크기를 상이하게 생성
		int arr2[][] = new int[3][];
		arr2[0] = new int [2];
		arr2[1] = new int [3];
		arr2[2] = new int [4];
		
		//2차원 배열 선언하고 생성하면서 초기화 까지 하는방법
		int arr3[][] = {{1,2},{3,4,5},{6,7,8,9}};
		//2 차원 배열은 중첩 for문을 사용해서 코드를 짠다.
//		for(int i=0;i<arr3.length;i++) {
//			arr3 = new int [4][3];
//			
//			System.out.println(i);
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				System.out.println("arr3["+ i+ "]["+j+"]=" + arr3[i][j]);
			}
			
		}
		//배열 복사  하는이유? 배열에 크기는 변경이 불가능 하기 때문에
		String oldArr[]= new String[3];
		oldArr[0]= "10";
		oldArr[1]= "20";
		
		String newArr[] = new String[2];
		
		System.arraycopy(oldArr, 0,newArr,0,newArr.length);	
		System.out.println(Arrays.toString(newArr));
		int num = Integer.parseInt(oldArr[2]);
		System.out.println(num);
	}

}
