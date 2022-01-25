package Costructor;

public class StaticExample {
	
	static String Nanda = "AIT";
	
	
	public static void main(String[] args) {
		
		Student stu = new Student(1,"Koms");
		Student stu1 = new Student(1,"Nithin");
		Student stu2 = new Student(1,"Reetha");
		System.out.println(stu);System.out.println(stu1);System.out.println(stu2);
		System.out.println(stu);System.out.println(stu1);System.out.println(stu2);
		Student stu123 = new Student();
		System.out.println(stu123);
//		stu123.cName = "vghjnajvsgrf";
		System.out.println(Nanda);
	}

}
class Student{
	static  String cName;// = "NMIT";
	int st_id;
	String name;
	public Student(int st_id, String name) {
		super();
		this.st_id = st_id;
		this.name = name;
	}
	static {
		cName="Komala";
	}
	
	{
		cName="ichosfn";
	}

	
public Student() {
	
		super();
		// TODO Auto-generated constructor stub
	}


	//	public static void m1() {
//			cName = "Nanda";
//	}
	@Override
	public String toString() {
		return "Student [st_id=" + st_id + ", name=" + name + ", "+"Cname "+cName+ "]";
	}
	
	

	
	
	
}
