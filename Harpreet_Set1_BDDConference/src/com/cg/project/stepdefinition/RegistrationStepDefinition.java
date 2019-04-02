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

public class RegistrationStepDefinition {
	
	
	private WebDriver driver;
	private RegistrationConferencePage regPage;

	@Before
	public void openBrowsser() {
		String driverPath = "D:\\BDD_CucumberSelenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		regPage = new RegistrationConferencePage(driver);
		driver.get("D:\\BDD_CucumberSelenium\\Set B\\ConferenceRegistartion.html");
	}

	//Method for handling alert message
	public void callAlert() throws InterruptedException {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("TestCase :4\n****** " + alertMessage);
		driver.close();
	}

	@Given("^user is on registeration page$")
	public void user_is_on_registeration_page() throws Throwable {
		openBrowsser();
	}

	@Then("^check the title of that page$")
	public void check_the_title_of_that_page() throws Throwable {
		if(driver.getTitle().equals("Conference Registartion")) 
			System.out.println("TestCase :1\n**** Title Matched");
		else
			System.out.println("**** Title Not Matched");
	}

	@When("^user leaves first name field empty and submits$")
	public void user_leaves_first_name_field_empty_and_submits() throws Throwable {
		regPage.setFirstName("");
		regPage.setSubmit();
	}

	@Then("^display alert box with message 'Please fill the first Name'$")
	public void display_alert_box_with_message_Please_fill_the_first_Name() throws Throwable {
		callAlert();
	}

	@When("^user leaves last name field empty and submits$")
	public void user_leaves_last_name_field_empty_and_submits() throws Throwable {
		regPage.setFirstName("Harpreet");
		regPage.setLastName("");
		regPage.setSubmit();
	}

	@Then("^display alert box with message 'Please fill the Last Name'$")
	public void display_alert_box_with_message_Please_fill_the_Last_Name() throws Throwable {
		callAlert();
	}

	@When("^user leaves email field empty and submits$")
	public void user_leaves_email_field_empty_and_submits() throws Throwable {
		regPage.setFirstName("Harpreet");
		regPage.setLastName("saini");
		regPage.setEmail("");
		regPage.setSubmit();
	}

	@Then("^display alert box with message 'Please fill the Email'$")
	public void display_alert_box_with_message_Please_fill_the_Email() throws Throwable {
		callAlert();
	}

	@Given("^user is on the registeration page$")
	public void user_is_on_the_registeration_page() throws Throwable {
	    
	}

	@When("^user enters wrong email format and submits$")
	public void user_enters_wrong_email_format_and_submits() throws Throwable {
		regPage.setFirstName("Harpreet");
		regPage.setLastName("saini");
		regPage.setEmail("harrygmailcom");
		regPage.setSubmit();
	}

	@When("^user leaves contact number blank and submits$")
	public void user_leaves_contact_number_blank_and_submits() throws Throwable {
		regPage.setFirstName("Harpreet");
		regPage.setLastName("Saini");
		regPage.setEmail("Harpreet@gmail.com");
		regPage.setContactNo("");
		regPage.setSubmit();
	}

	@Then("^display alert box with message 'Please fill the Contact No'$")
	public void display_alert_box_with_message_Please_fill_the_Contact_No() throws Throwable {
		callAlert();
	}

	@When("^user enters invalid contact no format and submits$")
	public void user_enters_invalid_contact_no_format_and_submits() throws Throwable {
		regPage.setFirstName("Harpreet");
		regPage.setLastName("Saini");
		regPage.setEmail("Harpreet@gmail.com");
		regPage.setContactNo("999995");
		regPage.setSubmit();
	}

	@Then("^display alert box with message 'Please enter valid Contact no'$")
	public void display_alert_box_with_message_Please_enter_valid_Contact_no() throws Throwable {
		callAlert();}

	@When("^user leaves number of people attending blank and submits$")
	public void user_leaves_number_of_people_attending_blank_and_submits() throws Throwable {
		regPage.setFirstName("Harpreet");
		regPage.setLastName("Saini");
		regPage.setEmail("Harpreet@gmail.com");
		regPage.setContactNo("9998888999");
		regPage.setNoOfPeopleAttending("");
		regPage.setSubmit();
	}

	@Then("^display alert box with message 'Number of people attending'$")
	public void display_alert_box_with_message_Number_of_people_attending() throws Throwable {
		callAlert();
	}

