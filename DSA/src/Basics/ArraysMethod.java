package Basics;

import java.util.Arrays;
import java.util.List;

public class ArraysMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>nums=Arrays.asList(1,2,3,4,54,5);
		System.out.println(nums);
		
		int arr[]= {2,4,5,2,1,8};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		int index=Arrays.binarySearch(arr, 2);
		System.out.println("index"+index);
		
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		
		System.out.println("equal :"+Arrays.equals(arr1, arr2));
		System.out.println("compare : "+Arrays.compare(arr1, arr2));
		
		int st[]= {6,3,5,7};
		int cpy[]=Arrays.copyOf(st, 10);
		System.out.println(Arrays.toString(cpy));
		
		int[] cpy1=Arrays.copyOfRange(st,2,4);
		System.out.println(Arrays.toString(cpy1));
		
		int dt[]=new int[6];
		Arrays.fill(dt,7);
		System.out.println(Arrays.toString(dt));
		
		

	}

}
