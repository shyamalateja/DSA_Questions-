package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

//with lamda
public class MyComparator  {
	
	
//	public int compare(Integer o1, Integer o2) {
//		/*if(o1<o2) {
//			return 1;
//		}
//		else if (o1 > o2) {
//			return -1;
//		}
//		else {
//			return 0;
//		}*/
//		return o2-o1;
//	}
	public static void main(String[] args) {
		ArrayList<Integer>aList=new ArrayList<>();
		
		aList.add(23);
		aList.add(12);
		aList.add(67);
		
		System.out.println(aList);
		/* with lamda
		Collections.sort(aList,new MyComparator());
		System.out.println(aList);*/
		
		//with lamda
		Comparator<Integer> comparator=(o1,o2)->(o1>o2)?1:(o1<o2)?-1:0;
		Collections.sort(aList ,comparator);
		System.out.println(aList);
	}
	}
