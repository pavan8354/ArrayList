package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapCollections {
	
	
	public static void main(String[] args) {
		
		HashMap<String , String> capitalmap = new HashMap<String , String>();
		
		capitalmap.put("India", "NewDelhi");
		capitalmap.put("USA", "WASHINGTON");
		capitalmap.put("Russia", "Puttin");
		capitalmap.put(null, "delhibg");
		capitalmap.put(null, "sundiy");
		capitalmap.put("Berlin", null);
		
		System.out.println(capitalmap.get("India"));
		System.out.println(capitalmap.get(null));
		System.out.println(capitalmap.get("Berlin"));
		
		
		Iterator<String> it = capitalmap.keySet().iterator();
		
		while(it.hasNext()) {
		String key = it.next();
		String value = capitalmap.get(key);
		
		System.out.println("key=    " + key +"-------->" +"value=   "+value);
		
		Iterator<Entry<String , String>> it1 = capitalmap.entrySet().iterator();
		
		while(it1.hasNext()) {
			
			Entry<String ,String> entry = it1.next();
			
			System.out.println("key   ="+entry.getKey()+ " and value----->"+entry.getValue());
			
			capitalmap.forEach((k,v)->System.out.println("key ="+ k +"value ="+v));
		}
	}
	}
}
