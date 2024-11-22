package ngen_dtd_Object;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class B2bBookingPage 
{
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	
	@FindBy(xpath = "//span[normalize-space()='Shipment']")
	WebElement Shipment;
	
	@FindBy(xpath = "//a[normalize-space()='B2B-Booking']")
	WebElement B2B_Booking;
	
	@FindBy(xpath = "//input[@value='New Booking']")
	WebElement New_Booking;
	
	@FindBy(xpath = "//body[1]/form[1]/div[3]/table[2]/tbody[1]/tr[5]/td[2]/span[1]/span[1]/span[1]/span[1]")
	WebElement Select_Customer;
	
	@FindBy(css = "body > form:nth-child(3) > div:nth-child(3) > table:nth-child(22) > tbody:nth-child(1) > tr:nth-child(19) > td:nth-child(2) > span:nth-child(2) > span:nth-child(1) > span:nth-child(2) > span:nth-child(1)")
	WebElement Select_ServiceType;
	
	
	
	
	public B2bBookingPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);			
	}
	
	public void select_Shipment()
	{
	    wait.until(ExpectedConditions.elementToBeClickable(Shipment)).click();

	}
	
	public void select_B2B_Booking()
	{
	    wait.until(ExpectedConditions.elementToBeClickable(B2B_Booking)).click();

	}
	
	public void select_New_Booking()
	{
    	driver.switchTo().frame("iMasterFrame");
	    wait.until(ExpectedConditions.elementToBeClickable(New_Booking)).click();

	}
	
	public void select_Customer()
	{
        // Locate the dropdown element and click it to reveal the options
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(Select_Customer)).click();
        // Locate the unordered list by its ID, class, or any other locator
        WebElement unorderedList = driver.findElement(By.xpath("//div[@id='Text_CustomerIDSelf-list']//ul[@class='k-list k-reset']"));

        // Locate the list items within the unordered list
        List<WebElement> listItems = unorderedList.findElements(By.tagName("li"));

        
        // Iterate through the options and select the desired one
        for (WebElement option : listItems) {
            if (option.getText().equals("HELINSKI SALES [HELINSKI S-1247]")) {
                option.click();
                break;
            }
        }

	}
	
}

