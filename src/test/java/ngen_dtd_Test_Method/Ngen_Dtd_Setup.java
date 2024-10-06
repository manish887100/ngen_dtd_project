package ngen_dtd_Test_Method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import ngen_dtd_Object.B2bBookingPage;
import ngen_dtd_Object.ConsigneeDetails;
import ngen_dtd_Object.ShipperDetails;
import ngen_dtd_Object.SignUpPage;

public class Ngen_Dtd_Setup
{

WebDriver driver;

   SignUpPage ObjNgenDtdSignUpPage;
   B2bBookingPage ObjB2bBookingPage;
   ShipperDetails ObjShipperDetails;
   ConsigneeDetails ObjConsigneeDetails; 

	@SuppressWarnings("deprecation")
	@BeforeTest
	public void beforetest()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://ngenecomtestnew.cargoflash.com/");
	}
	
	@Test (priority = 1)
	public void enter_userDetails()
	{
		ObjNgenDtdSignUpPage = new SignUpPage(driver);
		ObjNgenDtdSignUpPage.enterUserName("Manihelcons");
		ObjNgenDtdSignUpPage.enterPassword("12345");
		ObjNgenDtdSignUpPage.enterLoginButton();
	}
	
	@Test (priority = 2)
	public void B2B_Booking_Page()
	{
		ObjB2bBookingPage = new B2bBookingPage(driver);
		ObjB2bBookingPage.select_Shipment();
		ObjB2bBookingPage.select_B2B_Booking();
		ObjB2bBookingPage.select_New_Booking();
		ObjB2bBookingPage.select_Customer();
		
	}
	@Test (priority = 3)
	public void enter_ShipperDetails() 
	{
		ObjShipperDetails = new ShipperDetails(driver);
		ObjShipperDetails.click_AddShipperDetails();
		ObjShipperDetails.enterName("Manish Arya");
		ObjShipperDetails.select_Country();
		ObjShipperDetails.select_City();
		ObjShipperDetails.select_Zipcode("00102");
		ObjShipperDetails.enter_Address1("DownTown Helinski");
		ObjShipperDetails.enter_MobileNo("8871009273");
		ObjShipperDetails.enter_SaveButton();
	}
	@Test (priority = 4)
	public void enter_ConsigneeDetails()
	{
		ObjConsigneeDetails = new ConsigneeDetails(driver);
		ObjConsigneeDetails.click_AddConsigneeDetails();
		ObjConsigneeDetails.enterName("Sarvagya Jain");
		ObjConsigneeDetails.selectDestinationCountry("Finland");
		ObjConsigneeDetails.selectDestinationCity("Helinski");
		ObjConsigneeDetails.selectDestinationZipCode("00105");
		ObjConsigneeDetails.enterAddress1("DownTown Helinski");
		ObjConsigneeDetails.enterAddress1("8871009273");
		ObjConsigneeDetails.enterSaveButton();
		
	}

}
