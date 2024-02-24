package day7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		//wrapper class
		//primitive type            Wrapper class
		//int						Integer
		//double					Double
		
		
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add("hello");   //wrong
//		list.add(12);
//		
		Integer[] ary1 = {15,7,10,12,54,73,8};
		Integer[] ary2 = {7, 8, 10, 12, 15, 54, 73};
		
//		for(int i=0 ; i<ary.length ; i++) {
//			System.out.println(ary[i]);
//		}
//		System.out.println(Arrays.toString(ary));
		
		//sorting
//		Arrays -- a tool for array
//		compare with positions    ascending
		/*
		for(int i=0 ; i<ary.length-1 ; i++) {
			for(int j=i+1; j<ary.length ; j++) {
				if(ary[i]>ary[j]) {
					int temp = ary[i];
					ary[i] = ary[j];
					ary[j] = temp;
				}
			}
		}		
		*/
		Arrays.sort(ary1);
		System.out.println(Arrays.toString(ary1));
//		15,7,10,12,54,73,8
//		7,15
//		7,15,10,12,54,73,8
		
//		for(int j=1 ; j<ary.length ; j++) {
//			if(ary[0]>ary[j]) {
//				int temp = ary[0];
//				ary[0] = ary[j];
//				ary[j] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(ary));
//		
//		for(int j=2 ; j<ary.length ; j++) {
//			if(ary[1]>ary[j]) {
//				int temp = ary[1];
//				ary[1] = ary[j];
//				ary[j] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(ary));
		
		//binarySearch(a sorted array)
		//return you the position
		//1.if this element exist, then return the real position
		//2.if not,return -(position+1) , position: if this element exist, then where it suppose to be
//		int position = Arrays.binarySearch(which array, which value)
		int position1 = Arrays.binarySearch(ary1, 15);
		System.out.println("element:15,index:"+position1);
		
		int position2 = Arrays.binarySearch(ary1, -3);
		System.out.println("element:-3,index:"+position2);
		
		int position3 = Arrays.binarySearch(ary1, 30);
		System.out.println("element:30,index:"+position3);
		
		int position4 = Arrays.binarySearch(ary1, 300);
		System.out.println("element:300,index:"+position4);
		
		int position5 = Arrays.binarySearch(ary1, 500);
		System.out.println("element:500,index:"+position5);
		
		//to see if two array has same elements
		System.out.println(Arrays.toString(ary2));
		//equals is used to compare two object to see if they are the same (compare memory address)
		System.out.println(ary1.equals(ary2));
		//deepEquals can only compare Object array
		System.out.println(Arrays.deepEquals(ary1, ary2));
		
		//copy Array
	}

}

















