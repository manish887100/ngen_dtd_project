package ngen_dtd_Object;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shipment_Information {
	
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	@FindBy(xpath = "//tbody/tr[19]/td[2]/span[1]/span[1]/span[1]/span[1]")
	WebElement Select_ServiceType;
	
	@FindBy(xpath = "//tbody/tr[19]/td[4]/span[1]/span[1]/span[1]/span[1]")
	WebElement Select_ProductType;
	
	@FindBy(xpath = "//body[1]/form[1]/div[3]/table[2]/tbody[1]/tr[20]/td[2]/span[1]/span[1]/span[1]")
	WebElement Select_Commodity;
	
	@FindBy(xpath = "//input[@id='Pieces']")
	WebElement Enter_Pieces;
	
	@FindBy(xpath = "//input[@id='AddDimension']")
	WebElement Click_AddDimension;
	
	@FindBy(xpath = "//input[@id='Length']")
	WebElement Enter_Length;
	
	@FindBy(xpath = "//input[@id='Width']")
	WebElement Enter_Width;
	
	@FindBy(xpath = "//input[@id='Height']")
	WebElement Enter_Height;
	
	@FindBy(xpath = "//input[@id='DimPerPcGrossWeight']")
	WebElement Enter_PerPiecesGrossWeight;
	
	@FindBy(xpath = "//input[@id='SaveExitDimension']")
	WebElement Save_AddDimension;
	
	@FindBy(xpath = "//body[1]/form[1]/div[3]/table[2]/tbody[1]/tr[24]/td[4]/span[1]/span[1]/span[1]")
	WebElement Select_HSCode;
	
	@FindBy(xpath = "//input[@id='ItemDescription']")
	WebElement Enter_ItemDescription;
	
	@FindBy(xpath = "//input[@id='OrderID']")
	WebElement Enter_OrderID;
	
	

	public Shipment_Information(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void scroll_Screen() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight / 4);");
	}
	
	public void select_Service_Type(String args1) 
	{
	    // Click to open the Zipcode dropdown
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(Select_ServiceType)).click();
	    
	    List<WebElement> listItems = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='Text_ServiceTypeSNo-list']//li")));		
	      for (WebElement option : listItems) {
            if (option.getText().equals(args1)) {
                option.click();
                break;
            }
        }
	}
	
	public void select_Product_Type(String args1) 
	{
	    // Click to open the Zipcode dropdown
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(Select_ProductType)).click();
	    
	    List<WebElement> listItems = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='Text_ProductSNo-list']//li")));		
	      for (WebElement option : listItems) {
            if (option.getText().equals(args1)) {
                option.click();
                break;
            }
        }
	}

	public void select_Commodity(String args1) 
	{
	    // Click to open the Zipcode dropdown
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(Select_Commodity)).click();
	    
	    List<WebElement> listItems = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='Text_CommoditySNo-list']//li")));		
	      for (WebElement option : listItems) {
            if (option.getText().equals(args1)) {
                option.click();
                break;
            }
        }
	}
	
	public void enter_Pieces(String args1) 
	{
	    Enter_Pieces.sendKeys(args1);
	}
	
	public void click_AddDimension() 
	{
	    wait.until(ExpectedConditions.elementToBeClickable(Click_AddDimension)).click();
	}
	
	public void enter_Length(String args1) 
	{
	    Enter_Length.sendKeys(args1);
	}
	
	public void enter_Width(String args1) 
	{
		Enter_Width.sendKeys(args1);
	}
	
	public void enter_Height(String args1) 
	{
		Enter_Height.sendKeys(args1);
	}
	
	public void enter_PerPiecesGrossWeight(String args1) 
	{
		Enter_PerPiecesGrossWeight.sendKeys(args1);
	}
	
	public void save_AddDimension() 
	{
	    wait.until(ExpectedConditions.elementToBeClickable(Save_AddDimension)).click();	
	}
	
	public void select_HSCode(String args1) 
	{
	    // Click to open the Zipcode dropdown
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(Select_HSCode)).click();
	    
	    List<WebElement> listItems = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='Text_HsCodeSNo-list']//li")));		
	      for (WebElement option : listItems) {
            if (option.getText().equals(args1)) {
                option.click();
                break;
            }
        }
	}
	
	public void enter_ItemDescription(String args1) 
	{
		Enter_ItemDescription.sendKeys(args1);
	}
	
	public void enter_OrderID(String args1) 
	{
		Enter_OrderID.sendKeys(args1);
	}	
	
}
