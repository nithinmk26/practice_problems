package intr;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeSet<Integer> treeNumSet = new TreeSet<>();
		treeNumSet.add(22);treeNumSet.add(02);treeNumSet.add(12);treeNumSet.add(99);
		System.out.println(treeNumSet);
		
		System.out.println(treeNumSet.ceiling(100));
		System.out.println(treeNumSet.floor(67));
		System.out.println(treeNumSet.headSet(67));
		
		System.err.println(treeNumSet.descendingSet());
		System.out.println(treeNumSet.higher(100));
		System.out.println(treeNumSet.first());
		
		Iterator<Integer> itrTree = treeNumSet.iterator();
		while(itrTree.hasNext()) {
			System.out.println(itrTree.next());
		}
	}
	
}
