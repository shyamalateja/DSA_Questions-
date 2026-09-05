package Arrays;

public class deletion {
public static void main(String[] args) {
	
	int arr[]= {12,33,21,65}; 
	
	int position=1;
	
	//new array size is created
	int arr2[]=new int[arr.length-1];
	
	// inserting before position
	for(int i=0;i<position;i++) {
		
		 arr2[i]=arr[i];
}
	// position is skipped
	
	for(int i=position;i<arr2.length;i++) {
		
		 arr2[i]=arr[i+1];
}
	for(int i=0;i<arr2.length;i++) {
		
		System.out.println(arr2[i]);
}	
}
}
