package intr;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class WeakHashMapExample {
	
	public static void main(String[] args) throws InterruptedException {
		HashMap<Integer, String> hm = new HashMap<>();
//		IdentityHashMap<Integer, String> hm = new IdentityHashMap<>();
//		WeakHashMap<Integer, String> hm = new WeakHashMap<>();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(20);
		hm.put(i1, "Nanda");
		hm.put(i2, "Lekha");
		
		
	
		Set entrySet = hm.entrySet();
		Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " Value "+entry.getValue());
		}
		
		i2=null;
		System.gc();
		Thread.sleep(2000);
		System.out.println("After GArbage Collectio DOne...");
		
		Set entrySet1 = hm.entrySet();
		Iterator<Map.Entry<Integer, String>> itr1 = entrySet1.iterator();
		while(itr1.hasNext()) {
			Map.Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey() + " Value "+entry.getValue());
		}
		
		
	}

}
