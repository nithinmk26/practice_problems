import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

public class MainFunction {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.m1);
		p.props();
		
		Animal animal = ()->{System.out.println("Animal is Eating..!!!");};
		
		animal.eating();
		
		Function<String, Integer> strlen = (s)->s.length();
		BiFunction<String, String, String> concat = (a,b)->b+a;
		List<String> names = new ArrayList<>();
		names = Arrays.asList("Nanda","Komala");
		
		names.stream().map((s)->strlen.apply(s)).forEach(System.out::println);
		
		names.stream().map((s)->concat.apply(s,"Hello ")).forEach(System.out::println);
		
		System.out.println("---------------------");
		
	
		
		Consumer<String> consumeMethod = (a)->System.out.println(a);
		Consumer<String> consumeMethod1 = ConsumerRef::printMessage;
		
		names.stream().forEach(c->consumeMethod1.accept(c));

		
		LocalDate today = LocalDate.now();

		LocalDate bday = LocalDate.of(1997, 12, 26);
		
		Period gap = Period.between(bday, today);
		System.out.print(gap.getYears()+"-Years ");
		System.out.print(gap.getMonths()+"-Months ");
		System.out.print(gap.getDays()+"-Dyas ");
		
		
		System.out.println(bday.getDayOfYear());
		
		
		
		Supplier<String> sup = ()->{
			List<String> names1 = new ArrayList<>();
			names1 = Arrays.asList("Nanda","Komala");
			return names1.stream().filter(s->s.startsWith("K")).findAny().get();
		};
		
		Supplier<String> otpGenerator = ()->{
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 6; i++) {
				sb.append((int)(Math.random()*10));
			}
			return sb.toString();
		};
		
		System.out.println(otpGenerator.get());
		
		List<Integer> num = new ArrayList<>();
		num = Arrays.asList(1,2,3,4,5,6);
		System.err.println(num.parallelStream().reduce((a,b)->a+b).get());
		Comparator<Integer> c = (a,b)-> {
			 if(a>b)
				 return -1;
			 else if(a<b)
				 return 1;
			 else
				 return 0;
						 
		};
//		System.out.println(num.stream().max(c));
		System.out.println(num.stream().count());
		
		staticDefault sD = new staticDefault() {
			
			@Override
			public void m1() {
				
			}
		};
		staticDefault.m2();
		System.out.println(sD.m3());
		sD.m1();
		
		ConsumerRef cc = new ConsumerRef();
		cc.m3();
//		simple s = simple::new;
		
	}

	
}
class simple{

	public simple() {
		super();
		System.out.println("simple called");
	}
	
}

class ConsumerRef implements staticDefault{
	static void printMessage(String s) {
		System.err.println(s);
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	public ConsumerRef() {
		super();
		System.out.println("Con Called");
	}
	
	
	
}
