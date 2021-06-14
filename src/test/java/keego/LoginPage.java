package keego;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class LoginPage {

	static WebDriver driver;
	static ExtentHtmlReporter htmlReporter;
	static ExtentReports extentReport;
	static ExtentTest extentTest;

	@Before
	public void beforeCenario(Scenario cenario2) throws InterruptedException {
		if (extentReport == null) {
			extentReport = new ExtentReports();
			htmlReporter = new ExtentHtmlReporter("src/test/resources/htmlReporter.html");
			extentReport.attachReporter(htmlReporter);
		}

		extentTest = extentReport.createTest(cenario2.getId());

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static ExtentTest getExtentTest() {
		return extentTest;
	}

	public void checkPage() throws InterruptedException {
		driver.navigate().to("http://advantageonlineshopping.com/#/");
		Thread.sleep(4000);
		if (driver.findElement(By.id("Layer_1")).isEnabled()) {
			System.out.println("Test 2 Pass");
		} else {
			System.out.println("Test 2 Fail");
		}
		;
	}

	public void clicaMenu() {
		if (driver.findElement(By.id("menuUser")).isEnabled()) {
			System.out.println("Test 2 Pass");
		} else {
			System.out.println("Test 2 Fail");
		}
		;
		driver.findElement(By.id("menuUser")).click();
	}

	public void preencherDadosLogin() {
		driver.findElement(By.xpath("//input[@name='username']")).isEnabled();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Teste10");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Keys.TAB + "Abcd1234");

		if (driver.findElement(By.id("sign_in_btnundefined")).isEnabled()) {
			System.out.println("Test 2 Pass");
		} else {
			System.out.println("Test 2 Fail");
		}
		;

	}

	public void botaoLogar() {

		if (driver.findElement(By.id("sign_in_btnundefined")).isEnabled()) {
			System.out.println("Test 2 Pass");
		} else {
			System.out.println("Test 2 Fail");
		}
		;
		driver.findElement(By.id("sign_in_btnundefined")).click();

	}

	public void logado() {
		if (driver.findElement(By.id("menuUserLink")).isEnabled()) {
			System.out.println("Test 2 Pass");
		} else {
			System.out.println("Test 2 Fail");
		}
		;

	}

	public void checkUser() {
		driver.findElement(By.id("menuUserLink")).click();
		driver.findElement(By.xpath("//*[@id=\'loginMiniTitle\']/label[1]")).click();

	}
	
	@After
	public void afterCenario(Scenario cenario2) {
		extentTest.log(Status.PASS, "Cenario " + cenario2.getName() + " executado com sucesso!");
		extentReport.flush();
		driver.close();
	}
}
