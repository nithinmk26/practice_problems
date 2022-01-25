package intr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class JavaArrayListExaple {
	
	public static void main(String[] args) {
		
		List<Integer> numList = new ArrayList<Integer>();
		
		numList.add(10);numList.add(16);numList.add(1);numList.add(9);numList.add(55);
		
		numList.add(2, 34);
		System.out.println(numList.contains(9));
		System.out.println(numList.isEmpty());
		System.out.println(numList.removeIf(num-> num==999));
		System.out.println("After removing 9 if present "+numList);
		
//		List<Integer> subList =  numList.subList(1, 4);
//		System.out.println(subList);
		List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
		
		listOfList.add(numList);
		listOfList.add(numList);
		listOfList.add(numList);
		
		
		Iterator<Integer> itr  = numList.iterator();
		while (itr.hasNext()) {
			Integer intval = itr.next();
			System.out.println(intval);
		}
		
		Iterator<List<Integer>> listlistIter = listOfList.iterator();
		
		while(listlistIter.hasNext()) {
			List<Integer> sublist = listlistIter.next();
			System.out.println(sublist);
		}
		
		List<String> nameList = new ArrayList<>();
		nameList.add("Nanda");
		nameList.add("N");
		nameList.add("a");
		nameList.add("Lekha");
		
		System.out.println(nameList.indexOf("Lekha"));
		Collections.sort(nameList,Collections.reverseOrder());
		System.out.println(Collections.max(numList));
		
		System.out.println(nameList);
		
		
		
		
		
	}

}

