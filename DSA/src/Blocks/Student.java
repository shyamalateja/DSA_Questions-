package Blocks;

public class Student {

	private int marks;
	private String name;
	
	public void setmarks(int marks) {
		if(marks>=0 && marks<=100) {
		this.marks=marks;
		}else {
			System.out.println("inavlid marksenterd");
		}
	}
	public int getMarks() {
		return marks;
	}



public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}

}
