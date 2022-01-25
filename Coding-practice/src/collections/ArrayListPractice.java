/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author M1056182
 *
 */
public class ArrayListPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1,"Nanda",23000));
		employees.add(new Employee(2,"Nithin",13000));
		employees.add(new Employee(3,"guru",53000));
		employees.add(new Employee(4,"Nanda",28000));
		employees.add(new Employee(5,"love",83000));
		System.out.println("Printing employees with salary >50K");
		employees.stream().filter((e)->e.getEmployeeSalary()>50000).forEach(System.out::println);
		
		System.out.println("Sort on sal");
		employees.stream().sorted(Comparator.comparingDouble(Employee::getEmployeeSalary).reversed())
		.forEach(System.out::println);
		
		System.out.println("Sort on sName");
		employees.stream().sorted(Comparator.comparing(Employee::getEmployeeName)).forEach(System.out::println);
		
		
//		Map<String,Double> emap = employees.stream().collect(Collectors.toMap(Employee::getEmployeeName, Employee::getEmployeeSalary));
//		Map<Employee, Double> map = employees.stream().collect(Collectors.toMap(Function.identity(), Employee::getEmployeeSalary));
//		employees.stream().collect(Collectors.toMap(Employee::getEmployeeId, Function.identity()));
//		
		System.out.println("List to Map");
		Map<Double,List<Employee>> groupMap = employees.stream().collect(Collectors.groupingBy(Employee::getEmployeeSalary));
		groupMap.entrySet().forEach(System.out::println);
		
		System.out.println("List to sumDOduble");
		Map<String,Double> groupMapSumSal = employees.stream().collect(Collectors.groupingBy(Employee::getEmployeeName, Collectors.summingDouble(Employee::getEmployeeSalary)));
		groupMapSumSal.keySet().forEach(x->System.out.println(x+"  " +groupMapSumSal.get(x)));
		
		System.out.println("---------------------------------------");
		Map<Employee, Object> emp1 = employees.stream().collect(Collectors.toMap(Function.identity(), e->e));
		emp1.entrySet().forEach(e->e.getValue());
	
	}

}

class Employee{
	private int id;
	private String name;
	private double salary;
	
	public int getEmployeeId() {
		return this.id;
	}
	
	public String getEmployeeName() {
		return this.name;
	}
	
	public double getEmployeeSalary(){
		return this.salary;
	}
	
	public Employee setId(int id) {
		this.id = id;
		return this;
	}
	
	public Employee setName(String name) {
		this.name = name;
		return this;
	}
	public Employee setSalary(double sal) {
		this.salary = sal;
		return this;
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	
	
	
	
	
	
}