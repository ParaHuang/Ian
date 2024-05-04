package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main5 {

	public static void main(String[] args) {
		String str = "hello world, how are you today";
//		Map<Character, Integer> map = new HashMap<>();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(int i=0 ; i<str.length() ; i++) {
			char c = str.charAt(i);
			Integer times = map.get(c);
			if(times==null) {	// this key doesn't exist before
				map.put(c, 1);
			}else {
				map.put(c, ++times);
			}
		}
		Set<Character> set =  map.keySet();
		for(char c:set) {
			System.out.println(c+" exist for "+map.get(c)+" times");
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

