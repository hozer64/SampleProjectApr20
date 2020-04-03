package SaturdayDec14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class CollectExample {


	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("veli");
		list.add("deli");
		list.add("ahmet");
		list.add("merve");
		list.add("hasan");

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}

		System.out.println("          ");
		System.out.println("Itetator printing method");

		Iterator<String> list2 = list.iterator();
		while (list2.hasNext()) {
			System.out.println(list2.next());

		}

		LinkedList<String> list3 = new LinkedList<String>();

		list3.add("veli");
		list3.add("deli");
		list3.add("ahmet");
		list3.add("merve");
		list3.add("hasan");


		Iterator<String> list4 = list.iterator();
		while (list4.hasNext()) {
			System.out.println(list4.next());
		}

		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Ahmet");
		hashSet.add("Hasan");
		hashSet.add("Murat");
		hashSet.add("Can");
		hashSet.add("Abdullah");

		String s = "";
		Iterator<String> x = hashSet.iterator();
		while (x.hasNext()) {
			System.out.println(x.next() + " ");
		}
		x = hashSet.iterator();
		String k = "";
		while (x.hasNext()) {
			k = x.next();
			k = k + " ";
			s = s + k;
		}
		
		System.out.println(s);
		
		
		String name[]= {
		
		new String("sang"),
		new String("Shin"),
		new String("Boston"),
		new String ("shin"),		
				
		};
		
		
		// Create HashSet object instance and
    	// assign it to a variable of Set type.
        Set s1 = new HashSet();
        boolean b1;
		for (String element : name) {

			b1 = !s1.add(element);
        	if (b1) {
				System.out.println("Duplicate detected: "+element);
			}
    	System.out.println(s1.size()+" distinct words detected: "+s1);
    	
	}

		
		
		
		
		
		
		
		

	}

}
