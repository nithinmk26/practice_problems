package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentFistNameLastNameComp {
	
	public static void main(String[] args) {
		
	
	ArrayList<Student> students = new ArrayList<>();
	students.add(new Student(55,"Nanda",625));
	students.add(new Student(89,"Bindhu",543));
	students.add(new Student(198,"Pranjeeth",367));
	students.add(new Student(46,"Dipan",590));
	students.add(new Student(98,"Abhi",590));

//	students.stream().sorted().forEach(System.out::println);
	Comparator<Student> marksNameCom = Comparator.comparing(Student::getMarks).thenComparing(Comparator.comparing(Student::getId));
	Comparator<Student> marksName = (i,i1)->{
		if(i.getMarks()<i1.getMarks())
			return -1;
		else if(i.getMarks()>i1.getMarks())
			return 1;
		else 
			return 0;
	};
	students.stream().sorted(marksName).forEach(System.out::println);
//	
//	Collections.sort(students, marksNameCom);
//	students.forEach(System.out::println);
//	
	}
}

class Student implements Comparable<Student>{
//	class Student{
	int id;
	String name;
	double marks;
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
	double getMarks() {
		return marks;
	}
	void setMarks(double marks) {
		this.marks = marks;
	}
	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	@Override
	public int compareTo(Student o) {
		return this.getName().compareTo(o.getName());
		
	}
	
	
//	@Override
//	public int compareTo(Student o) {
//		if(getId()>o.getId())
//			return 1;
//		else if(getId()<o.getId())
//			return -1;
//		else
//			return 0;
//	}
	
}