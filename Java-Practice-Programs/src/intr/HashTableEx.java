package intr;

import java.util.Hashtable;

public class HashTableEx {
	
	public static void main(String[] args) {
		Hashtable<Integer,Integer> htble = new Hashtable<>();
		htble.put(1, 6);
		htble.put(1, 5);htble.put(12, 66);htble.put(9, 69);
//		htble.put(null, 6);
		
//		htble.put(99, null);
		
		System.out.println(htble);
//		Nanda nanda = new Nanda() {
//			
//			@Override
//			void m1() {
//					System.out.println("Implemented Abstract MEthod");
//			}
//		};
//		
//		nanda.m1();
	}

}

abstract class Nanda{
	abstract void m1();
}
