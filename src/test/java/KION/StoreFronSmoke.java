package KION;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class StoreFronSmoke {
	WebDriver driver;

	@Test(priority = 1)
	public void login() throws InterruptedException {
		WebElement Login_Link = driver.findElement(By.className("icon-heart"));
		Login_Link.click();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Emailaddress']"));
		email.sendKeys("mar.ig10test@gmail.com");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("Test@123");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//button[.='Login']"));
		loginButton.click();
		Thread.sleep(2000);
		WebElement Dealer_Selection = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[3]/div[1]"));
		Dealer_Selection.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)", "driver");
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[.='L0009408039']"));
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		WebElement click_WorkSheet = driver.findElement(By.xpath(
				"//button[@data-expresscart-action='https://tst.lindelink.com/INTERSHOP/web/WFS/Linde-Business-Site/en_US/-/USD/ViewCart-AddProductToWorkSheet?ProductSKU=L0009408039&ProductId=L0009408039']"));
		click_WorkSheet.click();
		Thread.sleep(2000);
		WebElement minicart_Close = driver.findElement(By.xpath("//a[@href='#miniCart']/span[.='Close']"));
		minicart_Close.click();
		Thread.sleep(2000);
	}

	@Test(priority = 2, dependsOnMethods = "login", enabled = false)
	public void CLP_PLP() throws InterruptedException, NoSuchElementException {
		WebElement CLP = driver.findElement(By.xpath("//a[.='Linde']"));
		CLP.click();
		Thread.sleep(2000);
		WebElement Sub_CLP = driver.findElement(By.xpath("//h3[.='Maintenance']"));
		Sub_CLP.click();
		Thread.sleep(2000);
		WebElement PLP = driver.findElement(By.xpath("//h3[.='Kits']"));
		PLP.click();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[.='3550086503']"));
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		WebElement click_WorkSheet = driver.findElement(By.xpath(
				"//button[@data-expresscart-action='https://tst.lindelink.com/INTERSHOP/web/WFS/Linde-Business-Site/en_US/-/USD/ViewCart-AddProductToWorkSheet?ProductSKU=3550086503&ProductId=3550086503']"));
		click_WorkSheet.click();
	}

	@Test(priority = 3, dependsOnMethods = "CLP_PLP", enabled = false)
	public void PDP() throws InterruptedException {
		WebElement PDP = driver
				.findElement(By.xpath("//a[@href='https://tst.lindelink.com/p/3550086507']/div/span/img"));
		PDP.click();
		Thread.sleep(2000);
		WebElement Add_to_WorkSheet = driver.findElement(By.xpath("//button[@name='addProductToWorkSheet'][1]"));
		Add_to_WorkSheet.click();
	}

	@Test(priority = 4, dependsOnMethods = "PDP", enabled = false)
	public void Compare() throws InterruptedException {
		WebElement CLP = driver.findElement(By.xpath("//a[.='Linde']"));
		CLP.click();
		Thread.sleep(2000);
		WebElement Sub_CLP = driver.findElement(By.xpath("//h3[.='Maintenance']"));
		Sub_CLP.click();
		Thread.sleep(2000);
		WebElement PLP = driver.findElement(By.xpath("//h3[.='Kits']"));
		PLP.click();
		Thread.sleep(2000);
		WebElement PDP = driver.findElement(By.xpath(
				"//a[@href='https://tst.lindelink.com/p/3550086511']/span[.=\"maintenance package '5000h-H280-H320\"]"));
		PDP.click();
		Thread.sleep(2000);
		WebElement compareIconClick = driver.findElement(By.xpath("//a[@title='Compare']"));
		compareIconClick.click();
		Thread.sleep(2000);
		WebElement Add_to_WorkSheet = driver.findElement(By.xpath("//div[@class='add-to-cart']"));
		Add_to_WorkSheet.click();
		Thread.sleep(2000);
		WebElement minicart_Close = driver.findElement(By.xpath("//a[@href='#miniCart']/span[.='Close']"));
		minicart_Close.click();

	}

	@Test(priority = 5, enabled = false)
	public void OrderTemplate() throws InterruptedException {
		WebElement CLP = driver.findElement(By.xpath("//a[.='Linde']"));
		CLP.click();
		Thread.sleep(2000);
		WebElement Sub_CLP = driver.findElement(By.xpath("//h3[.='Maintenance']"));
		Sub_CLP.click();
		Thread.sleep(2000);
		WebElement PLP = driver.findElement(By.xpath("//h3[.='Kits']"));
		PLP.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "driver");
		Thread.sleep(2000);
		WebElement PDP = driver.findElement(
				By.xpath("//div[@class='product-tile-desc']/a[@href='https://tst.lindelink.com/p/3550086513']"));
		PDP.click();
		Thread.sleep(2000);
		WebElement OrderTemplate = driver
				.findElement(By.xpath("//div[@class='pdp-btns']//button[@name='addToWishlistProduct']"));
		OrderTemplate.click();
		Thread.sleep(2000);
		if (driver.findElement(By.name("AddWishlistItem")).isDisplayed()) {
			driver.findElement(By.name("AddWishlistItem")).click();
		} else {
			driver.findElement(By.id("NewWishlistRadioButton")).click();
		}
		Thread.sleep(2000);
		WebElement confirmOK = driver.findElement(By.xpath("//a[.='OK']"));
		confirmOK.click();
		Thread.sleep(2000);
		WebElement OrderTemplatePage = driver.findElement(By.className("icon-heart"));
		OrderTemplatePage.click();
		Thread.sleep(2000);
		WebElement AddtoWorksheet = driver.findElement(By.xpath("//a[@title='Add to Cart']"));
		AddtoWorksheet.click();

	}

	@Test(priority = 6, enabled = false, dependsOnMethods = "login")
	public void Search() throws InterruptedException {
		WebElement Home = driver.findElement(By.xpath("//a[@rel='home']/img[@title='Kion Logo']"));
		Home.click();
		Thread.sleep(3000);
		WebElement searchIcon = driver.findElement(By.xpath("//a[@href='#header-searchbox']"));
		searchIcon.click();
		WebElement searchKeyword = driver.findElement(By.xpath("//*[@id=\"header-searchbox\"]/form/input[1]"));
		searchKeyword.sendKeys("123224");
		Thread.sleep(2000);
		WebElement searchIconClick = driver
				.findElement(By.xpath("/html/body/header/div/div[2]/div[3]/div/div[2]/div/form/button/span/i"));
		searchIconClick.click();
		Thread.sleep(2000);
		WebElement Add_to_WorkSheet = driver.findElement(By.xpath("//button[@name='addProductToWorkSheet'][1]"));
		Add_to_WorkSheet.click();
	}

	@Test(priority = 7, enabled = false, dependsOnMethods = "login")
	public void EmergencyOrder() throws InterruptedException {
		WebElement Home = driver.findElement(By.xpath("//a[@rel='home']/img[@title='Kion Logo']"));
		Home.click();
		Thread.sleep(2000);
		WebElement availabilityPricing = driver
				.findElement(By.xpath("//li[@class='dropdown']/a[.='Availability & Pricing']"));
		availabilityPricing.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "driver");
		Thread.sleep(3000);
		WebElement submitButton = driver.findElement(By.xpath("//div[@class='quick-addbtn']/button[.='Submit']"));
		submitButton.click();
		Thread.sleep(2000);
		WebElement scanEle = new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[2]/button")));
		Actions action = new Actions(driver);
		action.moveToElement(scanEle).click().build().perform();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)", "driver");
		Thread.sleep(3000);
		WebElement ProceedCheckout = driver.findElement(By.xpath("//button[.='Proceed To Checkout']"));
		ProceedCheckout.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)", "driver");
		WebElement poNumber = driver.findElement(By.name("PrimaryPO"));
		poNumber.sendKeys("Test_Po 6783");
		Thread.sleep(2000);
		WebElement checkBox_Check = driver.findElement(By.id("terms-conditions-agree"));
		checkBox_Check.click();
		Thread.sleep(2000);
		WebElement Proceed = driver.findElement(By.id("submit-order"));
		Proceed.click();

	}

	@Test(priority = 8, enabled = false, dependsOnMethods = "login")
	public void StockOrder() throws InterruptedException {
		WebElement Home = driver.findElement(By.xpath("//a[@rel='home']/img[@title='Kion Logo']"));
		Home.click();
		Thread.sleep(2000);
		WebElement availabilityPricing = driver
				.findElement(By.xpath("//li[@class='dropdown']/a[.='Availability & Pricing']"));
		availabilityPricing.click();
		Thread.sleep(2000);
		WebElement OrderType = driver.findElement(By.id("qcOrderType"));
		OrderType.click();
		Thread.sleep(2000);
		WebElement stockOrder = driver.findElement(By.xpath("//option[.='Stock Order']"));
		stockOrder.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "driver");
		Thread.sleep(2000);
		WebElement submitButton = driver.findElement(By.xpath("//div[@class='quick-addbtn']/button[.='Submit']"));
		submitButton.click();
		Thread.sleep(2000);
		WebElement scanEle = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[2]/button")));
		Actions action = new Actions(driver);
		action.moveToElement(scanEle).click().build().perform();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)", "driver");
		Thread.sleep(2000);
		WebElement ProceedCheckout = driver.findElement(By.xpath("//button[.='Proceed To Checkout']"));
		ProceedCheckout.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)", "driver");
		WebElement poNumber = driver.findElement(By.name("PrimaryPO"));
		poNumber.sendKeys("Test_Po 6783");
		Thread.sleep(2000);
		WebElement checkBox_Check = driver.findElement(By.id("terms-conditions-agree"));
		checkBox_Check.click();
		Thread.sleep(2000);
		WebElement Proceed = driver.findElement(By.id("submit-order"));
		Proceed.click();
	}

	@Test(priority = 9, enabled = false, dependsOnMethods = "login")
	public void Saved_EmergencyOrder() throws InterruptedException {
		WebElement Home = driver.findElement(By.xpath("//a[@rel='home']/img[@title='Kion Logo']"));
		Home.click();
		Thread.sleep(2000);
		WebElement availabilityPricing = driver
				.findElement(By.xpath("//li[@class='dropdown']/a[.='Availability & Pricing']"));
		availabilityPricing.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "driver");
		Thread.sleep(3000);
		WebElement saveButton = driver.findElement(By.xpath("//button[.='Save Worksheet']"));
		saveButton.click();
		Thread.sleep(2000);
		WebElement workSheetName = driver.findElement(By.xpath("//input[@name='WishlistPropertiesForm_WishlistName']"));
		workSheetName.sendKeys("Emergency Saved Worksheet");
		Thread.sleep(2000);
		WebElement saveChangesButton = driver
				.findElement(By.xpath("//button[@name='EditQuickOrderWishlistProperties']"));
		saveChangesButton.click();
		Thread.sleep(2000);
		WebElement OK_BUTTON = driver.findElement(By.xpath("//a[.='OK']"));
		OK_BUTTON.click();
		Thread.sleep(2000);
		WebElement submitButton = driver.findElement(By.xpath("//div[@class='quick-addbtn']/button[.='Submit']"));
		submitButton.click();
		Thread.sleep(2000);
		WebElement scanEle = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[2]/button")));
		Actions action = new Actions(driver);
		action.moveToElement(scanEle).click().build().perform();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)", "driver");
		Thread.sleep(3000);
		WebElement ProceedCheckout = driver.findElement(By.xpath("//button[.='Proceed To Checkout']"));
		ProceedCheckout.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)", "driver");
		WebElement poNumber = driver.findElement(By.name("PrimaryPO"));
		poNumber.sendKeys("Test_Po 6783");
		Thread.sleep(2000);
		WebElement checkBox_Check = driver.findElement(By.id("terms-conditions-agree"));
		checkBox_Check.click();
		Thread.sleep(2000);
		WebElement Proceed = driver.findElement(By.id("submit-order"));
		Proceed.click();
	}

	@Test(priority = 10, enabled = false, dependsOnMethods = "login")
	public void Saved_StockOrder() throws InterruptedException {
		WebElement Home = driver.findElement(By.xpath("//a[@rel='home']/img[@title='Kion Logo']"));
		Home.click();
		Thread.sleep(2000);
		WebElement availabilityPricing = driver
				.findElement(By.xpath("//li[@class='dropdown']/a[.='Availability & Pricing']"));
		availabilityPricing.click();
		Thread.sleep(2000);
		WebElement OrderType = driver.findElement(By.id("qcOrderType"));
		OrderType.click();
		Thread.sleep(2000);
		WebElement stockOrder = driver.findElement(By.xpath("//option[.='Stock Order']"));
		stockOrder.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "driver");
		Thread.sleep(3000);
		WebElement saveButton = driver.findElement(By.xpath("//button[.='Save Worksheet']"));
		saveButton.click();
		Thread.sleep(2000);
		WebElement workSheetName = driver.findElement(By.xpath("//input[@name='WishlistPropertiesForm_WishlistName']"));
		workSheetName.sendKeys("Stock Saved Worksheet");
		Thread.sleep(2000);
		WebElement saveChangesButton = driver
				.findElement(By.xpath("//button[@name='EditQuickOrderWishlistProperties']"));
		saveChangesButton.click();
		Thread.sleep(2000);
		WebElement OK_BUTTON = driver.findElement(By.xpath("//a[.='OK']"));
		OK_BUTTON.click();
		Thread.sleep(2000);
		WebElement submitButton = driver.findElement(By.xpath("//div[@class='quick-addbtn']/button[.='Submit']"));
		submitButton.click();
		Thread.sleep(2000);
		WebElement scanEle = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[2]/button")));
		Actions action = new Actions(driver);
		action.moveToElement(scanEle).click().build().perform();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)", "driver");
		Thread.sleep(2000);
		WebElement ProceedCheckout = driver.findElement(By.xpath("//button[.='Proceed To Checkout']"));
		ProceedCheckout.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000)", "driver");
		WebElement poNumber = driver.findElement(By.name("PrimaryPO"));
		poNumber.sendKeys("Test_Po 6783");
		Thread.sleep(2000);
		WebElement checkBox_Check = driver.findElement(By.id("terms-conditions-agree"));
		checkBox_Check.click();
		Thread.sleep(2000);
		WebElement Proceed = driver.findElement(By.id("submit-order"));
		Proceed.click();
	}

	@Test(priority = 11, enabled = true)
	public void TruckSales() throws InterruptedException {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Login_Link = wait.until(presenceOfElementLocated(By.className("icon-heart")));
		Login_Link.click();
		Thread.sleep(2000);
		WebElement TruckSales_Link = driver
				.findElement(By.xpath("//ul[@class='account-navigation list-unstyled']//a[.='Truck Sales']"));
		TruckSales_Link.click();
		Thread.sleep(2000);
		WebElement SearchTrucksLink = driver.findElement(By.xpath("//button[text()='Search Trucks']"));
		SearchTrucksLink.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(3000);
	    WebElement OrderNo=driver.findElement(By.name("OrderNo"));
	    OrderNo.sendKeys("1439964");
	    Thread.sleep(2000);
	    WebElement SearchWithOrderNo = driver.findElement(By.xpath("//button[text()='Search Trucks']"));
	    SearchWithOrderNo.click();
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,500)", "driver");
	    Thread.sleep(6000);
	    js.executeScript("window.scrollBy(0,-500)"); 
	    Thread.sleep(6000);
		WebElement Clearsearch1 = driver.findElement(By.xpath("//button[@type='reset']"));
		Clearsearch1.click();
		Thread.sleep(2000);
		 js.executeScript("window.scrollBy(0,500)", "driver");
		 Thread.sleep(6000);
		 js.executeScript("window.scrollBy(0,-500)"); 
		 Thread.sleep(6000);
	    WebElement EnterPurchaseOrder=driver.findElement(By.name("PONumber"));
	    EnterPurchaseOrder.sendKeys("53428");
	    Thread.sleep(2000);
	    WebElement SearchwithPurchaseOrder = driver.findElement(By.xpath("//button[text()='Search Trucks']"));
	    SearchwithPurchaseOrder.click();
		WebElement Clearsearch2 = driver.findElement(By.xpath("//button[@type='reset']"));
		Clearsearch2.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)", "driver");
		Thread.sleep(6000);
		js.executeScript("window.scrollBy(0,-500)"); 
		Thread.sleep(6000);
	    WebElement EnterDateRangestart=driver.findElement(By.name("DateRangeStart"));
	    EnterDateRangestart.sendKeys("05/08/23");
	    Thread.sleep(3000);
	    EnterDateRangestart.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    WebElement EnterDateRangeEnd=driver.findElement(By.name("DateRangeEnd"));
	    EnterDateRangeEnd.sendKeys("05/08/23");
	    Thread.sleep(3000);
	    EnterDateRangeEnd.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    WebElement SearchwithDateRange = driver.findElement(By.xpath("//button[text()='Search Trucks']"));
	    SearchwithDateRange.click();
	    js.executeScript("window.scrollBy(0,500)", "driver");
	    Thread.sleep(6000);
		js.executeScript("window.scrollBy(0,-500)"); 
		Thread.sleep(6000);
		WebElement Clearsearch3 = driver.findElement(By.xpath("//button[@type='reset']"));
		Clearsearch3.click();
		Thread.sleep(3000);
	    WebElement EnterTruckModel=driver.findElement(By.name("TruckModel"));
	    EnterTruckModel.sendKeys("E18S 36V 1346-20 Series Finished Truck");
	    Thread.sleep(2000);
	    WebElement SearchTruckModel = driver.findElement(By.xpath("//button[text()='Search Trucks']"));
	    SearchTruckModel.click();
	    js.executeScript("window.scrollBy(0,500)", "driver");
	    Thread.sleep(6000);
		js.executeScript("window.scrollBy(0,-500)"); 
		Thread.sleep(6000);
		WebElement Clearsearch4 = driver.findElement(By.xpath("//button[@type='reset']"));
		Clearsearch4.click();
		Thread.sleep(2000);
	    WebElement SelectStaus=driver.findElement(By.name("OrderStatus"));
	    SelectStaus.click();
	    Thread.sleep(3000);
	    WebElement SelectStausCompleted=driver.findElement(By.xpath("//option[.='Completed']"));
	    SelectStausCompleted.click();
	    Thread.sleep(3000);
	    WebElement SearchwithStatus = driver.findElement(By.xpath("//button[text()='Search Trucks']"));
	    SearchwithStatus.click();
	    Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0,500)", "driver");
	     
	}

	@Test(priority = 12, enabled = false, dependsOnMethods = "login")
	public void Returns() throws InterruptedException {
		WebElement myAccountLink = driver.findElement(By.className("hidden-xs login-name"));
		myAccountLink.click();
		Thread.sleep(2000);
		WebElement ReturnsLink = driver
				.findElement(By.xpath("//ul[@class='account-navigation list-unstyled']//a[.='Truck Sales']"));
		ReturnsLink.click();
		Thread.sleep(2000);

	}

	@Test(priority = 13, enabled = false)
	public void ICM() throws InterruptedException {
		WebElement myAccountLink = driver.findElement(By.className("hidden-xs login-name"));
		myAccountLink.click();
		Thread.sleep(2000);
		WebElement ReturnsLink = driver
				.findElement(By.xpath("//ul[@class='account-navigation list-unstyled']//a[.='Truck Sales']"));
		ReturnsLink.click();
		Thread.sleep(2000);

	}

	@BeforeMethod(enabled = false)
	public void beforeMethod() throws InterruptedException {
		WebElement Login_Link = driver.findElement(By.className("icon-heart"));
		Login_Link.click();
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Emailaddress']"));
		email.sendKeys("mar.ig10test@gmail.com");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("Test@123");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//button[.='Login']"));
		loginButton.click();
		Thread.sleep(2000);
		WebElement Dealer_Selection = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[3]/div[1]"));
		Dealer_Selection.click();
		Thread.sleep(2000);
		WebElement availabilityPricing = driver
				.findElement(By.xpath("//li[@class='dropdown']/a[.='Availability & Pricing']"));
		availabilityPricing.click();
		Thread.sleep(2000);
		WebElement SelectAll = driver.findElement(By.id("selectAllItem"));
		SelectAll.click();
		Thread.sleep(2000);
		if (driver.findElement(By.id("deleteItems")).isEnabled())
			driver.findElement(By.id("deleteItems"));
		Thread.sleep(2000);
		WebElement Home = driver.findElement(By.xpath("//a[@rel='home']/img[@title='Kion Logo']"));
		Home.click();
		Thread.sleep(3000);
	}

	@AfterMethod(enabled = false)
	public void afterMethod() throws InterruptedException {
		WebElement availabilityPricing = driver
				.findElement(By.xpath("//li[@class='dropdown']/a[.='Availability & Pricing']"));
		availabilityPricing.click();
		Thread.sleep(2000);
		WebElement SelectAll = driver.findElement(By.id("selectAllItem"));
		SelectAll.click();
		Thread.sleep(2000);
		if (driver.findElement(By.id("deleteItems")).isEnabled())
			driver.findElement(By.id("deleteItems"));
		WebElement Home = driver.findElement(By.xpath("//a[@rel='home']/img[@title='Kion Logo']"));
		Home.click();
		Thread.sleep(2000);
	}

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation setup\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://tst.lindelink.com/");
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
