package ArrayOfObjects;

public class Employee implements Comparable<Employee>{
	private int employee_id;
	private String name;
	private long phone;
	private double salary;
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int employee_id, String name, long phone, double salary) {
		super();
		this.employee_id = employee_id;
		this.name = name;
		this.phone = phone;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", name=" + name + ", phone=" + phone + ", salary=" + salary
				+ "]";
	}
	
	
	@Override
	public int compareTo(Employee o) {
//		if(employee_id > o.employee_id) {
//			return 1;
//		}
//		else if(employee_id< o.employee_id) {
//			return -1;
//		}
//		else
//			return 0;
//		if(salary > o.salary) {
//			return 1;
//		}
//		else if(salary < o.salary) {
//			return -1;
//		}
//		else
//			return 0;
		return name.compareTo(o.name);
	}
	

	

}
