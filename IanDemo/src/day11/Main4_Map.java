package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Main4_Map {

	public static void main(String[] args) {
		//List,Set - use them to save same type or the stuffs with same meaning
		//"Jack", 18,"male",1.84
		//name , age, gender,height
//		List<Object> list = new ArrayList<Object>();
//		list.add("Jack");
//		list.add(18);
//		list.add(1.84);
//		list.add("male");
//		
//		System.out.println("gender:"+list.get(2));
//		Map -- HashMap
//		use Map to save information, we need save as key-value pair
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("name", "Jack");
		map.put("age", 18);
		map.put("gender", "male");
		map.put("height", 1.84);
		map.put("gender", "female");
		
		System.out.println("the gender of this person is:"+map.get("gender"));
		//11 22 33 88 77 66 55 99 11 22 77 
		//different number and how many time they exist?
		
		Set<String> set = map.keySet();//find all the keys of this map, and put them in a set
		System.out.println(set);
		for(String k:set) {
			System.out.println(k+"--"+map.get(k));
		}
	}

}













