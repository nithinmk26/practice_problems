package Numbers;

public class ArmStrongNum {

	public static void main(String[] args) {
		int num = 143;
		int temp = num;
		int sum=0;
		while(num!=0) {
			int digit = num%10;
			sum = sum+(digit*digit*digit);
			 num = num/10;
		}
		if(temp==sum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not ArmStrong");
		}
	}

}
