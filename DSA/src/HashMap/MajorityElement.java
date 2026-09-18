package HashMap;

import java.util.HashMap;
import java.util.Map;

import Arrays.insert;

public class MajorityElement {

	public static void main(String[] args) {
		int arr[]= {2,2,1,3,2,2,1,1};
		
		Map<Integer, Integer> map=new HashMap<>();
		
		for(Integer c:arr) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		int maj=arr.length/2;
	}
}
