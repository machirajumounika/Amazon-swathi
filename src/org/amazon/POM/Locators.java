package org.amazon.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators 
{
	@FindBy(xpath="//span[contains(text(),'Hello')]")
	public WebElement HelloSignInButton;
	
	@FindBy(xpath="//h1[contains(text(),'Sign in')]")
	public WebElement header_signInPage;
	
	@FindBy(id="ap_email")
	public WebElement login_EmailTextBox_signInPage;
	
	@FindBy(id="ap_password")
	public WebElement login_PasswordTextBox_signInPage;
	
	@FindBy(id="signInSubmit")
	public WebElement login_SignInButton_signInPage;
	
	@FindBy(linkText="Your Account")
	public WebElement link_YourAccount_HomePage;
	
	@FindBy(xpath="//h1[contains(text(),'Your Account')]")
	public WebElement header_YourAccountPage;
	
	@FindBy(xpath="//div[@data-card-identifier='Addresses']")
	public WebElement button_YourAddresses_YourAccountPage;
	
	
	@FindBy(xpath="//div[@data-card-identifier='PaymentOptions']")
	public WebElement button_PaymentOptions_YourAccountPage;
	
	@FindBy(xpath="//h1[contains(text(),'Your Address')]")
	public WebElement header_YourAddressPage;
	
	@FindBy(xpath="//div[contains(@class,'first-desktop-address')]")
	public WebElement button_AddNewAddress_YourAddressPage;
	
	@FindBy(xpath="//h2[contains(text(),'Add a new address')]")
	public WebElement header_AddNewAddressPage;
	
	@FindBy(xpath="//input[contains(@id,'FullName')]")
	public WebElement FullName_TextBox_AddNewAddressPage;
	
	@FindBy(xpath="//input[contains(@id,'enterAddressLine1')]")
	public WebElement AddressLine1_TextBox_AddNewAddressPage;
	
	@FindBy(xpath="//input[contains(@id,'enterAddressCity')]")
	public WebElement CityName_TextBox_AddNewAddressPage;
	
	@FindBy(xpath="//input[contains(@id,'enterAddressStateOrRegion')]")
	public WebElement StateName_TextBox_AddNewAddressPage;
	
	@FindBy(xpath="//input[contains(@id,'enterAddressPostalCode')]")
	public WebElement zipCode_TextBox_AddNewAddressPage;
	
	@FindBy(xpath="//input[contains(@id,'enterAddressPhoneNumber')]")
	public WebElement PhoneNumber_TextBox_AddNewAddressPage;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	public WebElement addAddress_button_AddNewAddressPage;
	
	
	/*********************** Initializing the web elements****************************************/
	public Locators(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
