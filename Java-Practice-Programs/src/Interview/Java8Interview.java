package Interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Interview {
	public static void main(String[] args) {
		
		Predicate<Employee> f = e->e.getSalsry()>40000 && e.getName().startsWith("n");
		Predicate<Employee> salFourty = e->e.getSalsry()>40000;
	
		
		ArrayList<Employee> listOfEmployee =  new ArrayList<>();
		listOfEmployee.add(new Employee(1, "Nanda", 56000));
		listOfEmployee.add(new Employee(5, "Denni", 16000));
		listOfEmployee.add(new Employee(32, "Praveen", 76000));
		listOfEmployee.add(new Employee(12, "AbhiShek", 76000));
		listOfEmployee.add(new Employee(67, "Divi", 46000));
		
		Comparator<Employee> salCom = (e,e1)->{
			if(e.getSalsry()>e.getSalsry())
				return 1;
			else if(e.getSalsry()<e.getSalsry())
				return -1;
			else
				return 0;
		};
		
		Comparator<Employee> nameCom = Comparator.comparing(Employee::getName).thenComparing(salCom);
		
		listOfEmployee.stream().sorted(nameCom).forEach(System.out::println);
		
//		listOfEmployee.stream().sorted((emplo,emplo1)->emplo.getName().compareTo(emplo1.getName())).forEach(System.out::println);
		
		Function<Employee,Employee> increment = (e)-> {
//			if(salFourty.test(e)) {
				e.setSalsry(e.getSalsry()+10000);
//			}
			return e;
		};
		
		Function<List<Employee>,Long> fCount = e-> {
			return e.stream().filter(emp->emp.getName().startsWith("D")).count();
		};
		
		
//		System.out.println(fCount.apply(listOfEmployee));
//		
//		listOfEmployee.stream().filter(e->salFourty.test(e)).map(e->increment.apply(e)).forEach(System.out::println);

//		List<Employee> emp = listOfEmployee.stream().filter(employee -> employee.getName().startsWith("D")).filter(emp1->emp1.getSalsry()>45000).collect(Collectors.toList());
//		for (Employee employee2 : emp) {
//			System.out.println(employee2);
//		}
		
//		listOfEmployee.stream().filter(emp->f.test(emp)).forEach(System.out::println);
//		
//		
//		Java8Interface ji = ()->System.out.println("Implemented in Class");
//		ji.m2();	
//		ji.m1();
//		Java8Interface.m3();
		
		
	}

}

class Employee{
	
	private int id;
	private String name;
	private double salsry;
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
	public Employee(int id, String name, double salsry) {
		super();
		this.id = id;
		this.name = name;
		this.salsry = salsry;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salsry=" + salsry + "]";
	}
	
	
}
