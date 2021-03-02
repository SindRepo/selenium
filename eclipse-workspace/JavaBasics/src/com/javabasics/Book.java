package com.javabasics;

public class Book {

	private int noOfCopies;

	public Book(int noOfCopies) {

		this.noOfCopies = noOfCopies;

	}

	void BookCopies(int noOfCopies) {
		// TODO Auto-generated method stub

		if (noOfCopies > 0) {

			this.noOfCopies = noOfCopies;

		}

		System.out.println(this.noOfCopies);

	}
}
