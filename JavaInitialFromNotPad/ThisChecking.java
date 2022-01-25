class SuperClassEx{

int abc = 19;

public void SuperClassExMethod(){
	System.out.println("super method");
}

public  void m2(){
	System.out.println("Method M2() by super claled");
}
}

public class ThisChecking extends SuperClassEx{
	
	public ThisChecking()
		{
			super();
			System.out.println("Child Class Construvtoer");
		}
		
		public void SuperClassExMethod(){
	System.out.println("child method");
}
		
		public void m2(){
		this.SuperClassExMethod();
	System.out.println("Method M2 from this() claled");
}
		
		
	public static void main(String[] args){
	
	System.out.println("In MAin");
	//System.out.println(this.ThisChecking());
	//System.out.println(this.m1);
	new ThisChecking().m2();
	
}
	
}

