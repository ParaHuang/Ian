package day13;

import java.util.Vector;

//Vector,Stack,Queue
public class Main1 {

	public static void main(String[] args) {
//		Vector
//		ArrayList
		
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(11);
		vector.add(22);
		
		System.out.println(vector);
		
		for(int i=0 ; i<vector.size() ; i++) {
			System.out.println(vector.get(i));
		}
		
		vector.removeElement(11);
		System.out.println(vector);
		
	}

}

