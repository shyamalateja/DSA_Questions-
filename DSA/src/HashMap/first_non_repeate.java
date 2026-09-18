package HashMap;
import java.util.HashMap;
import java.util.Map;

import Arrays.sumofarray;

public class first_non_repeate {

	public static void main(String[] args) {
		
		String ch="aasstrrnij";
		Map<Character,Integer> map=new HashMap<>();
		
		for(char c:ch.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(int i=0;i<ch.length();i++) {
			
			if(map.get(ch.charAt(i))==1) {
				System.out.println("index: "+i);
				return;
			}
		}
		System.out.println("no element");
		
	}

}
