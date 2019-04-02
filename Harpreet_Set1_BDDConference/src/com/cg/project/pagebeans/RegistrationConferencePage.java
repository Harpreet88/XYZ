package com.cg.project.pagebeans;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationConferencePage {
	WebDriver driver;
	public RegistrationConferencePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	//elements of form
	
	/*********Locating Elements*********/
	@FindBy(xpath= ".//*[@id='txtFirstName']")
	@CacheLookup
	WebElement firstName;
	@FindBy(xpath= ".//*[@id='txtLastName']")
	@CacheLookup
	WebElement lastName;
	@FindBy(xpath= ".//*[@id='txtEmail']")
	@CacheLookup
	WebElement email;
	@FindBy(xpath= ".//*[@id='txtPhone']")
	@CacheLookup
	WebElement contactNo;
	@FindBy(name= "size")
	@CacheLookup
	WebElement NoOfPeopleAttending;
	@FindBy(xpath= ".//*[@id='txtAddress1']")
	@CacheLookup()
	WebElement buildNameRoomNo;
	@FindBy(xpath= ".//*[@id='txtAddress2']")
	@CacheLookup
	WebElement AreaName;
	@FindBy(name= "city")
	@CacheLookup
	WebElement City;
	@FindBy(name= "state")
	@CacheLookup
	WebElement State;
	@FindBy(name= "memberStatus")
	@CacheLookup
	List<WebElement> MembershipStatus;
	@FindBy(linkText= "Next")
	@CacheLookup
	WebElement Submit;
	
	//for payment elements are
	
	@FindBy(xpath= ".//*[@id='txtCardholderName']")
	@CacheLookup
	WebElement CardHolderName;
	@FindBy(xpath= ".//*[@id='txtDebit']")
	@CacheLookup
	WebElement CardNumber;
	@FindBy(xpath= ".//*[@id='txtCvv']")
	@CacheLookup
	WebElement Cvv;
	@FindBy(xpath= ".//*[@id='txtMonth']")
	@CacheLookup
	WebElement ExpMonth;
	@FindBy(xpath= ".//*[@id='txtYear']")
	@CacheLookup
	WebElement ExpYear;
	@FindBy(xpath= ".//*[@id='btnPayment']")
	@CacheLookup
	WebElement MakePayment;
	

	//Getter setters for the elements
	
	
	public WebElement getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	public WebElement getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	public WebElement getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo.sendKeys(contactNo);
	}
	public WebElement getNoOfPeopleAttending() {
		return NoOfPeopleAttending;
	}
	public void setNoOfPeopleAttending(String noOfPeopleAttending) {
		NoOfPeopleAttending.sendKeys(noOfPeopleAttending);
	}
	public WebElement getBuildNameRoomNo() {
		return buildNameRoomNo;
	}
	public void setBuildNameRoomNo(String buildNameRoomNo) {
		this.buildNameRoomNo.sendKeys(buildNameRoomNo);
	}
	public WebElement getAreaName() {
		return AreaName;
	}
	public void setAreaName(String sAreaName) {
		this.AreaName.sendKeys(sAreaName);
	}
	public WebElement getCity() {
		return City;
	}
	public void setCity(String sCity) {
		Select drpCity= new Select(City);
		drpCity.selectByVisibleText(sCity);
	}
	public WebElement getState() {
		return State;
	}
	public void setState(String sState) {
		new Select(State).selectByVisibleText(sState);
	}
	public List<WebElement> getMembershipStatus() {
		return MembershipStatus;
	}
	public void setMembershipStatus(String str) {
		for (WebElement webElement : MembershipStatus) {
			if(webElement.getAttribute("value").equals(str))
				webElement.click();
		}
	}
	public WebElement getSubmit() {
		return Submit;
	}
	public void setSubmit() {
		Submit.click();
	}
	
	// Payment getter settres
	
	public WebElement getCardHolderName() {
		return CardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		CardHolderName.sendKeys(cardHolderName);
	}
	public WebElement getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(String cardNumber) {
		CardNumber.sendKeys(cardNumber);
	}
	public WebElement getCvv() {
		return Cvv;
	}
	public void setCvv(String cvv) {
		Cvv.sendKeys(cvv);
	}
	public WebElement getExpMonth() {
		return ExpMonth;
	}
	public void setExpMonth(String expMonth) {
		ExpMonth.sendKeys(expMonth);
	}
	public WebElement getExpYear() {
		return ExpYear;
	}
	public void setExpYear(String expYear) {
		ExpYear.sendKeys(expYear);
	}
	public WebElement getMakePayment() {
		return MakePayment;
	}
	public void setMakePayment(WebElement makePayment) {
		MakePayment = makePayment;
	}
	
	
	
	
	
}
