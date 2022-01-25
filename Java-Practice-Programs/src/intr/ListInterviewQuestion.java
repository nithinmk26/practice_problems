package intr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ListInterviewQuestion {
	
	public static void HashSetIterator() {
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(78);hashSet.add(78);hashSet.add(98);
		Iterator<Integer> itr = hashSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public static void ListToArray() {
		List<Integer> al = new ArrayList<Integer>();
		al.add(3);
        al.add(17);
        al.add(6);
        al.add(9);
        al.add(7);
        
        Object[] arr = new Object[al.size()];
        arr = al.toArray();
        for (Object object : arr) {
			System.out.println(object);
		}
	}
	
	public static void ArrayToList() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
        al.add(17);
        al.add(6);
        al.add(9);
        al.add(7);
//		System.out.println(Arrays.asList(12,23,45,67,87));
		System.out.println(Arrays.asList(al));
	}
	public static void main(String[] args) {
//		ListInterviewQuestion.ListToArray();
//		ListInterviewQuestion.HashSetIterator();
		ListInterviewQuestion.ArrayToList();
	}
}

