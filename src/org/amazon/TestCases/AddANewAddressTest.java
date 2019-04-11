package org.amazon.TestCases;

import org.amazon.POM.Locators;
import org.amazon.POM.LoginPage;
import org.amazon.generic.ActionMethods;
import org.amazon.generic.Excel;
import org.amazon.generic.WaitStatement;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.pattern.PropertiesPatternConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class AddANewAddressTest 
{
	
	static String  common;
	
	public static void main(String[] args)
	{
		// Creating logger instance
		Logger log = Logger.getLogger("AddANewAddressTest");
		//initializing the log4j.properties 
		PropertyConfigurator.configure("./log4j.properties");
		
		//inilializing the chrome driver
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		//launching chrome
		WebDriver driver=new ChromeDriver();
		log.info("Chrome launched");
		
		driver.get("http://www.amazon.com/");
		log.info("amazon.com opened");	
		
		driver.manage().window().maximize();
		log.info("window get maximized");
		
		// creating the instance of  locators class so that we can use the locator.
		Locators locators = new Locators(driver);
		
		
		// taking data from excel
		String email = Excel.fnGetData("LoginData", 1, 0);
		String password = Excel.fnGetData("LoginData", 1, 1);
		String firstName = Excel.fnGetData("LoginData", 1, 2);
		String fullName = Excel.fnGetData("AddAddress", 1, 0);
		String addressLineOne=Excel.fnGetData("AddAddress", 1, 1);
		String city=Excel.fnGetData("AddAddress", 1, 2);
		String state = Excel.fnGetData("AddAddress", 1, 3);
		String zipCode=Excel.fnGetData("AddAddress", 1, 4);
		String phoneNumber=Excel.fnGetData("AddAddress", 1, 5);
		
		
		WaitStatement.fnExplicitWait(driver,30, locators.HelloSignInButton);
		locators.HelloSignInButton.click();
		log.info("clicked on hello sign in button");
		
		WaitStatement.fnExplicitWait(driver,30, locators.header_signInPage);
		common = "Sign in";
		if(locators.header_signInPage.getText().contains(common))
		{
			log.info("user is on signin page");
		}
		else
		{
		log.error("user is not on sign in page");	
		}
		WaitStatement.fnExplicitWait(driver,30, locators.login_EmailTextBox_signInPage);
		locators.login_EmailTextBox_signInPage.sendKeys(email);
		log.info("enter the email address");
		
		WaitStatement.fnExplicitWait(driver,30, locators.login_PasswordTextBox_signInPage);
		locators.login_PasswordTextBox_signInPage.sendKeys(password);
		log.info("enter the password");
		
		WaitStatement.fnExplicitWaitIsClickable(driver,30, locators.login_SignInButton_signInPage);
		locators.login_SignInButton_signInPage.click();
		log.info("click on sign in button");
		
		WaitStatement.fnExplicitWait(driver,30, locators.HelloSignInButton);
		if(locators.HelloSignInButton.getText().contains(firstName))
		{
			log.info("User in on home page");
		}
		else
		{
			log.error("user is not on the home page");
		}
				
		WaitStatement.fnExplicitWait(driver,30, locators.HelloSignInButton);
		ActionMethods.mouseHover(driver, locators.HelloSignInButton);
		log.info("moved the mouse to hello sign in button");
		
		WaitStatement.fnExplicitWaitIsClickable(driver,30, locators.HelloSignInButton);
		locators.link_YourAccount_HomePage.click();
		log.info("clicked on your account link");
		
		WaitStatement.fnExplicitWait(driver,30, locators.header_YourAccountPage);
		common ="Your Account";
		if(locators.header_YourAccountPage.getText().contains(common))
		{
			log.info("user is on your account page");
		}
		else
		{
			log.error("user is not on your account page");
		}
		
		WaitStatement.fnExplicitWait(driver, 30, locators.button_YourAddresses_YourAccountPage);
		locators.button_YourAddresses_YourAccountPage.click();
		log.info("clicked on your address button");
		
		WaitStatement.fnExplicitWait(driver,30, locators.header_YourAddressPage);
		common ="Your Addresses";
		if(locators.header_YourAddressPage.getText().contains(common))
		{
			log.info("user is on your address page");
		}
		else
		{
			log.error("user is not on your address page");
		}
		
		WaitStatement.fnExplicitWait(driver, 30, locators.button_AddNewAddress_YourAddressPage);
		locators.button_AddNewAddress_YourAddressPage.click();
		log.info("clicked on add new address button");
		

		WaitStatement.fnExplicitWait(driver,30, locators.header_AddNewAddressPage);
		common ="Add a new address";
		if(locators.header_AddNewAddressPage.getText().contains(common))
		{
			log.info("user is on add new address page");
		}
		else
		{
			log.error("user is not on add new address page");
		}
		
		WaitStatement.fnExplicitWait(driver,30, locators.FullName_TextBox_AddNewAddressPage);
		locators.FullName_TextBox_AddNewAddressPage.sendKeys(fullName);
		locators.AddressLine1_TextBox_AddNewAddressPage.sendKeys(addressLineOne);
		locators.CityName_TextBox_AddNewAddressPage.sendKeys(city);
		locators.StateName_TextBox_AddNewAddressPage.sendKeys(state);
		locators.zipCode_TextBox_AddNewAddressPage.sendKeys(zipCode);
		locators.PhoneNumber_TextBox_AddNewAddressPage.sendKeys(phoneNumber);
		log.info("entered the all the mandatory fields");
		
		WaitStatement.fnExplicitWait(driver, 30, locators.addAddress_button_AddNewAddressPage);
		locators.addAddress_button_AddNewAddressPage.click();
		log.info("clicked on add address button");
	}
	

}
