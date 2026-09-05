package Arrays;
//rotate left 
public class RotateLeftTwo {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		
		for(int k=0;k<2;k++)
		 {
			int first=arr[0];
			for(int i=0;i<arr.length-1;i++)
			 {
				arr[i]=arr[i+1];
				
			}
			arr[arr.length-1]=first;
		 }
			for(int x:arr) {
				System.out.println(x+"");
			}
		}

	}


