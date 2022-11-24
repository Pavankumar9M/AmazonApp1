package com.ecom.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ecom.base.BaseClass;

public class DeleteCustomerPom extends BaseClass {
	
	public DeleteCustomerPom() {
		
	}
	
	@FindBy(xpath = "//input[@name='cusid']")
	WebElement customerID;
	
	@FindBy(xpath = "//input[@name='AccSubmit']")
	WebElement submit;

	@FindBy(xpath = "//input[@name='res']")
	WebElement reset;

}
