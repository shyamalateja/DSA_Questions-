package Constructors;

public class Employee {
	int id;
	String name;
	
	public Employee() {
		id=123;
		name="suresh";
	}

	public void display() {
		System.out.println(id + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.display();

	}

}
