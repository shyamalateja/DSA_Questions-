package pointers;

import java.util.Arrays;

public class nonzero {

	public static void main(String[] args) {
		int arr[]= {1,0,3,0,12};
		int slow=0;
	for(	int fast=0;fast<arr.length;fast++) {
	
		if(arr[fast]!=0) {
			int temp=arr[slow];
			arr[slow]=arr[fast];
			arr[fast]=temp;
			slow++;
		}
		
	}
	System.err.println(Arrays.toString(arr));
	}

}