	@When("^user leaves building and room no blank and submits$")
	public void user_leaves_building_and_room_no_blank_and_submits() throws Throwable {
		regPage.setFirstName("Harpreet");
		regPage.setLastName("Saini");
		regPage.setEmail("Harpreet@gmail.com");
		regPage.setContactNo("9998888999");
		regPage.setNoOfPeopleAttending("2");
		regPage.setBuildNameRoomNo("");
		regPage.setSubmit();
	}

	@Then("^display alert box with message 'Please fill the Building & Room No'$")
	public void display_alert_box_with_message_Please_fill_the_Building_Room_No() throws Throwable {
		callAlert();
	}

	@When("^user leaves area name blank and submits$")
	public void user_leaves_area_name_blank_and_submits() throws Throwable {
		regPage.setFirstName("Harpreet");
		regPage.setLastName("Saini");
		regPage.setEmail("Harpreet@gmail.com");
		regPage.setContactNo("9998888999");
		regPage.setNoOfPeopleAttending("2");
		regPage.setBuildNameRoomNo("B No 51, R No 45");
		regPage.setAreaName("");
		regPage.setSubmit();
	}

	@Then("^display alert box with message 'Please fill the Area name'$")
	public void display_alert_box_with_message_Please_fill_the_Area_name() throws Throwable {
		callAlert();
	}

	@When("^user leaves city name blank and submits$")
	public void user_leaves_city_name_blank_and_submits() throws Throwable {
		regPage.setFirstName("Harpreet");
		regPage.setLastName("Saini");
		regPage.setEmail("Harpreet@gmail.com");
		regPage.setContactNo("9998888999");
		regPage.setNoOfPeopleAttending("2");
		regPage.setBuildNameRoomNo("B No 51, R No 45");
		regPage.setAreaName("Marine Drive");
		regPage.setCity("");
		regPage.setSubmit();
	}

	@Then("^display alert box with message 'Please select city'$")
	public void display_alert_box_with_message_Please_select_city() throws Throwable {
		callAlert();
	}

	@When("^user leaves state column blank and submits$")
	public void user_leaves_state_column_blank_and_submits() throws Throwable {
		regPage.setFirstName("Harpreet");
		regPage.setLastName("Saini");
		regPage.setEmail("Harpreet@gmail.com");
		regPage.setContactNo("9998888999");
		regPage.setNoOfPeopleAttending("2");
		regPage.setBuildNameRoomNo("B No 51, R No 45");
		regPage.setAreaName("Marine Drive");
		regPage.setCity("Pune");
		regPage.setState("");
		regPage.setSubmit();
	}

	@Then("^display alert box with message 'Please select state'$")
	public void display_alert_box_with_message_Please_select_state() throws Throwable {
		callAlert();
	}

	@When("^user leaves membership status blank and submits$")
	public void user_leaves_membership_status_blank_and_submits() throws Throwable {
		regPage.setFirstName("Harpreet");
		regPage.setLastName("Saini");
		regPage.setEmail("Harpreet@gmail.com");
		regPage.setContactNo("9998888999");
		regPage.setNoOfPeopleAttending("2");
		regPage.setBuildNameRoomNo("B No 51, R No 45");
		regPage.setAreaName("Marine Drive");
		regPage.setCity("Pune");
		regPage.setState("Maharashtra");
		regPage.setSubmit();
	}

	@Then("^display alert box with message 'Please select Membership status'$")
	public void display_alert_box_with_message_Please_select_Membership_status() throws Throwable {
		callAlert();
	}

	@When("^user enters all valid data and submits$")
	public void user_enters_all_valid_data_and_submits() throws Throwable {
		regPage.setFirstName("Harpreet");
		regPage.setLastName("Saini");
		regPage.setEmail("Harpreet@gmail.com");
		regPage.setContactNo("9998888999");
		regPage.setNoOfPeopleAttending("2");
		regPage.setBuildNameRoomNo("B No 51, R No 45");
		regPage.setAreaName("Marine Drive");
		regPage.setState("Maharashtra");
		regPage.setSubmit();
	}

	@Then("^display alert box with registration success message$")
	public void display_alert_box_with_registration_success_message() throws Throwable {
		callAlert();
	}

	@Then("^navigate to payment page$")
	public void navigate_to_payment_page() throws Throwable {
		driver.navigate().to("D:\\BDD_CucumberSelenium\\Set B\\PaymentDetails.html\"");

	}

	@After
	public void closeBrowser() {
		/* driver.switchTo().alert().dismiss(); */
		driver.quit();
	}
}
