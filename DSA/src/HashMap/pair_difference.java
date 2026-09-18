package HashMap;

import java.util.HashMap;
import java.util.Map;

public class pair_difference {
public static void main(String[] args) {
	
	int arr[]= {1,3,5,4,2};
	int k=2;
	
	Map<Integer, Integer>map=new HashMap<>();
	
	for(int i=0;i<arr.length;i++) {
		
		int t1 = arr[i] - k;
        int t2 = arr[i] + k;
        
        if(map.containsKey(t1)) {
        	System.out.println("pair found " +map.get(t1) +" ,"+ i+" values : "+ t1+" "+ arr[i]);
        	return;
        }
        
        if(map.containsKey(t2)) {
        	System.out.println("pair found "+map.get(t2) +" ,"+ i+" values : "+ t2+" "+ arr[i]);
        	return;
        }
       map.put(arr[i], i);
	}
	System.out.println("no pair ");
}
}
