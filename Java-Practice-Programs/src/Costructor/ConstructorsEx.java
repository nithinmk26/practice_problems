package Costructor;

public class ConstructorsEx {

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.x);
	}

}

class Employee{
	int x;
	
	public Employee(int val) {
		this.x = val;
	}
	
	public Employee() {
		
	}
	
}
