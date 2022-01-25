package com.digital.numbers;

/**
 * @author M1056182
 *
 */
public class ConstructorClass {
	
	public static void main(String[] args) {
		ConstructorClass1 obj = new ConstructorClass1(1, "Nanda");
		ConstructorClass1 obj1 = new ConstructorClass1(2, "NithinNanda");
		System.err.println(obj);System.err.println(obj1);
	}
	
	
 } 

class ConstructorClass1{
	int id;
	
	String name;
	
	static String city;
	
	double number;
	
	
	static{
		city = "Birur";
//		number = 1234;
	}
	{
		number = 12345566;
	}

	public ConstructorClass1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ConstructorClass1 [id=" + id + ", name=" + name + ", city=" + city + ", Number" +number +"]";
	}
	
	
	
	
}
