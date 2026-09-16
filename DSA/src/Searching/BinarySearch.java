package Searching;

import Arrays.arrdec;
import Arrays.insert;

public class BinarySearch {
//pointers
	public static void main(String[] args) {
		int ele[]= {10,20,29,30,40,50,60,70};
		
		int target=70;
	
		int left=0;
		int right=ele.length-1;
		
		while(left<=right) {
			
			int middle=(left+ right)/2;
			
			if(ele[middle]==target) {
				System.out.println("element found at "+middle);
				return;
			}
			else if (ele[middle]<target) {
				left=middle+1;
			}
			else {
				right=middle-1;
		}
		}
		System.out.println("no element founf");
	}

}
