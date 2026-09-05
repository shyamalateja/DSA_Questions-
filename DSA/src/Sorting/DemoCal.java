package Sorting;
@FunctionalInterface
interface Calc{
	int square(int x);
}

class DemoExist{
	public static int solved(int val) { //existing method
		
		return val*val;
	}
}
public class DemoCal {

	public static void main(String[] args) {
		Calc calc=x->x*x;
		System.out.println(calc.square(2));
//instance//
		DemoExist demoExist=new DemoExist();
				// Calc ct=demoExist::solved
	//static//
		
		Calc ct=DemoExist::solved;
		System.out.println(ct.square(3));
	}
}
