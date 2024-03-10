package day10;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] ary = {10,8, 4, 5, 7,9, 1, 3, 6, 2};
		sort(ary);
		System.out.println(Arrays.toString(ary));
	}
	
	public static void sort(int[] ary) {
		
		for(int i=0 ; i<ary.length-1 ; i++) {
			for(int j=0 ; j<ary.length-1-i ; j++) {
				if(ary[j]>ary[j+1]) {
					int temp = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = temp;
				}
			}
//			System.out.println(Arrays.toString(ary));
		}
//		System.out.println();
		/*
		//===================
		//round 1:
		for(int j=0 ; j<ary.length-1-0 ; j++) {
			if(ary[j]>ary[j+1]) {
				int temp = ary[j];
				ary[j] = ary[j+1];
				ary[j+1] = temp;
			}
		}
		//round 2:
		for(int j=0 ; j<ary.length-1-1 ; j++) {
			if(ary[j]>ary[j+1]) {
				int temp = ary[j];
				ary[j] = ary[j+1];
				ary[j+1] = temp;
			}
		}
		//round 3:
		for(int j=0 ; j<ary.length-1-2 ; j++) {
			if(ary[j]>ary[j+1]) {
				int temp = ary[j];
				ary[j] = ary[j+1];
				ary[j+1] = temp;
			}
		}
		//round 4:
		for(int j=0 ; j<ary.length-1-3 ; j++) {
			if(ary[j]>ary[j+1]) {
				int temp = ary[j];
				ary[j] = ary[j+1];
				ary[j+1] = temp;
			}
		}
		//round 5:
		for(int j=0 ; j<ary.length-1-4 ; j++) {
			if(ary[j]>ary[j+1]) {
				int temp = ary[j];
				ary[j] = ary[j+1];
				ary[j+1] = temp;
			}
		}
		//round 6:
		for(int j=0 ; j<ary.length-1-5 ; j++) {
			if(ary[j]>ary[j+1]) {
				int temp = ary[j];
				ary[j] = ary[j+1];
				ary[j+1] = temp;
			}
		}
		//round 7:
		for(int j=0 ; j<ary.length-1-6 ; j++) {
			if(ary[j]>ary[j+1]) {
				int temp = ary[j];
				ary[j] = ary[j+1];
				ary[j+1] = temp;
			}
		}
		*/
	}
}










