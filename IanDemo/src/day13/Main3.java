package day13;

import java.util.LinkedList;
import java.util.Queue;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue:FIFO
		Queue<Integer> queue = new LinkedList<Integer>();
		//offer/add
		queue.offer(11);
		queue.add(55);
		queue.offer(22);
		queue.add(33);
		System.out.println(queue);

		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		
		System.out.println();
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());//null:empty queue
		

//		while(!queue.isEmpty()){
//			System.out.println(queue.poll());
//		}
		while(true) {
			Integer i = queue.poll();
			if(i==null) {
				break;
			}
			System.out.println(i);
		}
	}

}











