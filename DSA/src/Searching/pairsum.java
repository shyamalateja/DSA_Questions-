package Searching;

import Arrays.sumofarray;

public class pairsum {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6};
		int target=6;
		boolean found=false;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				int sum=arr[i] + arr[j];
				if(sum==target) {
					System.out.println("found pair: "+arr[i]+""+arr[j]);
					found=true;
				}
			}
			if(!found) {
				System.out.println("not found ");
			}
		}
	}

}
