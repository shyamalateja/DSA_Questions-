package Constructors;

public class student {
	int id;
	String name;
	
	public void assign() {
		id=323;
		name="teja";
		
	}
	
	public void display() {
		System.out.println(id+name);
	}
	public static void main(String[] args) {
		student st=new student();
		st.assign();
		st.display();
	}

}
