package Sorting;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreInter {
	
	public static void main(String[] args) {
		//predicate integer
		Predicate<Integer> p= x->x%2==0;
		System.out.println(p.test(12));
		System.out.println(p.test(33));
		
		//predicate string
		String[] name ={"deva","katap","kalekeya"};
		Predicate<String> p1=s->s.length()>6;
		
		for(String st:name) {
			if(p1.test(st)) {
				System.out.println(st);
			}
		}
		
		//function:input return type
	Function<Integer, Integer> f1=i->i*i;
	System.out.println(f1.apply(2));
	System.out.println(f1.apply(15));
	
	//	function:string,integer
	
	Function< String, Integer>f2=s->s.length();
	
	System.out.println(f2.apply("String"));
	System.out.println(f2.apply("deva"));
	System.out.println("balla");
	
	//function:string -- string
	
	Function<String, String> f3=s->s.toUpperCase();
	
	System.out.println(f3.apply("devasena"));
	System.out.println(f3.apply("hello"));
	
	//consumer:input--no return
	
	Consumer<String>con=c->System.out.println(c);
	con.accept("devsasena");
	
	//supplier : no input--output
	Supplier<Date> supplier=()->new Date();
	System.out.println(supplier.get());
	//otp
	
	Supplier<String>s2=()->{
		
		String otp="";
		for(int i=0;i<6;i++) {
			otp =otp + Math.random()*10;
		}
		return otp;
	};
	System.out.println(s2.get());
	
	}

}
