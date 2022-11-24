package com.ecom.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ecom.base.BaseClass;

public class EditCustomerPom extends BaseClass {
	
	public EditCustomerPom() {
		
	}
	
	@FindBy(xpath = "//label[@id='message14']")
	WebElement customerID;
	
	@FindBy(xpath = "//input[@name='AccSubmit']")
	WebElement submit;

	@FindBy(xpath = "//input[@name='res']")
	WebElement reset;

}
