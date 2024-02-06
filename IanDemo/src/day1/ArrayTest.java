package day1;
public class ArrayTest {

	public static void main(String[] args) {
		/*
		int[] ary = {11,22,33,55,66,77};
		//index:0~5
		//for loop to operator array element together
		for(int i=0 ; i<ary.length ; i++) {//index is important
			System.out.println(ary[i]);
		}
		//for-each
		for(int e:ary) {
			System.out.println(e);
		}
		*/
		
		int[][] ary = new int[3][4];
		ary[0][0] = 11;
		ary[0][1] = 12;
		ary[0][2] = 13;
		ary[0][3] = 14;
		
		ary[1][0] = 21;
		ary[1][1] = 22;
		ary[1][2] = 23;
		ary[1][3] = 24;
		
		ary[2][0] = 31;
		ary[2][1] = 32;
		ary[2][2] = 33;
		ary[2][3] = 34;

//		System.out.println(ary[0][0]);
//		System.out.println(ary[0][1]);
//		System.out.println(ary[0][2]);
//		System.out.println(ary[0][3]);
		
//		System.out.println(ary[1][0]);
//		System.out.println(ary[1][1]);
//		System.out.println(ary[1][2]);
//		System.out.println(ary[1][3]);
		
//		System.out.println(ary[2][0]);
//		System.out.println(ary[2][1]);
//		System.out.println(ary[2][2]);
//		System.out.println(ary[2][3]);
		
		
		
		for(int i=0 ; i<ary.length ; i++) {
			for(int j=0 ; j<ary[i].length ; j++) {
				System.out.print(ary[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}

