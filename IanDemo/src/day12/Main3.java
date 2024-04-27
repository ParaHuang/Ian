package day12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		//insert,remove:    LinkedList
		//query:			ArrayList
		List<Integer> alist = new ArrayList<>();
		List<Integer> llist = new LinkedList<>();
		for(int i=1 ; i<=100000 ; i++) {
			alist.add(i);	
			llist.add(i);
		}
		/*
		//insert
		long t1 = System.currentTimeMillis();
		for(int i=1 ; i<=1000000 ; i++) {
			alist.add(0, i);	//add value i at position 0
		}
		long t2 = System.currentTimeMillis();
		System.out.println("insert in alist:"+(t2-t1));
		

		long t3 = System.currentTimeMillis();
		for(int i=1 ; i<=1000000 ; i++) {
			llist.add(0, i);	//add value i at position 0
		}
		long t4 = System.currentTimeMillis();
		System.out.println("insert in llist:"+(t4-t3));
		*/
		/*
		//remove
		long t1 = System.currentTimeMillis();
		for(int i=1 ; i<=100000 ; i++) {
			alist.remove(0);	//remove value from position 0
		}
		long t2 = System.currentTimeMillis();
		System.out.println("remove in alist:"+(t2-t1));
		

		long t3 = System.currentTimeMillis();
		for(int i=1 ; i<=100000 ; i++) {
			llist.remove(0);	
		}
		long t4 = System.currentTimeMillis();
		System.out.println("remove in llist:"+(t4-t3));
		*/
		
		//get
		long t1 = System.currentTimeMillis();
		for(int i=0 ; i<100000 ; i++) {
			alist.get(i);	//get value
		}
		long t2 = System.currentTimeMillis();
		System.out.println("get in alist:"+(t2-t1));
		

		long t3 = System.currentTimeMillis();
		for(int i=0 ; i<100000 ; i++) {
			llist.get(i);	
		}
		long t4 = System.currentTimeMillis();
		System.out.println("get in llist:"+(t4-t3));
		
	}

}












