import java.util.HashMap;
import java.util.Map.Entry;

public class InsertInHashMap {
	
	public static void main(String[] args) {
		
		
		String K = "asdasnsdvl";
		String N = "ssnad";
		char[] Narr = N.toCharArray();
		
		
		HashMap<Character,Integer> hmap =  new HashMap<Character, Integer>();
		for (char n:Narr) {
			
			if (K.contains(Character.toString(n))) {
				if(hmap.containsKey(n)) {
					
					hmap.put(n, hmap.get(n)+1);	
				}
					
			else {			
				hmap.put(n, 1);
			}
		}
		}
		for(Entry<Character, Integer> entry: hmap.entrySet()) {
			
			System.out.println(entry.getKey()+" :" +entry.getValue());
		}
		
	}

}
		