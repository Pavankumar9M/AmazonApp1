package com.ecom.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ecom.base.BaseClass;

public class CustomisedStatementPom extends BaseClass {
	
	public CustomisedStatementPom() {
		
	}

	@FindBy(xpath = "//input[@name='accountno']")
	WebElement accountNum;
	
	@FindBy(xpath = "//input[@name='fdate']")
	WebElement fromDate;
	
	@FindBy(xpath = "//input[@name='tdate']")
	WebElement toDate;
	
	@FindBy(xpath = "//input[@name='loweramt']")
	WebElement amountLowerLimit;
	
	@FindBy(xpath = "//input[@name='tranno']")
	WebElement numOfTransaction;
	
	@FindBy(xpath = "//input[@name='AccSubmit']")
	WebElement submit;

	@FindBy(xpath = "//input[@name='res']")
	WebElement reset;
}
