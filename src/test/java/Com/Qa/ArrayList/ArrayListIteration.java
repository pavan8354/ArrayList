package Com.Qa.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> studentlist = new ArrayList<String>();
		
		studentlist.add("Ram"); //0
		studentlist.add("Sam");// 1
		studentlist.add("Tam"); //2
		studentlist.add("dam"); // 3
		
		for(int i=0;i<studentlist.size();i++) {
			
			System.out.println(studentlist.get(i));
		}
		
	System.out.println("-------------------for each-----------------");	
		for(String student: studentlist ) {
			
			System.out.println(student);
		}
		System.out.println("-------------------lambda-----------------");		
		
		studentlist.stream().forEach(ele->System.out.println(ele));
		
		System.out.println("-------------------Iterator-----------------");			
		
		Iterator<String> itlist = studentlist.iterator();
		
		while(itlist.hasNext()) {
			
			System.out.println(itlist.next());
		}
	}
	
}
