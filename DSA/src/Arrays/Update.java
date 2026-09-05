package Arrays;

public class Update {

	public static void main(String[] args) {
		
		int arr[]= {1,32,23,45,65}; 
		
		int position=2;
		int val =100;
		for(int i=0;i<arr.length;i++) {
			if(i==position) {
				arr[i]=val;
			}
			System.out.println(arr[i]);
		}

	}

}
