package This_Supper;

public class Student {
	String name;
	public Student(String name) {
		name=name;
	}
	public void display() {
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student("bahubali");
		st.display();

	}

}
