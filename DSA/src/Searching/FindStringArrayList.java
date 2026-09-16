package Searching;

import java.util.Arrays;
import java.util.List;

public class FindStringArrayList {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("pen","paper","pencil","book");
		String target="book";
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i).equals(target)) {
				System.out.println("found string:"+i);
				return;
			}
		}
		System.out.println("not found");
	}

}
