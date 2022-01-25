package Numbers.palindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupFromArray {
	
	private static int a =10;
	int b=20;
	
	public  void m1() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		int a[] = new int[]{10,10,10,22,23,23,52,59,59};
		
		ArrayList<Integer> numLisrt = new ArrayList<>();
for (int i = 0; i < a.length; i++) {
			numLisrt.add(a[i]);
		}
	   numLisrt.stream().distinct().forEach(e->System.out.println(e));
	}

}
