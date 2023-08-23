package KION;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class ICM_Login {
	WebDriver driver;

	@Test
	public void prudctGlobalsearch() {
	
	}

	@Test
	public void Specificprudctlsearch() {

	}

	@Test
	public void prudctAdvancedsearch() {

	}

	@Test
	public void productDetails() {

	}

	@Test
	public void cutomerGlobalsearch() {

	}

	@Test
	public void SpecificCustomerSearch() {

	}

	@Test
	public void customerDetails() {

	}

	@Test
	public void UserAdvancedsearch() {

	}

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation setup\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://tst.lindelink.com/INTERSHOP/web/WFS/SLDSystem");
		WebElement login = driver.findElement(By.id("LoginForm_Login"));
		login.sendKeys("admin");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("LoginForm_Password"));
		password.sendKeys("!InterShop00!");
		Thread.sleep(2000);
		WebElement Domain = driver.findElement(By.id("LoginForm_RegistrationDomain"));
		Domain.sendKeys("Linde");
		Thread.sleep(2000);
		WebElement CLick_login = driver.findElement(By.xpath("//input[@name='submit']"));
		CLick_login.click();
		Thread.sleep(2000);
		WebElement CLick_Dropdown = driver.findElement(By.xpath("//button[@type='button']//span[.='Linde']"));
		CLick_Dropdown.click();
		Thread.sleep(2000);
		WebElement SelectChannel = driver.findElement(By.xpath("//label[@class='ui-corner-all']/span[text()='Linde Business']"));
		SelectChannel.click();
		Thread.sleep(2000);
	}

}
