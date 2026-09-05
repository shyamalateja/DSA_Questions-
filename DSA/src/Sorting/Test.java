package Sorting;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Employee> employees= Arrays.asList(
				new Employee(123, "soma"),
				new Employee(232, "devs"),
				new Employee(563,"bali"),
				new Employee(212, "ramu")
				
				);
		Test ttTest=new Test();
		employees.stream()
		
		.forEach(System.out::println);

	}

}
