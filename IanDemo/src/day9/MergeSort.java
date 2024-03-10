package day9;

import java.util.Arrays;

public class MergeSort {

	//SelectionSrot: pick the minimal value
	public static void main(String[] args) {
		int[] ary = {8, 4, 5, 7, 1, 3, 6, 2};
		sort(ary);
		//see every element of ary
		System.out.println(Arrays.toString(ary));
	}
	
	//sort
	public static void sort(int[] ary) {
		//Separate them into two array
		if(ary.length<=1) {
			return;
		}
		int[] first = new int[ary.length/2];//1
		int[] second = new int[ary.length-first.length];//1
		for(int i=0 ; i<first.length ; i++) {
			first[i] = ary[i];
		}
		for(int i=0 ; i<second.length ; i++) {
			second[i] = ary[first.length+i];
		}
		
		sort(first);	//recursion   //
		sort(second);
//		System.out.println(Arrays.toString(first));
//		System.out.println(Arrays.toString(second));
		
		merge(first,second,ary);

//		System.out.println(Arrays.toString(ary));
	}
	
	public static void merge(int[] first,int[]second,int[] ary) {
		int firstI = 0;
		int secondI = 0;
		int j = 0;	//for ary
		while(firstI<first.length && secondI<second.length) {
			if(first[firstI]<second[secondI]) {
				ary[j] = first[firstI];
				firstI++;
			}else {
				ary[j] = second[secondI];
				secondI++;
			}
			j++;
		}
		
		//when the loop above finished, but we might not finish sorting
		//one array might still have elements left, they are not saved into ary yet
		//we need to put them into ary one by one
		while(firstI<first.length) {
			ary[j] = first[firstI];
			j++;
			firstI++;
		}
		while(secondI<second.length) {
			ary[j] = second[secondI];
			j++;
			secondI++;
		}
	}
}













