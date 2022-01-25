package Numbers;

import java.util.Arrays;
import java.util.List;

public class ListQUbesJava8 {
	
	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);
		num.stream().map(e-> e*e*e).forEach(System.out::println);
		
	}

}
