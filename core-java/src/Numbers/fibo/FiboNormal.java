package Numbers.fibo;

import java.util.Scanner;

public class FiboNormal {
	
	public static int fiboFun(int n) {
		if(n==0)
			return 0;
		if(n==1||n==2){
			return 1;
		}
		return fiboFun(n-1)+fiboFun(n-2);
	}

	public static void main(String[] args) {
		int a=0,b=1,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of fibo series...!");
		int tillNum = sc.nextInt();
		System.out.println("Fiba Series is...----");
		System.out.print(a+" "+b+" ");
		for (int i = 2; i < tillNum; i++) {
			c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		
		System.out.println("Function");
		for (int i = 0; i < tillNum; i++) {
			System.out.print(fiboFun(i)+" ");
		}
	}

}
