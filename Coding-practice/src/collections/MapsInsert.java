package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapsInsert {

	public static void main(String[] args) {
		Map<Double, EmployeeClass> hashMap = new LinkedHashMap<>();
		List<EmployeeClass> employees = new ArrayList<>();
		
		EmployeeClass e1 = new EmployeeClass(1,"Nanda",23000);
				EmployeeClass e2 = new EmployeeClass(2,"Nithin",13000);
				EmployeeClass e3 = new EmployeeClass(3,"Nithin",13000);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(new EmployeeClass(4,"prem",53000));
		employees.add(new EmployeeClass(5,"love",43000));
		Consumer<EmployeeClass> employeeInsert = (e)-> hashMap.put(e.getEmployeeSalary(),e);
		employees.stream().forEach(e->employeeInsert.accept(e));
		
		for(Map.Entry<Double,EmployeeClass> entry:hashMap.entrySet()) {
			System.out.println(entry.getKey() + "  "+entry.getValue());
		}
		
		Map< EmployeeClass , Double> empSal = new HashMap<EmployeeClass, Double>();
		empSal.put(e1, e1.getEmployeeSalary());
		empSal.put(e2, e2.getEmployeeSalary());
		empSal.put(e3, e3.getEmployeeSalary());
		
		empSal.entrySet().forEach(e-> System.out.println(e.getKey() + " --- "+e.getValue()));
		List<String> names = Arrays.asList("Nanda","Nanda","Nithin","MK","MK","Lekha","Lekha","Lekha");
		Map<Object, Long> maps = names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		employees.stream().
		maps.forEach((a,b)->System.out.println(a+"   "+b));
		maps.entrySet().forEach(e->System.out.println(e.getKey()+"- "+e.getValue()));
		Optional<Map.Entry<Object,Long>> val =  maps.entrySet().stream().filter(e->e.getValue()==1).findFirst();
		System.out.println(val.get().getKey() + " "+val.get().getValue());
		
	}

}


class EmployeeClass{
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
	
	public EmployeeClass setId(int id) {
		this.id = id;
		return this;
	}
	
	public EmployeeClass setName(String name) {
		this.name = name;
		return this;
	}
	public EmployeeClass setSalary(double sal) {
		this.salary = sal;
		return this;
	}

	public EmployeeClass(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public EmployeeClass() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		long temp;
//		temp = Double.doubleToLongBits(salary);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		EmployeeClass other = (EmployeeClass) obj;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
//			return false;
//		return true;
//	}
	
	


}

