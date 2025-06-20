package collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hs = new <Integer,String>HashMap();
		hs.put(18, "Virat");
		hs.put(45, "Rohit");
		hs.put(17, "ABD");
		hs.put(333, "Boss");
		
		for(Map.Entry h:hs.entrySet()) {
			System.out.println(h.getKey() + " " + h.getValue());
		}
		System.out.println(hs);
		List<Entry<Integer,String>> l = new ArrayList(hs.entrySet());
		l.sort(Entry.comparingByValue());
		System.out.println(l);
		
		LinkedHashMap<Integer,String> lm = new <Integer,String>LinkedHashMap();
		for(Map.Entry<Integer,String> h:l) {
			lm.put(h.getKey(), h.getValue());
		}
		System.out.println(lm);
	}

}
