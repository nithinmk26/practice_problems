package intr;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Nanda", 1);map.put("Ninda", 7);map.put("Hinda", 34);
		map.put("Lekha", 2);map.put("Avnda", 22);map.put("munda", 90);
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key "+entry.getKey() + " Value "+entry.getValue());
		}
		System.out.println("After Sorting----");

		map.entrySet().stream().sorted(
				Map.Entry.comparingByKey(Collections.reverseOrder())
				).forEach(System.out::println);
		System.out.println("After Sorting----");

		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
//		for(Entry<String, Integer> entry : map.entrySet()) {
//			System.out.println("Key "+entry.getKey() + " Value "+entry.getValue());
//		}
		
	}

}
