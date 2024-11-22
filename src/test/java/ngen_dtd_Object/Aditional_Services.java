package ngen_dtd_Object;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Aditional_Services {
	
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	@FindBy(xpath = "//input[@id='GetRate']")
	WebElement Click_GetRate;
	
	@FindBy(xpath = "//input[@id='SaveExitRate']")
	WebElement Save_GetRate;
	
	@FindBy(xpath = "//input[@id='TermsAndConditionsChk']")
	WebElement Click_Tnc;
	
	@FindBy(xpath = "//body[1]/form[1]/div[3]/table[4]/tbody[1]/tr[17]/td[2]/input[2]")
	WebElement Select_Declaration;
	
	@FindBy(xpath = "//body[1]/form[1]/div[3]/table[1]/tbody[1]/tr[3]/th[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")
	WebElement Save_Booking;
	
	
	
	
	public Aditional_Services(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click_GetRate() 
	{
	    wait.until(ExpectedConditions.elementToBeClickable(Click_GetRate)).click();

	}
	
	public void save_GetRate() 
	{
	    wait.until(ExpectedConditions.elementToBeClickable(Save_GetRate)).click();

	}
	
	public void click_Tnc() 
	{
	    wait.until(ExpectedConditions.elementToBeClickable(Click_Tnc)).click();

	}
	
	public void select_Declaration() 
	{
	    wait.until(ExpectedConditions.elementToBeClickable(Select_Declaration)).click();

	}
	
	public void save_Booking() 
	{
	    wait.until(ExpectedConditions.elementToBeClickable(Save_Booking)).click();

	}

}
