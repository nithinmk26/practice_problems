package ArrayOfObjects;

import java.util.Arrays;
import java.util.Comparator;


public class ArraysSortingEmployee {

	public static void main(String[] args) {
		Employee[] empList = new Employee[5];
		empList[0] = new Employee(67, "Lekha", 12345678765L, 28000);
		empList[1] = new Employee(13, "Nanda", 9876523432L, 88000);
		empList[2] = new Employee(98, "Sush", 8798786678L, 8000);
		empList[3] = new Employee(35, "manisha", 678878989L, 10000);
		empList[4] = new Employee(8, "abhi", 99009900789L, 16000);

		System.out.println("Before Sorting the Emp Array...");
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		
//		System.out.println();System.out.println();System.out.println();
//		System.out.println("After Sorting By ID");
//		Arrays.sort(empList);
//		for (Employee employee : empList) {
//			System.out.println(employee);
//		}
	
		System.out.println("Sorting by comparator for Array Of Objects..");
		Arrays.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.getSalary()>o2.getSalary()) {
					return 1;
				}
				else if(o1.getSalary() < o2.getSalary()) {
					return -1;
				}
				else
					return 0;
			}
			
		});
		
		System.out.println(Arrays.asList(empList));
	}
	

}
