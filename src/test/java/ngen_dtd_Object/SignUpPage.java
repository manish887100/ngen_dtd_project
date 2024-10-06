package ngen_dtd_Object;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage
{

	WebDriver driver;
	@FindBy(xpath = "//input[@id='txtUser']")
	WebElement UserName;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement Password;

	@FindBy(xpath = "//input[@id='LogInBtn']")
	WebElement LoginButton;
    
	public SignUpPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);			
	}
	
	public void enterUserName(String args1)
	{
		
		UserName.sendKeys(args1);
		
	}
	
	public void enterPassword(String args1)
	{
		
		Password.sendKeys(args1);
		
	}
	
	public void enterLoginButton()
	{
		
		LoginButton.click();
		String title =driver.getTitle();
		assertEquals("nGen-DTD", title);
		
	}

}
