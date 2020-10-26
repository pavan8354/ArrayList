package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer , String> capitalmap1 = new HashMap<Integer , String>();		
		
		capitalmap1.put(1, "a");
		capitalmap1.put(2, "b");
		capitalmap1.put(3, "c");
		
		
HashMap<Integer , String> capitalmap2 = new HashMap<Integer , String>();		
		
		capitalmap2.put(3, "c");
		capitalmap2.put(2, "b");
		capitalmap2.put(1, "a");
		
HashMap<Integer , String> capitalmap3 = new HashMap<Integer , String>();		
		
		capitalmap3.put(3, "c");
		capitalmap3.put(2, "b");
		capitalmap3.put(1, "a");
		capitalmap3.put(4, "d");
		
//---------------------------equals---------------------------		
		System.out.println(capitalmap1.equals(capitalmap2));
		System.out.println(capitalmap2.equals(capitalmap3));

		// -----------------key set--------------
		
		System.out.println(capitalmap1.keySet().equals(capitalmap2.keySet()));
		System.out.println(capitalmap2.keySet().equals(capitalmap3.keySet()));
		//--------------------extra key combine the key from both hashmap : hashset--------------------
		
		HashSet<Integer> combinekeys = new HashSet<Integer>(capitalmap1.keySet());
		
		combinekeys.addAll(capitalmap3.keySet());
		
		combinekeys.removeAll(capitalmap1.keySet());
		
		System.out.println(combinekeys);
		
		//------------------compare maps by values------------
		
HashMap<Integer , String> capitalmap5 = new HashMap<Integer , String>();		
		
		capitalmap5.put(1, "a");
		capitalmap5.put(2, "b");
		capitalmap5.put(3, "c");
		
		
HashMap<Integer , String> capitalmap6 = new HashMap<Integer , String>();		
		
		capitalmap6.put(3, "c");
		capitalmap6.put(2, "b");
		capitalmap6.put(1, "a");
		
HashMap<Integer , String> capitalmap7 = new HashMap<Integer , String>();		
		
		capitalmap7.put(3, "c");
		capitalmap7.put(2, "b");
		capitalmap7.put(1, "a");
		capitalmap7.put(4, "d");
		
	System.out.println(new ArrayList<>(capitalmap5.values()).equals(new ArrayList<>(capitalmap6.values())));	
	System.out.println(new ArrayList<>(capitalmap5.values()).equals(new ArrayList<>(capitalmap7.values())));
	
	System.out.println(new HashSet<>(capitalmap5.values()).equals(new HashSet<>(capitalmap6.values())));	
	System.out.println(new HashSet<>(capitalmap5.values()).equals(new HashSet<>(capitalmap7.values())));	
	}

}
