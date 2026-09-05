package Basics;

public class Employee {

	int empid=101;
	String empname="Teja";
	double sal=90000;
	static double annual_income=600000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=28;
		Employee emp=new Employee();
		System.out.println("emplyoee details : \n\nEmployee Id-"+emp.empid);
		System.out.println("Employee Name-"+emp.empname);
		System.out.println("Emplyee Age-"+age);
		System.out.println("Employee salary-"+emp.sal);
		System.out.println("Employee Annual Income -"+Employee.annual_income);
		
		

	}

}
