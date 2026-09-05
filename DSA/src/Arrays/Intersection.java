package Arrays;

import java.util.function.IntBinaryOperator;

public class Intersection {

	public static void main(String[] args) {
		int a[]= {1,2,2,4,6};
		int b[]= {2,2,3,4};
		
		for(int i=0;i<a.length;i++) {
			boolean alreadyprinted=false;
			
			for(int k=0;k<i;k++) {
				if(a[k]==a[i]) {
					alreadyprinted=true;
					break;
				}
			}
			if(alreadyprinted) {
				continue;
			}
			
			for(int j=0;j<b.length;j++) {
		
			if(a[i]==b[j]) {
				System.out.println(a[i]+"");
				break;
			}
		}
	}
	}
}
