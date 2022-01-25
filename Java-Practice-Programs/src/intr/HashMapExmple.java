package intr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExmple {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Nanda", 1);map.put("Nanda", 7);map.put("Nanda", 34);
		map.put("Lekha", 2);map.put("Lekha", 22);map.put("Lekha", 90);
		
		
//	Set set = map.entrySet();
//	Iterator<Map.Entry<String, Integer>> itr = set.iterator();
//	while(itr.hasNext()) {
//		Map.Entry<String, Integer> entry = itr.next();
//		System.out.println(entry.getKey()+" VAlue "+entry.getValue());
//		
//	}
		
//		Set set = map.keySet();
//		Iterator<String> itr = set.iterator();
//		while(itr.hasNext()) {
//			String key = itr.next();
//			System.out.println("KEY "+key+ "  Value "+map.get(key));
//		}
	
		Map<String, List<Integer>> mapList = new HashMap<>();
//		LinkedHashMap<String, List<Integer>> mapList = new LinkedHashMap<>();
		mapList.put("Nanda", new ArrayList<Integer>());
		mapList.get("Nanda").add(1);
		mapList.get("Nanda").add(5);
		mapList.get("Nanda").add(10);
		mapList.put("Binda", new ArrayList<Integer>());
		mapList.get("Binda").add(1);
		mapList.get("Binda").add(5);
		mapList.get("Binda").add(10);
		mapList.put("C", new ArrayList<Integer>());
		mapList.get("C").add(1);
		mapList.get("C").add(5);
		mapList.get("C").add(10);
		mapList.put("Dimpi", new ArrayList<Integer>());
		mapList.get("Dimpi").add(1);
		mapList.get("Dimpi").add(5);
		mapList.get("Dimpi").add(10);
		mapList.put(null, new ArrayList<Integer>());
		mapList.put(null, Arrays.asList(1,2,4));
		
		for(Entry<String, List<Integer>> mapEntry : mapList.entrySet()) {
			System.out.println(mapEntry.getKey() + " Val "+mapEntry.getValue());
		}
		
//		for(String val : mapList.keySet()) {
//			System.err.println(mapList.get(val));
//		}
		
//		System.out.println(mapList);
		
	}

}
