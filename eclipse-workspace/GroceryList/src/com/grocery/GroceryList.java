
package com.grocery;

public class GroceryList {

	public void itemName() {

		System.out.println("The item name is apple");
	}

	public void itemColour() {

		System.out.println("The item colur is red");
	}

	public void itemQuantity() {

		System.out.println("the number of apple to be purhased is 10");
	}

	public static void main(String[] args) {

		GroceryList gl = new GroceryList();

		gl.itemName();
		gl.itemColour();
		gl.itemQuantity();

	}
}