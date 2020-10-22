package Com.Qa.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ArrayList<String> ar1 = new ArrayList<String>();
	ar1.add("Rahul");
	ar1.add("Sahul");
	ar1.add("Mahul");
	ar1.add("Tahul");
	
	ArrayList<String> arsi = new ArrayList<String>();
	
	arsi.add("TestNG");
	arsi.add("Devops");
	
////	ar1.addAll(arsi);
//	
//	System.out.println(ar1);
//	
//	ar1.addAll(2, arsi);
//	
//	System.out.println(ar1);
//	
////	ar1.clear();
////	
////	System.out.println(ar1);
	
	ArrayList<String>  clonelist = (ArrayList<String>)ar1.clone();
	
	System.out.println(clonelist);
	
	System.out.println(ar1.contains("Rahul"));
	
	System.out.println(ar1.indexOf("Tahul")>0);
	
	ArrayList<String> arsi1 = new ArrayList<String>(Arrays.asList("NAVEEN","TOM","NAVEEN","LISA","LHGTR","NAVEEN"));
	
	System.out.println(arsi1);
	
	int i = arsi1.lastIndexOf("test");
	
	System.out.println(i);
	
	arsi1.remove(2);
	
	System.out.println(arsi1);
	
	arsi1.remove("TOM");
	
	System.out.println(arsi1);
	
	ArrayList<Integer> arsi2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
	
//	arsi2.removeIf(num->num%2==0);
//	
//	System.out.println(arsi2);
	
	arsi2.removeIf(num2->num2%2==1);
	
	System.out.println(arsi2);
	
	ArrayList<String> arsi3 = new ArrayList<String>(Arrays.asList("NAVEEN","TOM","peter","LISA","LHGTR","vanisha","TOM"));
	
	System.out.println(arsi3);
	
	arsi3.retainAll(Collections.singleton("TOM"));
	
	System.out.println(arsi3);
	
	ArrayList<Integer> arsi4 = new ArrayList<Integer>
										(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));

	ArrayList<Integer> sublist = new ArrayList<Integer>(arsi4.subList(2, 6));
	
	System.out.println(sublist);
	
	ArrayList<String> arsi5 = new ArrayList<String>
	(Arrays.asList("NAVEEN","TOM","peter","LISA","LHGTR","vanisha","ROBERT"));
	
	Object  arr[]  = arsi5.toArray();
	System.out.println(Arrays.toString(arr));
	
	for(Object oo:arr) {
		
		System.out.println((String)oo);
	}

	}

}
