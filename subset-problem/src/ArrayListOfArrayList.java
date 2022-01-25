import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 */

/**
 * @author M1056182
 *
 */
public class ArrayListOfArrayList {
	private static Scanner scanner = new Scanner(System.in);
	
	 static ArrayList<ArrayList<Integer> > aList =  new ArrayList<ArrayList<Integer> >();
	public static void main(String args[]) 
	{ 
		System.out.println("Enter array size");
		int arraySize=scanner.nextInt();
		int array[] = new int[arraySize];
		System.out.println("Enter array elements");
		
		for (int index = 0; index < array.length; index++) {
			array[index]=scanner.nextInt();
		}
		System.out.println("Enter sum");
		
		int sum = scanner.nextInt(); 

		findSubsets(array, sum); 
		Set<ArrayList<Integer>> setArrList = new HashSet<>();
		for(ArrayList<Integer> num : aList) {
			setArrList.add(num);
		}
		setArrList.forEach(System.err::println);
	} 
	
	
	public static void findSubsets(int[] arr, int K) 
	{ 
		// possible subsets 
		int x = (int)Math.pow(2, arr.length); 

		
		for (int i = 1; i < x; i++) 
			sumSubsets(arr, i, K); 
	} 


public static void sumSubsets( 
	int set[], int n, int target) 
{ 
 
	int x[] = new int[set.length]; 
	int j = set.length - 1; 

	// Convert the array into binary array 
	while (n > 0) { 
		x[j] = n % 2; 
		n = n / 2; 
		j--; 
	} 

	int sum = 0; 
	ArrayList<Integer> numList;
	// Calculate the sum of this subset 
	for (int i = 0; i < set.length; i++) 
		if (x[i] == 1) 
			sum = sum + set[i]; 
	numList = new ArrayList<>();
	// Check whether sum is equal to target 
	// if it is equal, then print the subset 
	if (sum == target) { 
		System.out.print("{"); 
		for (int i = 0; i < set.length; i++) 
			if (x[i] == 1) {
				numList.add(set[i]);
				System.out.print(set[i] + ", "); 
				}
		System.out.print("}, "); 
		aList.add(numList);
		
	} 
} 


}
