package java8;

interface Calculator{
	public int add(int a,int b);
}
public class Demo {

	public static void main(String[] args) {
		
	Calculator s=new Calculator() {
		
		@Override
		public int add(int a, int b) {
			
			return a+b;
		}
	};
	System.out.println(s.add(2, 3));
	
		/*Calculator ct=(int a,int b)->{ return a+b;

	};
 System.out.println(ct.add(23, 4));*/
}
}