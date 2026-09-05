package Blocks;

import Constructors.student;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setName("devasena");
		student.setmarks(160);
		System.out.println(student.getMarks() + " "+student.getName());

	}

}
