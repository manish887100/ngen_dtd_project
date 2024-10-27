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

public class ConsigneeDetails {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	@FindBy(xpath = "//input[@id='AddConsigneeDetails']")
	WebElement AddConsigneeDetailsHyperLink;
	
	@FindBy(xpath = "//input[@id='txtConsigneeName']")
	WebElement Name;
	
	@FindBy(css = "body > div:nth-child(51) > div:nth-child(2) > div:nth-child(4) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(4) > span:nth-child(2) > span:nth-child(1) > span:nth-child(2) > span:nth-child(1)")
	WebElement DestinationCountryErrow;
	
	@FindBy(css = "body > div:nth-child(51) > div:nth-child(2) > div:nth-child(4) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(2) > span:nth-child(2) > span:nth-child(1) > span:nth-child(2) > span:nth-child(1)")
	WebElement DestinationCityErrow;
	
	@FindBy(css = "body > div:nth-child(51) > div:nth-child(2) > div:nth-child(4) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(4) > span:nth-child(2) > span:nth-child(1) > span:nth-child(2) > span:nth-child(1)")
	WebElement ZipCodeErrow;
	
	@FindBy(css = "#txtConsigneeAddress1")
	WebElement Address1;
	
	@FindBy(css = "#ConsigneeMobileNo")
	WebElement MobileNo;
	
	@FindBy(xpath = "//input[@name='consignee']")
	WebElement SaveButton;
	
	@FindBy(xpath = "//div[@id='Text_ConsigneeCountrySNo-list']//ul[@class='k-list k-reset']//li")
	WebElement CountryList;
	
	@FindBy(xpath = "//div[@id='Text_DestinationSNo-list']")
	WebElement CityList;
	
	@FindBy(xpath = "//div[@id='Text_ConsigneeZipCodeSNo-list']//ul[@class='k-list k-reset']")
	WebElement ZipCodeList;
		
	
	public ConsigneeDetails(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click_AddConsigneeDetails()
	{
		AddConsigneeDetailsHyperLink.click();	
	}
	
	public void enterName(String args1)
	{
		Name.sendKeys(args1);
	}
	
	public void selectDestinationCountry(String args1)
	{
		// Initialize WebDriverWait with a timeout of 10 seconds
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Click to open the Zipcode dropdown
	    wait.until(ExpectedConditions.elementToBeClickable(DestinationCountryErrow)).click();
    
	    List<WebElement> listItems = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='Text_ConsigneeCountrySNo-list']//ul[@class='k-list k-reset']//li")));		
	      for (WebElement option : listItems) {                                                             
          if (option.getText().equals(args1)) {
              option.click();
              break;
          }
      }
   }
	
	public void selectDestinationCity(String args1)
	{
		// Initialize WebDriverWait with a timeout of 10 seconds
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Click to open the Zipcode dropdown
	    wait.until(ExpectedConditions.elementToBeClickable(DestinationCityErrow)).click();
    
	    List<WebElement> listItems = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='Text_DestinationSNo-list']")));		
	      for (WebElement option : listItems) {                                                             
          if (option.getText().equals(args1)) {
              option.click();
              break;
          }
      }		
	}
	
	public void selectDestinationZipCode(String args1)
	{
		 // Initialize WebDriverWait with a timeout of 10 seconds
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Click to open the Zipcode dropdown
	    wait.until(ExpectedConditions.elementToBeClickable(ZipCodeErrow)).click();
	    
	    List<WebElement> listItems = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='Text_ConsigneeZipCodeSNo-list']//ul[@class='k-list k-reset']//li")));		
	      for (WebElement option : listItems) {
            if (option.getText().equals(args1)) {
                option.click();
                break;
            }
        }
		
	}
	
	public void enterAddress1(String args1) 
	{
	    // Initialize WebDriverWait with a timeout of 10 seconds
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
	    // Wait for the Address1 element to be visible and clickable
	    WebElement addressField = wait.until(ExpectedConditions.elementToBeClickable(Address1));
	    
	    // Clear any pre-existing text in the field (optional, based on your use case)
	    addressField.clear();

	    // Enter the address into the field
	    addressField.sendKeys(args1);
	}
	
	public void enterMobileNo(String args1) 
	{
	    // Initialize WebDriverWait with a timeout of 10 seconds
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
	    // Wait for the MobileNo element to be visible and clickable
	    WebElement mobileNoField = wait.until(ExpectedConditions.elementToBeClickable(MobileNo));
	    
	    // Clear any pre-existing text in the field (optional, based on your use case)
	    mobileNoField.clear();

	    // Enter the mobile number into the field
	    mobileNoField.sendKeys(args1);
	}

	public void enterSaveButton() 
	{
		
		SaveButton.click();
		
	}
	
	
}
