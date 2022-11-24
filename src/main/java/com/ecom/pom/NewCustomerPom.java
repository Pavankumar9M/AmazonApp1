package com.ecom.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ecom.base.BaseClass;

public class NewCustomerPom extends BaseClass {
	
	public NewCustomerPom() {
		
	}
	
	@FindBy(xpath = "//input[@name='name']")
	WebElement customerName;
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	WebElement genderMale;
	
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	WebElement genderFemale;
	
	@FindBy(xpath = "//input[@name='dob']")
	WebElement dateOfBirth;
	
	@FindBy(xpath = "//textarea[@name='addr']")
	WebElement address;
	
	@FindBy(xpath = "//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath = "//input[@name='state']")
	WebElement state;
	
	@FindBy(xpath = "//input[@name='pinno']")
	WebElement pin;
	
	@FindBy(xpath = "//input[@name='telephoneno']")
	WebElement telephoneNum;
	
	@FindBy(xpath = "//input[@name='emailid']")
	WebElement email;
	
	@FindBy(xpath = "//input[@name='sub']")
	WebElement submit;

	@FindBy(xpath = "//input[@name='res']")
	WebElement reset;
}

