package day8;

public class Main1 {

	public static void main(String[] args) {
		//deepEquals: to see if 2 arrays have identical elements
		//		two objective type array

		int[] ary1 = {11,22,33,44,55,66};
		int[] ary2 = {11,22,33,44,55};
		System.out.println(deepEquals(ary1, ary2));
	}
	
	public static boolean deepEquals(int[] ary1,int[] ary2) {
		//if two arrays are not in the same length, we should return false directly
		if(ary1.length != ary2.length) {
			return false;
		}
		for(int i=0 ; i<ary1.length ; i++) {
			if(ary1[i] != ary2[i]) {
				//these two arrays are not identical
				return false;
			}
		}
		
		return true;//identical
	}

}

