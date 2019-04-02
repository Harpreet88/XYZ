package com.cg.project.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cg.project.pagebeans.RegistrationConferencePage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaymentStepDefinition 
{
	private WebDriver driver;
private RegistrationConferencePage regPage;

@Before
public void openBrowsser() {
	String driverPath = "D:\\BDD_CucumberSelenium\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);	
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	regPage = new RegistrationConferencePage(driver);

	driver.get("D:\\BDD_CucumberSelenium\\Set B\\PaymentDetails.html");
}

//Method for handling alert message
public void callAlert() throws InterruptedException {
	String alertMessage = driver.switchTo().alert().getText();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	System.out.println("TestCase :4\n****** " + alertMessage);
	driver.close();
}

@Given("^user is on the payment page$")
public void user_is_on_the_payment_page() throws Throwable {
	openBrowsser();
}

@Then("^check the title of the payment page$")
public void check_the_title_of_the_payment_page() throws Throwable {
	if(driver.getTitle().equals("Payment Details")) 
		System.out.println("TestCase :1\n**** Title Matched");
	else
		System.out.println("**** Title Not Matched");
}

//Blank CardHolder Name
@When("^user leaves CardHolder Name blank and clicks on Make Payment$")
public void user_leaves_CardHolder_Name_blank_and_clicks_on_Make_Payment() throws Throwable {
	regPage.setCardHolderName("");
	regPage.getMakePayment();
}

@Then("^display alert box with CardHolder Name empty message$")
public void display_alert_box_with_CardHolder_Name_empty_message() throws Throwable {
	callAlert();
}

//Blank DebitCard Number
@When("^user leaves DebitCard Number blank and clicks on Make Payment$")
public void user_leaves_DebitCard_Number_blank_and_clicks_on_Make_Payment() throws Throwable {
	regPage.setCardHolderName("Harpreet Saini");
	regPage.setCardNumber("");
	regPage.getMakePayment();
}

@Then("^display alert box with DebitCard Number empty message$")
public void display_alert_box_with_DebitCard_Number_empty_message() throws Throwable {
	callAlert();
}

//Blank Expiration month
@When("^user leaves Expiration Month blank and clicks on Make Payment$")
public void user_leaves_Expiration_Month_blank_and_clicks_on_Make_Payment() throws Throwable {
	regPage.setCardHolderName("Harpreet Saini");
	regPage.setCardNumber("14234567899874");
	regPage.setCvv("333");
	regPage.setExpMonth("");
	regPage.getMakePayment();
}

@Then("^display alert box with Expiration Month empty message$")
public void display_alert_box_with_Expiration_Month_empty_message() throws Throwable {
	callAlert();
}

//blank expiration year
@When("^user leaves Expiration Year blank and clicks on Make Payment$")
public void user_leaves_Expiration_Year_blank_and_clicks_on_Make_Payment() throws Throwable {
	regPage.setCardHolderName("Harpreet Saini");
	regPage.setCardNumber("14234567899874");
	regPage.setCvv("333");
	regPage.setExpMonth("12");
	regPage.setExpYear("");
	regPage.getMakePayment();
}

@Then("^display alert box with Expiration Year empty message$")
public void display_alert_box_with_Expiration_Year_empty_message() throws Throwable {
	callAlert();
}

//user enters all valid data and success alert message comes
@When("^user enters valid details and clicks on Make Payment$")
public void user_enters_valid_details_and_clicks_on_Make_Payment() throws Throwable {
	regPage.setCardHolderName("Harpreet Saini");
	regPage.setCardNumber("14234567899874");
	regPage.setCvv("333");
	regPage.setExpMonth("12");
	regPage.setExpYear("30");
	regPage.getMakePayment();
}

@Then("^display alert box with payment success message$")
public void display_alert_box_with_payment_success_message() throws Throwable {
	callAlert();
}

@After
public void closeBrowser() {
	driver.quit();
}
}


