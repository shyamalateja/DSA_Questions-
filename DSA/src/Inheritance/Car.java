package Inheritance;
//is-a and has-a relation
 class Vehicle{
	public void start() {
		System.out.println("car is started");
	}
}

 class Engine { 
	public void strike() {
		System.out.println("it a 4 strike");
	}
}

public class Car extends Vehicle{//car has a engine
	public void ready() {
		System.out.println("ready");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		Engine engi=new Engine();
		car.start();
		car.ready();
		engi.strike();
		

	}

}
