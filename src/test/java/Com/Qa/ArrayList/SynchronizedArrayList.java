package Com.Qa.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
		List<String> nameslist = Collections.synchronizedList(new ArrayList<String>());
		
		nameslist.add("JAVA");
		nameslist.add("Ruby");
		nameslist.add("PYTHON");
		
		System.out.println("----------------Explicit synchronized------------------");
		synchronized (nameslist) {
			
		Iterator<String> it = nameslist.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
			
		}
		
System.out.println("-------------copy on write array list------------------");

CopyOnWriteArrayList<String> emplist = new CopyOnWriteArrayList<String>();

emplist.add("Tom");
emplist.add("Naveen");
emplist.add("Seven");

System.out.println("-----------we dont need any explicit synchronization for any operation : add/remove/traverse-----------");

Iterator<String> it = emplist.iterator();

while(it.hasNext()) {
	
	System.out.println(it.next());
}
		

	}
	
}
