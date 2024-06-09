package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//multiple Threads compete the same resource
//the version shows problem
public class Main4 {

	public static void main(String[] args) {
		Math.random();//0~1
		
		//prizes pool
		int[] ary = {50,5,10,0,0,20,200,100,20,10};
		List<Integer> list = new ArrayList<Integer>();
		for(int e:ary) {
			list.add(e);
		}
		System.out.println(list);
		//[50, 5, 10, 0, 0, 20, 200, 100]
		
		//2 drawing box
		//box 1: 5 10 0 20 0
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i=1 ; i<=5 ; i++) {
					//get a index : 0~?
					int index =  (int)(Math.random() * list.size()); //0.xxxx~x.xxxxx   
					//show the prize
					System.out.println("box A get prize "+i+":"+list.get(index));
					//remove that prize
					list.remove(index);
				}
			}
		};
		//box 2: 50 200 100 20 10
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i=1 ; i<=5 ; i++) {
					//get a index
					int index =  (int)(Math.random() * list.size()); 
					//show the prize
					System.out.println("box B get prize "+i+":"+list.get(index));
					//remove that prize
					list.remove(index);
				}
			}
		};
		t1.start();
		t2.start();
	}

}













