package Interview;

public class FifthLargestNumber {

	public static void main(String[] args) {
		int[] num = {1,4,12,77,42,56,76,99,104,45};
		
		int temp = 0;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println(num[num.length-5]);
	
	}

}
