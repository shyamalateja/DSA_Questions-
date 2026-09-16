package Searching;

public class twopointers {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,9,10,11};
		
	int left=arr[0];
	int right=arr.length-1;
	
	
	int target=10;
	while(left<right) {
		
	
	int sum=arr[left] +arr[right];
	
	if(sum==target) {
		System.out.println("found element :"+arr[left]+" "+arr[right]);
		left++;
		right--;
	}
	else if(sum<target) {
		left++;
	}
	else {
		right--;
	}

	}
	
	}
}
