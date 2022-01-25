package arrays;

public class EvenPositionArray {
public static void main(String[] args) {
	int arr[] = new int[] {1,2,3,4,4,5,6,6,7,8,8,23,435,67,8};
	for (int i = 0; i < arr.length; i++) {
		if(i%2==0) {
			System.out.println(i+" element is "+arr[i]);
		}
	}
}
}
