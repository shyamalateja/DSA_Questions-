package Inheritance;
// multi level inheritance 
class guest{
	public void read() {
		System.out.println("guest he can read");
	}
}

class developer extends guest{
	public void write() {
		System.out.println("developer read and write");
	}
}

public class Admin extends developer {
	public void delete() {
		System.out.println("admin can read ,write , delete");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin ad=new Admin();
		ad.delete();
		ad.write();
		ad.read();
		
		

	}

}
