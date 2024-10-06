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


public class ShipperDetails 
{
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	@FindBy(xpath = "//input[@id='AddShipperDetails']")
	WebElement AddShipperDetailsHyperLink;

	@FindBy(xpath = "//input[@id='txtShipperName']")
	WebElement Name;

	@FindBy(xpath = "//body[1]/div[49]/div[2]/div[3]/table[1]/tbody[1]/tr[2]/td[4]/span[1]/span[1]/span[1]/span[1]")
	WebElement OriginCountryErrow;

	@FindBy(xpath = "//body[1]/div[49]/div[2]/div[3]/table[1]/tbody[1]/tr[3]/td[2]/span[1]/span[1]/span[1]/span[1]")
	WebElement OriginCityErrow;
	
	@FindBy(xpath = "//body[1]/div[49]/div[2]/div[3]/table[1]/tbody[1]/tr[3]/td[4]/span[1]/span[1]/span[1]/span[1]")
	WebElement ZipCodeErrow;
	
	@FindBy(xpath = "//input[@id='txtShipperAddress1']")
	WebElement Address1;
	
	@FindBy(xpath = "//input[@id='ShipperMobileNo']")
	WebElement MobileNo;
	
	@FindBy(xpath = "//input[@name='Saveshipper']")
	WebElement SaveButton;

	@FindBy(xpath = "//div[@id='Text_ShipperCountrySNo-list']//li[@class='k-item']")
	WebElement CountryList;
	
	@FindBy(xpath = "//div[@id='Text_ShipperCityCodeSNo-list']//li[@class='k-item']")
	WebElement CityList;
	
	@FindBy(xpath = "//div[@id='Text_ShipperZipCodeSNo-list']//ul[@class='k-list k-reset']")
	WebElement ZipcodeList;
	
	
	public ShipperDetails(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);			
	}
	
	public void click_AddShipperDetails()
	{
		AddShipperDetailsHyperLink.click();	
	}
	
	public void enterName(String args1)
	{
		Name.sendKeys(args1);
	}
	
	public void select_Country()
	{
		OriginCountryErrow.click();
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(CountryList));
		button.click();
		//CountryList.click();	
	}
	
	public void select_City()
	{
		OriginCityErrow.click();
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(CityList));
		button.click();
	}
	
	public void select_Zipcode(String args1)
	{
		ZipCodeErrow.click();
		List<WebElement> listItems = ZipcodeList.findElements(By.tagName("li"));
		for (WebElement option : listItems) {
            if (option.getText().equals(args1)) {
                option.click();
                break;
            }
        }
		
	}
	
	public void enter_Address1(String args1)
	{
		Address1.sendKeys(args1);
	}
	
	public void enter_MobileNo(String args1)
	{
		MobileNo.sendKeys(args1);
	}
	
	public void enter_SaveButton()
	{
		SaveButton.click();
	}
	

}
