package Com.Qa.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,1,2,9,10,11,1,12));

		System.out.println("------------LINKED HASH SET--------------------");

		LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<Integer>(numbers);

		ArrayList<Integer> withoutduplicatenumbers = new ArrayList<Integer>(linkedhashset);

		System.out.println(withoutduplicatenumbers);
		
		System.out.println("------------JAVA 8 STREAM--------------------");
		ArrayList<Integer> markslist = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,1,2,9,10,11,1,12));	
		
		List<Integer> list =markslist.stream().distinct().collect(Collectors.toList());
		
		System.out.println(list);
	}

}
