package day12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		/*
		 Collection
		 |
		 List:ArrayList,LinkedList
		 Set:HashSet,TreeSet,LinkedHashSet
		 
		 
		 Map
		 |
		 HashMap,TreeMap,LinkedHashMap	 	 
		 */
//		List<Integer> list = new ArrayList<>();
		List<Integer> list = new LinkedList<>();
		
		//add element
		list.add(11);	//append an element
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(2,3);	//insert an element
		System.out.println(list);
		
		for(int i=0 ; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		for(int x:list) {
			System.out.println(x);
		}
		System.out.println();
		
		list.remove(0);
		System.out.println(list);
//		int index = list.indexOf(33);
//		list.remove(index);	//integer number -> int
		Integer x = 33;
		list.remove((Integer)x);
		
		
		System.out.println(list);
		/*
		 primitive type				wrapper	class
		 short						Short
		 int						Integer
		 long						Long
		 float						Float
		 double						Double
		 char						Character
		 boolean					Boolean
		 byte						Byte
		 */
		
		//auto boxing
		Integer i = 10;
		//auto unboxing
		int i2 = i;
		//"4"   ->   4
		int i3 = Integer.parseInt("1122");
		System.out.println(i3);
		
		double d = Double.parseDouble("3.14");
	}

}












