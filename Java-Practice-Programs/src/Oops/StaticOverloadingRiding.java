package Oops;

public class StaticOverloadingRiding extends Parent{
	
	public void m2() {
		System.out.println("Child Overriden..");
	}
	
	static void m1() {
		System.out.println("Method from Child overriden..");
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		StaticOverloadingRiding child = new StaticOverloadingRiding();
		Parent pChild = new StaticOverloadingRiding();
		
//		child.m2();//child
//		child.m1();//child
//		child.m3();//parent method Final cannot be overriden
//		child.num = 900;
//		System.out.println(child.num);//900
//		System.out.println(child.abc);//22
		
//		p.m2();
//		p.m1();
//		p.m3();
//		p.num=900;
//		System.out.println(p.num);
//		System.out.println(p.abc);
		
		pChild.m2();//overriden child
		pChild.m1(); //parent 
		pChild.m3(); // parent 
		pChild.num=990; 
		System.out.println(pChild.num); // changed
		System.out.println(pChild.abc); //changed
		
		
	}

}

class Parent {
	static int num =10;
	int abc =22;
	
	public void m2() {
		System.out.println("m2() from parent");
	}
	public final void m3() {
		System.out.println("m2() from parent");
	}
	
	static void m1() {
		System.out.println("Method from Parent class..");
	}
}