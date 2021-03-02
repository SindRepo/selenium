package org.lang;

public class StateDetails {

	public void southIndia() {

		System.out.println("The state is south india");
	}

	public void northIndia()

	{

		System.out.println("The state is North India");
	}

	public static void main(String[] args) {

		StateDetails sd = new StateDetails();
		LanguageInfo li = new LanguageInfo();

		sd.northIndia();
		sd.southIndia();
		li.tamilLanguage();
		li.englishLanguage();
		li.hindiLanguage();
		
	}

	

}
