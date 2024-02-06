package day1;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		//there are 5 students here, each of them have 3 scores 
		//we are recording those scores(input from keyboard), after finished recored,
		//output all those socres by person
		//and then output their total points and average points
		
		double[][] scores = new double[5][3];
		Scanner scan = new Scanner(System.in);

		for(int i=0 ; i<scores.length ; i++) {
			System.out.println("please enter the socres of student "+(i+1)+":");
			for(int j=0 ; j<scores[i].length ; j++) {
				scores[i][j] = scan.nextDouble();
			}
			
			/*
			scores[i][0] = scan.nextDouble();
			scores[i][1] = scan.nextDouble();
			scores[i][2] = scan.nextDouble();
			*/
		}
		

		for(int i=0 ; i<scores.length ; i++) {
			System.out.print("the scores of Student "+(i+1)+":");
			for(int j=0 ; j<scores[i].length ; j++) {
				System.out.print(scores[i][j]+" ");
			}
			System.out.println();
		}
		
		/*
		System.out.println("please enter the socres of student 1:");
		scores[0][0] = scan.nextDouble();
		scores[0][1] = scan.nextDouble();
		scores[0][2] = scan.nextDouble();

		System.out.println("please enter the socres of student 2:");
		scores[1][0] = scan.nextDouble();
		scores[1][1] = scan.nextDouble();
		scores[1][2] = scan.nextDouble();

		System.out.println("please enter the socres of student 3:");
		scores[2][0] = scan.nextDouble();
		scores[2][1] = scan.nextDouble();
		scores[2][2] = scan.nextDouble();

		System.out.println("please enter the socres of student 4:");
		scores[3][0] = scan.nextDouble();
		scores[3][1] = scan.nextDouble();
		scores[3][2] = scan.nextDouble();

		System.out.println("please enter the socres of student 5:");
		scores[4][0] = scan.nextDouble();
		scores[4][1] = scan.nextDouble();
		scores[4][2] = scan.nextDouble();
		*/
		
		ArrayTest2 at2 = new ArrayTest2();
		at2.fun();
	}
	
	public void fun() {
		
	}

}











