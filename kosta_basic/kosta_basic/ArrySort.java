package kosta_basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArrySort {

	public static void main(String[] args) {
		int arr[] = {3,2,5};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//내림차순  = >5 3 2
//		for(int i =0; i>arr.length;i++) {
//			System.out.print(arr[(arr.length-1-i)] + ",");
//		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i] + ",");	
		}
		System.out.println();
		
		
		int arr2[][] = {{2,90},{1,60},{3,20}};
		
		Arrays.sort(arr2, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]< o2[0]) {
					return 1;
				}else if(o1[0]>o2[0]) {
					return -1;
				}else {
					return 0;
				}
			}
		});
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr2[i][j] + ",");
			}
			System.out.println();
		}
	}

}
