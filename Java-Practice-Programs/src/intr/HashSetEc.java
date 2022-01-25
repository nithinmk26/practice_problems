package intr;

import java.util.HashSet;
import java.util.Set;

public class HashSetEc {

	public static void main(String[] args) {
		Set<Integer> numSet = new HashSet<>();
		HashSet<String> nameHashSet = new HashSet<>();
		
		numSet.add(20);numSet.add(2);numSet.add(12);numSet.add(20);
		numSet.add(null);numSet.add(null);numSet.add(null);
		nameHashSet.add("Nithin");nameHashSet.add("nithin");nameHashSet.add("NithiN");
		nameHashSet.add("Nithin");
		
		
		System.out.println(nameHashSet);
		
		Object []arr = new Object[nameHashSet.size()];
		arr = nameHashSet.toArray();
		for (Object object : arr) {
			System.err.println(object);
		}
	}

}
