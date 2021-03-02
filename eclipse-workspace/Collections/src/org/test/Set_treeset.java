package org.test;

import java.util.Set;
import java.util.TreeSet;

public class Set_treeset {

	public static void main(String[] args) {
		
		Set<Object> characters = new TreeSet<>();
		
		System.out.println(characters);
		
		characters.add('A');
		characters.add('Z');
		characters.add('A');
		characters.add('B');
		characters.add('Z');
		characters.add('F');
		
		System.out.println(characters);
	}
}
