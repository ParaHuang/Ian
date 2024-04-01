package day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
	
		String[] ary = {"Jack","Tom","Alex","Jane","Frank","David","Daniel","Mike","Jhon","Alice"};
		//11,22,33,11,22,44,55,44,66
		//11,22,33,11,22,44,55,44,66	-- list
		//11,22,33,44,55,66				-- set
//		HashSet<Integer> set = new HashSet<Integer>();
//		set.add(11);
//		set.add(22);
//		set.add(88);
//		set.add(22);//set doesn't save duplicate values
		
//		System.out.println(set.size());
		
		// get a random person, write it on the paper if it doesn't exist before
		HashSet<String> names = new HashSet<String>();
		while(names.size()<5) {
			int x = (int)(Math.random()*10);
//			System.out.println(ary[x]);
			names.add(ary[x]);
		}
		System.out.println(names);
		
//		System.out.println(names.contains("Jack"));
		
		//set doesn't have index
		for(String n:names) {
			System.out.println(n);
		}
	}

}








