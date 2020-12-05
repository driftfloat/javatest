package base.map;

import java.util.HashMap;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();
		System.out.println(map.size());
		map.put("1", 11);
		System.out.println(map.hashCode());
//		map.entrySet()
		
		
	}

}
