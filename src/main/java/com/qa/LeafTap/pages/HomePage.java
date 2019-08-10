package com.qa.LeafTap.pages;

import com.qa.LeafTap.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	
	public HomePage() { // Page factory code
	}

	public LoginPage clickLogout() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new LoginPage();
	}

}
