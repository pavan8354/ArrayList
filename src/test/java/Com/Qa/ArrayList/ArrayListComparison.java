package Com.Qa.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1 = new ArrayList<String>
		(Arrays.asList("NAVEEN","TOM","peter","LISA","LHGTR","vanisha","ROBERT"));		


		ArrayList<String> list2 = new ArrayList<String>
		(Arrays.asList("NAVEEN","peter","LISA","LHGTR","vanisha","ROBERT"));			


		ArrayList<String> list3 = new ArrayList<String>
		(Arrays.asList("TOM","NAVEEN","peter","LISA","LHGTR","vanisha","ROBERT"));	

		Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);

		System.out.println(list1.equals(list2));
		System.out.println(list1.equals(list3));
		System.out.println(list3.equals(list2));

		ArrayList<String> list4 = new ArrayList<String>
		(Arrays.asList("TOM","NAVEEN","peter","LISA","LHGTR","vanisha","ROBERT"));	

		ArrayList<String> list5 = new ArrayList<String>
		(Arrays.asList("TOM","NAVEEN","peter","LISA","LHGTR","vanisha"));	

		//		
		//		list4.removeAll(list5);
		//		
		//		System.out.println(list4);

		list4.removeAll(list5);

		System.out.println(list4);

		ArrayList<String> list6 = new ArrayList<String>
		(Arrays.asList("TOM","NAVEEN","peter","LISA","LHGTR","vanisha","ROBERT","STEPHEN"));	

		ArrayList<String> list7 = new ArrayList<String>
		(Arrays.asList("TOM","NAVEEN","peter","LISA","LHGTR","NAMIHA"));		

		list6.retainAll(list7);

		System.out.println(list6);
	}

}
