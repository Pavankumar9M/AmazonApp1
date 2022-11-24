package com.ecom.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ecom.base.BaseClass;

public class NewAccountPom extends BaseClass {
	
	public NewAccountPom() {
		
	}
	
	@FindBy(xpath = "//input[@name='cusid']")
	WebElement customerID;
	
	@FindBy(xpath = "//select[@name='selaccount']")
	WebElement accountType;
	
	@FindBy(xpath = "//input[@name='inideposit']")
	WebElement initialDeposit;
	
	@FindBy(xpath = "//input[@name='button2']")
	WebElement submit;

	@FindBy(xpath = "//input[@name='reset']")
	WebElement reset;

}
