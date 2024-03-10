package day9;

import java.util.Arrays;

public class SelectionSort {

	//SelectionSrot: pick the minimal value
	public static void main(String[] args) {
		int[] ary = {12,78,45,32,90,11,102,64};
		sort(ary);
		//see every element of ary
		System.out.println(Arrays.toString(ary));
	}
	
	//sort
	public static void sort(int[] ary) {
		for(int i=0 ; i<ary.length ; i++) {
			//find the position of the minimal element
			int minPosition = i;
			int minElement = ary[i];
			for(int j=i+1 ; j<ary.length ; j++) {
				if(minElement>ary[j]) {
					minElement = ary[j];
					minPosition = j;
				}
			}
			//swap it with the present element
			int temp = ary[i];
			ary[i] = ary[minPosition];
			ary[minPosition] = temp;

//			System.out.println(i+"   "+minPosition+"   "+minElement+"   "+Arrays.toString(ary));
		}
	}
}

