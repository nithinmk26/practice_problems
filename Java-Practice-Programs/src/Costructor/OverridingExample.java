package Costructor;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OverridingExample {

}

class Emp {
	
	void m1() throws IOException  {
		Thread.sleep(1000);
	}
	
}

class Emp1 extends Emp{
	protected void m1() throws FileNotFoundException{
		
	}
}
