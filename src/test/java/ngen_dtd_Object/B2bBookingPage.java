package ngen_dtd_Object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B2bBookingPage 
{
	WebDriver driver;
	@FindBy(xpath = "//span[normalize-space()='Shipment']")
	WebElement Shipment;
	
	@FindBy(xpath = "//a[normalize-space()='B2B-Booking']")
	WebElement B2B_Booking;
	
	@FindBy(xpath = "//input[@value='New Booking']")
	WebElement New_Booking;
	
	@FindBy(xpath = "//body[1]/form[1]/div[3]/table[2]/tbody[1]/tr[5]/td[2]/span[1]/span[1]/span[1]/span[1]")
	WebElement Select_Customer;
	
	public B2bBookingPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);			
	}
	
	public void select_Shipment()
	{
		Shipment.click();	
	}
	
	public void select_B2B_Booking()
	{
		B2B_Booking.click();	
	}
	
	public void select_New_Booking()
	{
    	driver.switchTo().frame("iMasterFrame");
		New_Booking.click();	
	}
	
	public void select_Customer()
	{
        // Locate the dropdown element and click it to reveal the options
        Select_Customer.click();
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
