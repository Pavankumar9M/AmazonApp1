package com.ecom.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ecom.base.BaseClass;

public class EditAccountPom extends BaseClass {
	
	public EditAccountPom() {
		
	}

	@FindBy(xpath = "//label[@id='message2']")
	WebElement accountNum;
	
	@FindBy(xpath = "//input[@name='AccSubmit']")
	WebElement submit;

	@FindBy(xpath = "//input[@name='res']")
	WebElement reset;
}
