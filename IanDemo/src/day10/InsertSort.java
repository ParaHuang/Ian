package day10;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = {8, 4, 5, 7, 1, 3, 6, 2};
		sort(ary);
		System.out.println(Arrays.toString(ary));
	}
	
	//sort
	public static void sort(int[] ary) {
		for(int i=1 ; i<ary.length ; i++) {
			int key = ary[i];
			//move every element which is greater than key one position bigger
			int j=i-1;
			for(; j>=0 && ary[j]>key ; j--) {
				ary[j+1] = ary[j];
			}
			//after the loop, j will be 
			//-1:0 or   index of element that is less than key->index+1
			ary[j+1] = key;//insert the key
		}
	}

}

