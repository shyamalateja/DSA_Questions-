package Basics;

public class EmployMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employe e=new Employe(123, "suresh");
		Employe e1=new Employe(123, "suresh");
		Employe e2=new Employe(123, "suresh");
		Employe e3=new Employe(123, "suresh");
		Employe e4=new Employe(123, "suresh");
		Employe emps[]= {e,e1,e2,e3,e4};
		for(Employe ee:emps) {
			System.out.println(ee);
		}
		

	}

}
