package org.test;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Repeated_Occurences {

	public static void main(String[] args) {

		String sentence = "For the people by the people of the people";

		String[] words = sentence.split(" ");

		Map<String, Integer> occurences = new HashMap<>();

		for (String kword : words) {

			Integer integer = occurences.get(kword);
			System.out.println(integer);
			System.out.println(kword);

			if (integer == null) {

				occurences.put(kword, 1);
				System.out.println(integer);

			}

			else {

				occurences.put(kword, integer + 1);

			}

		}

		System.out.println(occurences);

	}


}
 