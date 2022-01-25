
public class ArrayDuplicatesRemo {

	public static void RemoveDuplicate(int[] a) {
		
	}
	
	public static void main(String[] args) {
		int arr[] = new int[] {54,21,63,54,21,12,55,96,54,21,63,54,21,86,54,61,02};
		System.out.println("Before Sorting...!");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("After Sorting..!");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		
		RemoveDuplicate(arr);
		
	}

}
