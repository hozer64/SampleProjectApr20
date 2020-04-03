package SaturdayDec14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class exercise {


	public static void main(String[] args) {

		HashMap<String, String> emails = new HashMap<>();

		emails.put("acturk@gmail.com", "12345");
		emails.put("aturk@gmail.com", "12345");
		emails.put("hll@gmail.com", "12345");
		emails.put("ozer@gmail", "12345");

		System.out.println(emails);

		Set set1 = emails.entrySet();

		Iterator iterator = set1.iterator();
		while (iterator.hasNext()) {
			HashMap.Entry entry = (HashMap.Entry) iterator.next();
			System.out.println("key:" + entry.getKey());
			System.out.println("Value" + entry.getValue());
		}

		for (Map.Entry entry : emails.entrySet()) {
			System.out.println("key:" + entry.getKey() + "\n" + "value:" + entry.getValue());
		}

		int[] stack = { 10, 20, 30 };

		int size = 3;

		int idx = 0;

		do {
			idx++;
		}
		while (idx < size - 1);

		System.out.println(stack);


		int x = 100;

		int a = x++;

		int b = ++x;

		int c = ++x;

		int d = (a < b) ? (a < c) ? b : c : x;

		System.out.println(d);

	}

}
