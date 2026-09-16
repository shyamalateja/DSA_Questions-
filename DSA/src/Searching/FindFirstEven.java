package Searching;

public class FindFirstEven {

	public static void main(String[] args) {
		
		int arr[]= {1,3,24,25,76,48,13};
		
		
		//for(int num:arr)
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]% 2==0 ) {
				System.out.println("found ebven"+arr[i]);
				return;
			}
		}
		System.out.println("not found");

	}

}
