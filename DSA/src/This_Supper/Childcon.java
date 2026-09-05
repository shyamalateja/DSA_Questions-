package This_Supper;

 class Parentcon{
public Parentcon() {
	
	System.out.println("parent class con 6");
}
public Parentcon(int age) {
	this.m1();
	System.out.println("age of parent con 5"+age);
}
public void  m1() {
	System.out.println("age of parent class con 4");
}
}

public class Childcon extends Parentcon {
	
	public Childcon() {
		super();
	
		System.out.println("child class construct");
	}
	public Childcon(int age) {
		this.m1();
		System.out.println("age of childs con"+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childcon childcon=new Childcon();

	}

}
