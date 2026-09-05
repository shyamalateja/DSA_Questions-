package This_Supper;

class Person{
	int salary=60000;
	public void getsalary(int salary) {
		salary=5000;
		System.out.println("pareent class is : "+salary);
		System.out.println("parent class global valu :"+this.salary);
	}
}

public class Employee {
	
	int salary =3000;
	
	public void getsalary(double salary) {
		System.out.println("my part time salary :"+salary);
		
	}
	public void getsalary(int salary) {
		
		salary=2000;
		System.out.println(salary);
		System.out.println(salary);
		
		this.getsalary(70000);
		System.out.println(this);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.getsalary(1000);
		
		

	}

}
