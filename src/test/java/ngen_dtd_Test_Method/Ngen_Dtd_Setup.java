package ngen_dtd_Test_Method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import ngen_dtd_Object.Aditional_Services;
import ngen_dtd_Object.B2bBookingPage;
import ngen_dtd_Object.ConsigneeDetails;
import ngen_dtd_Object.Shipment_Information;
import ngen_dtd_Object.ShipperDetails;
import ngen_dtd_Object.SignUpPage;

public class Ngen_Dtd_Setup
{

WebDriver driver;

   SignUpPage ObjNgenDtdSignUpPage;
   B2bBookingPage ObjB2bBookingPage;
   ShipperDetails ObjShipperDetails;
   ConsigneeDetails ObjConsigneeDetails;
   Shipment_Information ObjShipment_Information;
   Aditional_Services ObjAditional_Services;

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
		ObjShipperDetails.select_Zipcode1("00102");
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
		ObjConsigneeDetails.selectDestinationCountry("BN-BHUTAN");
		ObjConsigneeDetails.selectDestinationCity("PHUNTSHOLING [PHN]");
		ObjConsigneeDetails.selectDestinationZipCode("21101");
		ObjConsigneeDetails.enterAddress1("DownTown PHUNTSHOLING");
		ObjConsigneeDetails.enterMobileNo("8871009272");
		ObjConsigneeDetails.enterSaveButton();
		
	}
	
	@Test (priority = 5)
	public void Enter_Shipment_Information()
	{
		ObjShipment_Information = new Shipment_Information(driver);
		
		ObjShipment_Information.scroll_Screen();
		ObjShipment_Information.select_Service_Type("PARCEL(DTD)");
		ObjShipment_Information.select_Product_Type("EXPRESS PLATINUM - [SDS]");
		ObjShipment_Information.select_Commodity("RSC-SPONTANEOUSLY COMBUSTIBLE");
		ObjShipment_Information.enter_Pieces("1");
		ObjShipment_Information.click_AddDimension();
		ObjShipment_Information.enter_Length("10");
		ObjShipment_Information.enter_Width("10");
		ObjShipment_Information.enter_Height("10");
		ObjShipment_Information.enter_PerPiecesGrossWeight("10");
		ObjShipment_Information.save_AddDimension();
		ObjShipment_Information.select_HSCode("85182290");
		ObjShipment_Information.enter_ItemDescription("Automation Testing");
		ObjShipment_Information.enter_OrderID("Order123");		
		
	}
	@Test (priority = 6)
	public void Select_Additional_Services()
	{
		ObjAditional_Services = new Aditional_Services(driver);
		
		ObjAditional_Services.click_GetRate();
		ObjAditional_Services.save_GetRate();
		ObjAditional_Services.click_Tnc();
		ObjAditional_Services.select_Declaration();
		ObjAditional_Services.save_Booking();
		
	}
	
}
