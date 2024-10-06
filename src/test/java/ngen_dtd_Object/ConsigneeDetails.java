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
	
	@FindBy(xpath = "//body[1]/div[49]/div[2]/div[3]/table[1]/tbody[1]/tr[2]/td[4]/span[1]/span[1]/span[1]/span[1]")
	WebElement DestinationCountryErrow;
	
	@FindBy(xpath = "//body[1]/div[49]/div[2]/div[3]/table[1]/tbody[1]/tr[3]/td[2]/span[1]/span[1]/span[1]/span[1]")
	WebElement DestinationCityErrow;
	
	@FindBy(xpath = "//body[1]/div[49]/div[2]/div[3]/table[1]/tbody[1]/tr[3]/td[4]/span[1]/span[1]/span[1]/span[1]")
	WebElement ZipCodeErrow;
	
	@FindBy(xpath = "//input[@id='txtConsigneeAddress1']")
	WebElement Address1;
	
	@FindBy(xpath = "//input[@id='ConsigneeMobileNo']")
	WebElement MobileNo;
	
	@FindBy(xpath = "//input[@name='consignee']")
	WebElement SaveButton;
	
	@FindBy(xpath = "//div[@id='Text_ConsigneeCountrySNo-list']//ul[@class='k-list k-reset']")
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
	
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated((By) DestinationCountryErrow));
		element.click();
//		List<WebElement> listItems = CountryList.findElements(By.tagName("li"));
//		for (WebElement option : listItems) {
//            if (option.getText().equals(args1)) {
//                option.click();
//                break;
//            }
//	}
	
   }
	
	public void selectDestinationCity(String args1)
	{
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(DestinationCityErrow));
		button.click();
        List<WebElement> listItems = CityList.findElements(By.tagName("li"));
		for (WebElement option : listItems) {
            if (option.getText().equals(args1)) {
                option.click();
                break;
            }
	}		
	}
	
	public void selectDestinationZipCode(String args1)
	{
		ZipCodeErrow.click();
        List<WebElement> listItems = ZipCodeList.findElements(By.tagName("li"));
		for (WebElement option : listItems) {
            if (option.getText().equals(args1)) {
                option.click();
                break;
            }
	}		
	}
	
	public void enterAddress1(String args1)
	{
		Address1.sendKeys(args1);	
	}
	
	public void enterMobileNo(String args1)
	{
		MobileNo.sendKeys(args1);
	}
	
	public void enterSaveButton()
	{
		SaveButton.click();
	}	
}
