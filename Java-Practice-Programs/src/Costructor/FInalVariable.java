package Costructor;

public class FInalVariable {
	public static void main(String[] args) {
		Chil c = new Chil();
		c.m1();
	}

}

class Parent{
	static  String name;
	int a;
	String n;
	public static void m1() {
		System.out.println("Parent");
	}
	public Parent(int a) {
		super();
		this.a = a;
	}
	public Parent(String a) {
		super();
		this.n = a;
	}
	public Parent(int a, String name) {
		this(a);
		this.n = name;
		
	}
	
	public Parent() {
		super();
	}
	
	
	
	
}

class Chil extends Parent{
//	public final void m1() {
//		System.out.println("Parent");
//	}
	public static void m1(int a) {
		name="Koms";
		System.out.println("Child");
	}
	
	
	public int m1(String name) {
		return a;
		
	}
	 
	 
}