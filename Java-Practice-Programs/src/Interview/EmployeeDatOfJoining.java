package Interview;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class EmployeeDatOfJoining {
	public static void main(String[] args) {

		ArrayList<Employees> listOfEmployee =  new ArrayList<>();
		listOfEmployee.add(new Employees(1, "Nanda", 56000,LocalDate.of(2020, 10, 11)));
		listOfEmployee.add(new Employees(5, "Denni", 16000,LocalDate.of(2018, 10, 11)));
		listOfEmployee.add(new Employees(32, "Deng", 76000,LocalDate.of(2021, 10, 11)));
		listOfEmployee.add(new Employees(12, "Kishore", 40000,LocalDate.of(2010, 10, 11)));
		listOfEmployee.add(new Employees(67, "Divi", 46000,LocalDate.of(2018, 10, 11)));
		//List of EMployee Joined before nth year
		listOfEmployee.stream().filter(employee->employee.getJoiningDate().isAfter(LocalDate.of(2019, Month.AUGUST, 22))).forEach(System.out::println);
		
//		Interf i = (a,b)-> System.out.println(a+b);
//		i.m1(10,20);
//		
//		Interf1 i1 = ()-> System.out.println("Nands");
//		i1.m1();
	}


}

interface Interf{
	public void m1(int a, int b);
}
@FunctionalInterface
interface Interf1{
	public void m1();
}

class Employees{
	
	private int id;
	private String name;
	private double salsry;
	private LocalDate joiningDate;
	
	
	public Employees(int id, String name, double salsry, LocalDate joiningDate) {
		super();
		this.id = id;
		this.name = name;
		this.salsry = salsry;
		this.joiningDate = joiningDate;
	}
	LocalDate getJoiningDate() {
		return joiningDate;
	}
	void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalsry() {
		return salsry;
	}
	void setSalsry(double salsry) {
		this.salsry = salsry;
	}
	public Employees(int id, String name, double salsry) {
		super();
		this.id = id;
		this.name = name;
		this.salsry = salsry;
	}
	public Employees() {
		super();
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", salsry=" + salsry + ", joiningDate=" + joiningDate + "]";
	}
	
	
	
}
