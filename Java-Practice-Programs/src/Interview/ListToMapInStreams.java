package Interview;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapInStreams {
	public static void main(String[] args) {
		ArrayList<EmployeesToMap> listOfEmployee =  new ArrayList<>();
		listOfEmployee.add(new EmployeesToMap(1, "Nanda", 76000,LocalDate.of(2020, 10, 11)));
		listOfEmployee.add(new EmployeesToMap(5, "Denni", 16000,LocalDate.of(2018, 10, 11)));
		listOfEmployee.add(new EmployeesToMap(32, "Deng", 76000,LocalDate.of(2021, 10, 11)));
		listOfEmployee.add(new EmployeesToMap(12, "Kishore", 76000,LocalDate.of(2010, 10, 11)));
		listOfEmployee.add(new EmployeesToMap(67, "Divi", 46000,LocalDate.of(2018, 10, 11)));
		
		int count = 0;
		
		Map<Double, Long> salryCountMapped = listOfEmployee.stream().
				collect(Collectors.groupingBy(EmployeesToMap::getSalsry, Collectors.counting()));
		salryCountMapped.forEach((key,val)->System.out.println("KEY - "+key+" Value- "+val));
	}

}

class EmployeesToMap{
	
	private int id;
	private String name;
	private double salsry;
	private LocalDate joiningDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalsry() {
		return salsry;
	}
	public void setSalsry(double salsry) {
		this.salsry = salsry;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	public EmployeesToMap(int id, String name, double salsry, LocalDate joiningDate) {
		super();
		this.id = id;
		this.name = name;
		this.salsry = salsry;
		this.joiningDate = joiningDate;
	}
	public EmployeesToMap() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
