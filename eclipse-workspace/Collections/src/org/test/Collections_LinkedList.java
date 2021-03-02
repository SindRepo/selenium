package org.test;

import java.util.LinkedList;
import java.util.List;

public class Collections_LinkedList {
	
	public static void main(String[] args) {
		
		List<Integer> linkedlist = new LinkedList<Integer>();
		
		linkedlist.add(50);
		linkedlist.add(60);
		linkedlist.add(10);
		linkedlist.add(300);
		
		System.out.println(linkedlist);
		
		linkedlist.add(2, 55);
		
		System.out.println(linkedlist);
		
		linkedlist.add(200);
		
		System.out.println(linkedlist);
		
		boolean contains = linkedlist.contains(10);
		System.err.println(contains);
		
		
		Integer integer = linkedlist.get(0);
		System.out.println(integer);
	}

}
