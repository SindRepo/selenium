package org.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Hashset {
	
	public static void main(String[] args) {
		
		Set<Integer> hashset = new TreeSet<>();
		
		System.out.println(hashset);
		
		hashset.add(50);
		hashset.add(500);
		hashset.add(65);
		hashset.add(633);
		hashset.add(566);
		hashset.add(500);
		
		System.err.println(hashset);
		
		boolean add = hashset.add(50);
		
		System.out.println(add);
	}

}

