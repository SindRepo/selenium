package org.test;

import java.util.ArrayList;
import java.util.List;

public class Collection_List {

	public static void main(String[] args) {

		List<Object> arraylist = new ArrayList<>();

		arraylist.add("Pragya");
		arraylist.add("Sindhu");
		arraylist.add("Ayyappan");

		System.out.println(arraylist);

		arraylist.add(1, "Vedhu");
		System.out.println(arraylist);

		arraylist.clear();
		System.out.println(arraylist);
		
		arraylist.get("Sindhu");
		System.out.println(arraylist);
		
	}
}
