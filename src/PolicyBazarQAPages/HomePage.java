package PolicyBazarQAPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage {
	
	//Variables
	@FindBy(className="sign-in")
	private WebElement HomePageSignInButton;
	@FindBy(xpath="(//input[@type='number'])[2]")
	private WebElement MobileNumberField;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")
	private WebElement SignInWithPassword;
	@FindBy(name = "password") 
	private WebElement passwordField;
	@FindBy(xpath = "//a[@id='login-in-with-password']") 
	private WebElement signInButton;
	@FindBy(className = "userprofile") 
	private WebElement myAccount;
	@FindBy(xpath = "//span[text()=' My profile ']") 
	private WebElement myProfile;
	
	//Constructor
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	
	public void clickHomePageOnSignInButton()
	{
		Reporter.log("Clicking On HomePageOnSignInButton ", true);
		HomePageSignInButton.click();
	}
	
	public void clickOnMobileNumberField()
	{
		Reporter.log("Clicking On MobileNumberField", true);
		MobileNumberField.click();
	}
	
	public void clickonSignInWithPassword()
	{
		Reporter.log("Clicking On SignInWithPassword", true);
		SignInWithPassword.click();
	}
	
	public void enterPassword(String password)
	{
		Reporter.log("Entering Password", true);
		passwordField.sendKeys(password);
		
	}
	
	public void clickOnSignInButton()
	{
		Reporter.log("Clicking On Sign In Button", true);
		signInButton.click();
	}
	
	public void clickOnMyAccount()
	{
		Reporter.log("Clicking on My Account ", true);
		myAccount.click();
	}
	
	public void clickOnmyProfile()
	{
		Reporter.log("Clicking On myProfile", true);
		myProfile.click();
	}
	
		
	
	
	
	

}
