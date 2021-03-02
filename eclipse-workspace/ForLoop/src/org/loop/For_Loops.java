package org.loop;

public class For_Loops {

	private int i;

	public For_Loops(int j) {
		// TODO Auto-generated constructor stub
	}

	public void printCubeUptoLimit() {
		// TODO Auto-generated method stub
		
		int i = 1;

		while (i * i * i < 50) {

			System.out.println(" " + i * i* i);

			i++;

		}

	}

	public static void main(String[] args) {

		For_Loops number = new For_Loops(50);
		
		number.printCubeUptoLimit();

	}
}
