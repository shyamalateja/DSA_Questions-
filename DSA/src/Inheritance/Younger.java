package Inheritance;
//multi level inheritance
class Father{
	public void meet() {
		System.out.println("meet both childs");
	}
	
}
class Elder extends Father{
	public void usa() {
		System.out.println("gng abroad..want to meet");
		
	}
}
public class Younger extends Father{
	public void bdy() {
		System.out.println("today is my bithday");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Younger younger=new Younger();
		younger.meet();
		younger.bdy();
		Elder elder=new Elder();
		elder.meet();
		elder.usa();

	}

}
