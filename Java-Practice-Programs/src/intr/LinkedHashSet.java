package intr;

public class LinkedHashSet {
public static void main(String[] args) {
	java.util.LinkedHashSet<Integer> linkedhashSet  = new java.util.LinkedHashSet<>();
	
	linkedhashSet.add(22);	linkedhashSet.add(1);	linkedhashSet.add(19);	linkedhashSet.add(5);
	linkedhashSet.add(22);
	System.out.println(linkedhashSet);
}
}
