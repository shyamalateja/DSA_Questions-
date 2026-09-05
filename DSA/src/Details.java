import java.util.Scanner;

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int Id=0;
		String name=" ";
		
		String fullName=" ";
		
		 String Marriage=" ";
		 double salary=0.0; 
		 
		/* String address=sc.nextLine(); int atm_pin=sc.nextInt(); double
		 * annual_salary=sc.nextDouble(); int increament=sc.nextInt(); float
		 * height=sc.nextFloat(); long phone_number=sc.nextLong(); long
		 * aadhar_num=sc.nextLong(); String attendence=sc.nextLine();
		 */
		
		
		System.out.println("Id:");
		if(sc.hasNextInt()) {
			Id=sc.nextInt();
			
		}
		else {
			System.out.println("id is invalid");
			return ;
		}
		
		System.out.println("Name  :");
		if(sc.hasNext()) {
			name=sc.next();
		}
		else {
			System.out.println("name is invalid");
			return ;
		}
		System.out.println("full name :");
		if(sc.hasNext()) {
			fullName=sc.next();
		}
		else {
			System.out.println("full name is invalid");
			return ;
		}
		System.out.println("enter marriage status");
		if(sc.hasNext()) {
			Marriage=sc.next();
		}
		else {
			System.out.println("enter correctly");
			return ;
		}
		System.out.println("enter salary :");
		if(sc.hasNextDouble()) {
			salary=sc.nextDouble();
		}
		else {
			System.out.println("salary is invalid");
			return ;
		}

	}

}
