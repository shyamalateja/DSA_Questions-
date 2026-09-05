package Arrays;

public class Majority {
public static void main(String[] args) {
	
	int arr[]= {2,2,1,3,2,2,1,1};
	
	int maj=arr.length/2;
	
	for(int i=0;i<arr.length;i++) {
		int count=0;
		for(int j=0;j<=i;i++) {
			if(arr[i]==arr[j]) {
				count++;
			}
		}
	}
	
}
}
