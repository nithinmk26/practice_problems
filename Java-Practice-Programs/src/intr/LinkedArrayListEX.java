package intr;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedArrayListEX {

	public static void main(String[] args) {
		LinkedList<Integer> linkedlist= new LinkedList<>();
		
		linkedlist.add(12);linkedlist.add(16);linkedlist.add(2);linkedlist.add(9);

		linkedlist.offer(69);//last
		linkedlist.offerFirst(66);//first
		linkedlist.offerLast(60);//last
		System.out.println("Before\t"+linkedlist);
		System.out.println(linkedlist.poll());//first
		System.out.println("Before\t"+linkedlist);
		System.out.println(linkedlist.pollFirst());
		System.out.println("Before\t"+linkedlist);
		
		System.err.println(linkedlist.peek());
		
		System.out.println("\"After\" "+linkedlist);
		
		ArrayList<Integer> linkedToArrayList = new ArrayList<>(linkedlist);
//		linkedToArrayList.addAll(linkedlist);
		System.out.println(linkedToArrayList);
		
	}

}
