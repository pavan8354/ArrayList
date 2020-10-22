package Com.Qa.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class virtualcapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ArrayList<Object> ar = new ArrayList<Object>(20);
	System.out.println(ar.size());
	ar.add(100);
	System.out.println(ar.size());
	ar.add(200);
	ar.add(300);
	ar.add(400);
	System.out.println(ar.size());
	
	ArrayList<Integer> arsi = new ArrayList<Integer>(Arrays.asList(100,200,300,400));
	
	System.out.println(arsi);
	
ArrayList<String> arsi1 = new ArrayList<String>(Arrays.asList("RAHUL","sAHUL","tAHUL","dAHUL"));
	
	System.out.println(arsi1);
	System.out.println(arsi1.size());

	}

}
