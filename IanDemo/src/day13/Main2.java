package day13;

import java.util.Stack;

public class Main2 {

	public static void main(String[] args) {
		//Stack : first in last out
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(11);
		stack.add(55);
		stack.push(22);
		stack.add(33);
		
		System.out.println(stack);
		
		for(int i=0 ; i<stack.size() ; i++) {
			System.out.println(stack.get(i));
		}
		System.out.println();
		
		//peek:have a look on the top element  
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println();
		
		/*
		//pop : pop the top element out
		System.out.println(stack.pop());
//		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
//		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
//		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		*/
		
		//limit but with a specific times of loop
//		for(; !stack.isEmpty() ; ) {
//			System.out.println(stack.pop());
//		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		
		
	}

}











