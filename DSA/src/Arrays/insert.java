package Arrays;

public class insert {

	public static void main(String[] args) {
		int arr[]= {12,33,21,65};
		
		int position=2;
		int val=13;
		//new array size is created
		int arr2[]=new int[arr.length+1];
		
		//upto positions values inserted into new array
		for(int i=0;i<position;i++) {
		
				 arr2[i]=arr[i];
		}
		
		arr2[position]=val;
		
		//after position value inserted remaining values are inserted 
		for(int i=position;i<arr.length;i++) {
			
			 arr2[i+1]=arr[i];
	}	
		for(int i=0;i<arr2.length;i++) {
			System.out.println("array "+arr2[i]);
	}
	}
}
