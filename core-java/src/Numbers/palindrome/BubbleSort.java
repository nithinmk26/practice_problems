package Numbers.palindrome;

public class BubbleSort {
	
	  static void bubbleSort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    // swap arr[j+1] and arr[j]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	        for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
	    }

	public static void main(String[] args) {
		
		int a[] = new int[] {10,2,58,34,22,5};
		bubbleSort(a);
		
		
		
	}

}
