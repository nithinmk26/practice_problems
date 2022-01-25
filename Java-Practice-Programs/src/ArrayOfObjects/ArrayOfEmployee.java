package ArrayOfObjects;

import java.util.Scanner;

public class ArrayOfEmployee {
	
	static Employee[] empList = null;
	static int size = 0;
	static Scanner scanner = new Scanner(System.in);
	static int empCount = 0;
	
	public static void main(String[] args) {
		
		System.out.println("Enter the total Number Employees ");
		size = scanner.nextInt();
		empList = new Employee[size];
		
		
		int choice = 0;
		do {
		System.out.println(" 1. Add Employee");
		System.out.println(" 2. View All Employee");
		System.out.println(" 3. View Employee By Id");
		System.out.println(" 4. Exit -> ");
		System.out.println("\t");
		System.out.println("\t");
		System.out.println("Enter Your Choice ...");
		choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Add employee");
			addEmployee();
			break;
		case 2:
			System.out.println("View All Employee");
			viewAllEmployes();
			break;
		case 3:
			System.out.println("View Employee By Id");
			viewEmployeeById();
			break;
		case 4:
			System.out.println("Successfully Exited from the APP!!!!");
			System.exit(0);
			break;
		default:
			System.out.println("Please select correct option..");
			break;
		}
		
	}while(choice!=4);
	}

	private static void viewEmployeeById() {
		if(empCount==0) {
			System.out.println("Cuurently No employees found in DB...!");
		}
		else {
			System.out.println("Enter Employee details");
			System.out.println(" ID ");
			int id  = scanner.nextInt();
			boolean isPresent = false;
			for (Employee employee : empList) {
				if(employee.getEmployee_id()==id) {
					isPresent=true;
					System.out.println(employee);
					break;
				}
			}
			if(!isPresent) {
				System.out.println("Employee with ID "+id +" Not found in DB");
			}
		}
	}

	private static void viewAllEmployes() {
		if(empCount==0) {
			System.out.println("Cuurently No employees found in DB...!");
		}
		else {
			for (Employee employee : empList) {
				System.out.println(employee);
			}
		}
		
	}

	private static void addEmployee() {
		if (empList.length == empCount) {
			System.out.println("Employee list is already full in your company...");
		}
		else {
			Employee emp = new Employee();
			System.out.println("Enter Employee details");
			System.out.println(" ID ");
			emp.setEmployee_id(scanner.nextInt());
			System.out.println(" Name ");
			emp.setName(scanner.nextLine());
			scanner.nextLine();
			System.out.println(" Phone ");
			emp.setPhone(scanner.nextLong());
			System.out.println(" Salary ");
			emp.setSalary(scanner.nextDouble());
			
			empList[empCount] = emp;
			empCount++;
			System.out.println("Employee Successfully Added in DB.");
			System.out.println("Total Employees in company are "+empCount);
		}
	}

}
