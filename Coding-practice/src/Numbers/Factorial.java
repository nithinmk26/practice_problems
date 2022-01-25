package Numbers;

public class Factorial {
public static void main(String[] args) {
	int factNum=5;
	int sum=1;
	for (int i = factNum; i >0; i--) {
		sum = sum * i;
	}
	System.out.println("Fact of "+factNum+" is "+sum);
}
}
