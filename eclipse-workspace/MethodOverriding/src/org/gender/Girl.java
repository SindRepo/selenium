package org.gender;

public class Girl extends Boy {
	
	@Override
	public void boyAge(int age) {
		// TODO Auto-generated method stub
		super.boyAge(age);
		
		System.out.println("girl age is : " +age);
	}
	public static void main(String[] args) {
		
		Girl girl = new Girl();
		
		girl.boyAge(24);
	}

}