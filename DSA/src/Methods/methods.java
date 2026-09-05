package Methods;

public class methods {

	//no return type and no parameter
	public void method1() {
		System.out.println("Welcome");
	}
	//with return type and no parameter
	public int method2() {
		return 56;
	}
	//no return type and with parameter
	public void method3(int age) {
		System.out.println(age);
	}
	//with return type and with parameter
	public int method4(String s) {
		return  s.length();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methods methods=new methods();
		methods.method1();
		
		int num=methods.method2();
		System.out.println(num);
		
		methods.method3(38);
		
		System.out.println(methods.method4("keerthi"));

	}

}
