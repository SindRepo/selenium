package org.gender;

public class Boy {
	
	public void boyAge(int age) {
		
		System.out.println("Boy age is: " +age);
	}
	
	public static void main(String[] args) {
		
		Boy boy = new Boy();
		
		boy.boyAge(10);
	}

}
