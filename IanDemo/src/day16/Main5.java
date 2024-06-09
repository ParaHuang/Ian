package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//multiple Threads compete the same resource
//the version fixes problem
public class Main5 {

	public static void main(String[] args) {	
		Drawing d = new Drawing();
		
		//2 drawing box
		//box 1: 5 10 0 20 0
		Thread t1 = new Thread(d,"A");
		//box 2: 50 200 100 20 10
		Thread t2 = new Thread(d,"B");
		t1.start();
		t2.start();
	}

}
//synchronized
//asynchronized


class Drawing implements Runnable{
	//prizes pool
	int[] ary = {50,5,10,0,0,20,200,100,20,10};
	List<Integer> list = new ArrayList<Integer>();
			
	public Drawing() {
		for(int e:ary) {
			list.add(e);
		}
		System.out.println(list);
	}

	@Override
	public void run() {
		for(int i=1 ; i<=5 ; i++) {
			getPrize();
		}
	}
	
	//make thread to wait in a queue
	public synchronized void getPrize() { //synchronized is like a lock for this method, when one Thread is using it, we have to wait it to finish, then the other can use it 
		//get a index
		int index =  (int)(Math.random() * list.size()); 
		//show the prize
		System.out.println("box "+Thread.currentThread().getName()+" get prize:"+list.get(index));
		//remove that prize
		list.remove(index);
	}
	
}
//Exception
//File










