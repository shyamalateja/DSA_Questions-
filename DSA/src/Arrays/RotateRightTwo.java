package Arrays;

public class RotateRightTwo {

	public static void main(String[] args) {

int arr[]= {10,20,30,40,50};

for(int k=0;k<2;k++) {
	
	int last=arr[arr.length];
	
	for(int i=0;i<arr.length-1;i++) {
		arr[i]=arr[arr.length-1];
	}
			arr[arr.length-1]=last;
}
for(int r:arr) {
	System.out.println(r+" ");
}

	}

}
