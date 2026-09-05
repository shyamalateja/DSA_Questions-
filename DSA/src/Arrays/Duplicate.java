package Arrays;

public class Duplicate {
	public static void main(String[] args) {
		int arr[]= {2,3,4,2,5,3,6};
		boolean found =false;
		
		//int val=arr[0];
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("duplicate element found "+arr[i]);
					found=true;
					break;
					//val=arr[i];
					
				}
			}
			if(found) {
				break;
			}
		}
		if(!found)
		System.out.println("element not found ");
	}

}
