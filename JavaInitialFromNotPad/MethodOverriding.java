class Parent {

int a =100;
static String name = "nanda";

public void m1() throws Exception{
System.out.println("Parent Method running..!!!");
}

public static void m2(){
System.out.println("Parent Method running..!!!");
}

protected void m3(){
System.out.println("Parent Method running..!!!");
}

private void m4(){
System.out.println("Parent Method running..!!!");
}

final void m5(){
System.out.println("Parent Method running..!!!");
}

}

public class MethodOverriding extends Parent{

int a=10;

public void m1(){
System.out.println("child inherited Method running..!!!");
}

public void m3(){
System.out.println("child Method running..!!!");
}





public static void main(String[] args){
	MethodOverriding child = new MethodOverriding();
	Parent p = new Parent();
	Parent pover = new MethodOverriding();
	//System.out.println(child.a);
	//System.out.println(p.a);
	//System.out.println(pover.a);
	
	child.m5();
	p.m5();
	pover.m5();
}
}
//3rd non repeated char in String

