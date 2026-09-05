package Arrays;

public class avarage {

	public static void main(String[] args) {
		
		int arr[]= {54,24,5,54,67};
		int sum=0;
		int avg=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
	}
		avg=sum/arr.length;
		System.out.println("average of array is : "+avg);
	}

	}


