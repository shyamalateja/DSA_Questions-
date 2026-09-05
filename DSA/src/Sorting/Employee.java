package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {
	int empid;
	String empname;

	public Employee(int empid, String empname) {
		
		this.empid = empid;
		this.empname = empname;
	}

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<>();
		
		al.add(new Employee(123, "bahu"));
		al.add(new Employee(732, "bali"));
		al.add(new Employee(673, "deva"));
		al.add(new Employee(768, "sena"));
		
		System.out.println(al);
		Collections.sort(al,(e1,e2)->(e1.empid>e2.empid)?-1:(e1.empid<e2.empid)?1:0);
		System.out.println(al);

	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}

}
