package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapsDataCollection {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Nithin");
		map.put(2, "Lekha");
		map.put(7, "Nanda");
		map.put(3, "Shiv");
		map.put(4, "Tushar");
		map.put(5, "Kesari");

		for(Map.Entry<?, ?> entry  : map.entrySet()) {
			System.out.println(entry.getKey() + " "+entry.getValue());
		}
		
		System.out.println("-------KEySet-----------");
		
		Set<Integer> key = map.keySet();
		Iterator<Integer> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			Integer val = itr.next();
			System.out.print("Key - "+val+" ");
			System.out.print("Value - "+map.get(val));
			System.out.println();
		}
		
		
	}

}
