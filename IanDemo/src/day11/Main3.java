package day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.stream.events.Characters;

//2.define a method, name is countJewels, it takes 2 String as parameter
//public static void countJewels(String jewels, String stones)
//each character in jewels represents a type of jewel(if there are identical character, then it represent one type of jewel),the point of this method is to count how many jewels you can find in stones. 
//sample 1:
//String jewels = "aAa";
//String stones = "wwamioAampp";
//countJewels(jewels,stones);
//output:3
//
//sample 2:
//String jewels = "z";
//String stones = "ZZ";
//countJewels(jewels,stones);
//output:0


public class Main3 {

	public static void main(String[] args) {
		String jewels = "z";
		String stones = "ZZ";
		countJewels(jewels,stones);  //3
	}

	public static void countJewels(String jewels, String stones) {
		Set<Character> set = new HashSet<>();   //contains
//		List<Character> set = new ArrayList<Character>();
		char[] chs = jewels.toCharArray();
		for(char c:chs) {
			set.add(c);
		}
		
		char[] stoneArray = stones.toCharArray();
		int count=0;
		for(char c:stoneArray) {
			if(set.contains(c)) {
				count++;
			}
		}
		
		
		System.out.println(count);
		
	}
}


















