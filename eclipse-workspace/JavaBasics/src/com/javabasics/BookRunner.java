package com.javabasics;

public class BookRunner {

	public static void main(String[] args) {

		Book aocb = new Book(20);
		Book effjava = new Book(10);
		Book cleanCode = new Book(50);

		aocb.BookCopies(-20);
		effjava.BookCopies(10);
		cleanCode.BookCopies(6);

	}

}
