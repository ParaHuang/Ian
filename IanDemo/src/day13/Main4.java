package day13;

import java.util.ArrayList;
import java.util.List;

public class Main4 {

	public static void main(String[] args) {
		String str = "hello world, how are you today";

		List<Character> letters = new ArrayList<>();
		List<Integer> times = new ArrayList<>();
		for(int i=0 ; i<str.length() ; i++) {
			char c = str.charAt(i);
			if(letters.contains(c)) {
				//change times
				//1.find out which position
				int index = letters.indexOf(c);
				//2.get the time at the same position
				int t = times.get(index);
				//3.change the times on that position
				times.set(index, ++t);
			}else {
				//add into letter list
				letters.add(c);
				//add 1 time into times list
				times.add(1);
			}
		}
		
		for(int i=0 ; i<letters.size() ; i++) {
			System.out.println(letters.get(i)+" exist for "+times.get(i)+" times");
		}
		//count how many times for each letter shows up
		//h -- 2
		//e -- 1
		//l -- 3
		//o -- 5
		//d -- 1
		
		//h exist for 2 times
		//e exist for 1 times
		
		
	}

}

