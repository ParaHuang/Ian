package day11;

import java.util.ArrayList;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List - ArrayList,LinkedList,Vector
//		Set - HashSet
//		Map - HashMap
		
		String[] ary = {"Jack","Tom","Alex", "Jane","Frank","David","Daniel","Mike","Jhon","Alice"};
		ArrayList<String> list = new ArrayList<String>();
		for(String s:ary) {
			list.add(s);
		}
		
		for(int i=0 ; i<5 ; i++) {
			int x = (int)Math.random()*list.size();//random  0~9
			String name = list.remove(x);
			System.out.println(name);
		}
	}

}

