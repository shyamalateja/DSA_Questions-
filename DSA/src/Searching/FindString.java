package Searching;

public class FindString {

	public static void main(String[] args) {

		String arr[]= {"helloe","hi","im","writting","code"};
		
		String target="hi";
		boolean found=false;
		
		//for(String str:arr)
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				found=true;
				break;
			}
		}
		System.out.println(found ?"found element":"not found");

	}

}
