package day8;

public class Main2 {

	public static void main(String[] args) {
		//deepEquals: to see if 2 arrays have identical elements
		//		two objective type array

		int[][] ary1 = {
				{11,12,13,14},   			//i=0
				{21,22,23,24},				//i=1
				{31,32,33,34}				//i=2
		};// j   0  1  2  3
		
		//check all the value 
		//foreach
//		for(int[] ary:ary1) {
//			for(int e:ary) {
//				System.out.print(e+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("---------------");
		
//		for(int i=0 ; i<ary1.length; i++) {
//			for(int j=0 ; j<ary1[i].length ; j++) {
//				System.out.print(ary1[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
		
		int[][] ary2 = {
				{11,12,13,14},
				{21,22,23,24},
				{31,32,33,34}
		};
		
		System.out.println(deepEquals(ary1, ary2));
	}
	
	public static boolean deepEquals(int[][] ary1,int[][] ary2) {
		//if two arrays are not in the same length, they are not identical
		if(ary1.length != ary2.length) {
			return false;
		}
		
		for(int i=0 ; i<ary1.length ; i++) {//i->row
			//when we are trying to compare the inside 1D array, they might be not in the same length
			//if the 1D array in the same row don't have the same length,then they are not identical
//			if(the length of 1D array of ary1 != the length of 1D array of ary2) {
			if(ary1[i].length != ary2[i].length) {
				return false;
			}
			for(int j=0 ; j<ary1[i].length ; j++) {//j->column
				if(ary1[i][j]!=ary2[i][j]) {
					return false;
				}
			}
		}
		
		return true;//identical
	}

}










