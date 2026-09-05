package Basics;

public class Multiarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{12,32,43},{56,34,2,},{77,45,45}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
