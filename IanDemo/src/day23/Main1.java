package day23;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		String regex = "(?i)([A-Za-z])([A-Za-z])[A-Za-z]\\2\\1";
		System.out.println("HAnah".matches(regex));
		
		//HanaH    ABCBA     XXYXX   XZYZX
		
		//AnnA
//		String regex = "([A-Za-z])([A-Za-z])\\2\\1";
//		System.out.println("AnnA".matches(regex));
		/*
		//10000~99999
		//12321   88888   01234  13450
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a 5 digit number:");
		int num = scanner.nextInt();
		String regex = "([1-9])(\\d)\\d\\2\\1";
		if((num+"").matches(regex)) {
			System.out.println(num+" is a 5 digits palindromic number");
		}else {
			System.out.println("wrong");
		}
		
		
		String regex = "(?i)abc";
		System.out.println("ABC".matches(regex));
		*/
		
	}

}





